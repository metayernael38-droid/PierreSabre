package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int gage=getArgent()/10;
		parler(beneficiaire.getNom()+" prends ces "+gage+" sous");
		beneficiaire.recevoir(gage);
	}

	
}
