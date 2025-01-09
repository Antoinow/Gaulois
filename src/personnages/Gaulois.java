package personnages;

public class Gaulois {

	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler() {
		String chaine = "le gaulois" + getNom() + ": Bonjour a tous";
		System.out.println(chaine);
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la machoir de " + nomRomain);
		romain.recevoirCoup(force / 3);

	}

}
