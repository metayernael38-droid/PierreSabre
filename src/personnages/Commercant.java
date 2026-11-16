package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int butin=getArgent();
		perdreArgent(butin);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return butin;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercies généreux donateur !");
	}
}
