package personnages;

public class Humain {
	private String nom;
	private String boisson_fav;
	private int argent;
	
	public Humain(String nom, String boisson_fav, int argent) {
		super();
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson_fav() {
		return boisson_fav;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println(nom+" : "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson_fav);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	public void acheter(String bien,int prix) {
		if (prix<argent) {
			if (bien==boisson_fav) {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une boisson à "+prix+" sous");
			} else {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous");
			}
			perdreArgent(prix);
		} else {
			parler("Je n'ai que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous");
		}
	}
	
	
	
}
