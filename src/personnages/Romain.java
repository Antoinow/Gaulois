package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void recevoirCoup(int coup) {
		force = force - coup;
		if (force>0) {
			
			parler("aie ");
		} else {
			force = 0;
			parler("jabandonne ");
		}

	}

	public void parler(String texte) {
		String chaine = "le romain " + getNom() + texte;
		System.out.println(chaine);
	}

}
