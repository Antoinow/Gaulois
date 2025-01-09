package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
		
		Romain minus = new Romain("Minus", 6);
		minus.parler(" UN GAU...UN GAUGAU...");
		for (int i =0;i<3;i++) {
		minus.recevoirCoup(3);
		}
		
		asterix.frapper(minus);
	}
}
