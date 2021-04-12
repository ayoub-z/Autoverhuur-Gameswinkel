public class Zwembad {
	double breedte;
	double lengte;
	double diepte;
	double inhoud;

	public Zwembad(double breedte, double lengte, double diepte){
		this.breedte = breedte;
		this.lengte = lengte;
		this.diepte = diepte;
	}

	public double getBreedte() {
		return breedte;
	}

	public double getLengte() {
		return lengte;	
	}

	public double getDiepte() {
		return diepte;		
	}

	public double getInhoud() {
		return (breedte * lengte * diepte);			
	}	


	public void setBreedte(double newBreedte) {
		this.breedte = newBreedte;
	}

	public void setDiepte(double newLengte) {
		this.lengte = newLengte;
	}	

	public void setLengte(double newDiepte) {
		this.diepte = newDiepte;
	}

	public String toString() {
		return "GEGEVENS ZWEMBAD: Dit zwembad is " + getBreedte() +
				" meter breed, " + getLengte() +
				" meter lang, en " + getDiepte() +
				" meter diep";
	}

	public static void main(String[] args) {
		Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
		System.out.println("BREEDTE: " + z1.getBreedte());
		System.out.println("LENGTE: " + z1.getLengte());
		System.out.println("DIEPTE: " + z1.getDiepte());		
		System.out.println("BEREKENDE INHOUD: " + z1.getInhoud());
		Zwembad z2 = new Zwembad(0.0, 0.0, 0.0);
		z2.setBreedte(2.5);
		z2.setLengte(100.0);
		z2.setDiepte(2.0);				
		System.out.println(z2);
		System.out.println("BEREKENDE INHOUD: " + z2.getInhoud());
	}		
}


