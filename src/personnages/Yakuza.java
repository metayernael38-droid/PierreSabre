package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		int butin;
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		butin = victime.seFaireExtorquer();
		gagnerArgent(butin);
		reputation += 1;
		parler("J'ai piqué les " + butin + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int perte=getArgent();
		perdreArgent(perte);
		reputation-=1;
		parler("J'ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+clan);
		return perte;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation+=1;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous");
	}

}
