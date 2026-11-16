package personnages;

public class Yakusa extends Humain{
	private String clan;
	private int reputation=0;

	public Yakusa(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		int butin;
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		butin=victime.seFaireExtorquer();
		gagnerArgent(butin);
		reputation+=1;
		parler("J'ai piqué les "+butin+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}

}
