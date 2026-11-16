package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}

	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire) {
		int gage = getArgent() / 10;
		parler(beneficiaire.getNom() + " prends ces " + gage + " sous");
		beneficiaire.recevoir(gage);
		perdreArgent(gage);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force_adverse=adversaire.getReputation();
		int force=honneur*2;
		if (force>=force_adverse) {
			parler("Je t'ai eu petit yakuza!");
			int gain= adversaire.perdre();
			gagnerArgent(gain);
			honneur+=1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			int perte=getArgent();
			adversaire.gagner(perte);
			honneur-=1;
		}
	}

}
