class Klant{
	private String naam;
	private double kortingsPercentage;

	// constructor Klant
	public Klant(String nm){
		this.naam = nm;
	}		

	// setter for Korting
	public void setKorting(double kP){
		this.kortingsPercentage = kP;
	}

	// getter for Korting
	public double getKorting(){
		return this.kortingsPercentage;
	}
	
	// print Klant
	public String toString(){
		return "Op naam van: " + naam;		
	}
}

class Auto{
	private String type;
	private double prijsPerDag;

	// constructor Auto
	public Auto(String tp, double prPd){
		this.type = tp;
		this.prijsPerDag = prPd;
	}	

	// setter for prijsPerDag
	public void setPrijsPerDag(double prPd){
	this.prijsPerDag = prPd;
	}	

	// getter for prijsPerDag
	public double getPrijsPerDag(){
		return this.prijsPerDag;
	}
	
	// print Auto
	public String toString(){
		return null;		
	}
}

public class AutoHuur{
	int aantalDagen;
	Auto gehuurdeAuto;
	Klant huurder;
	private double totaalPrijs; 

	// constructor AutoHuur
	public AutoHuur(){
	}

	// setter for amount of days rented
	public void setAantalDagen(int aD){
		aantalDagen = aD;
	}

	// setter for Huurder
	public void setHuurder(Klant k){
		huurder = k;
	}	

	// getter for Huurder
	public Klant getHuurder(){
		return huurder;
	}	

	// setter for rented Auto
	public void setGehuurdeAuto(Auto gA){
		gehuurdeAuto = gA;
	}	

	// getter for rented Auto
	public Auto getGehuurdeAuto(Auto Auto){
		return Auto;
	}
	
	// getter for Huurder
	public Klant getHuurder(Klant Klant){
		return Klant;
	}	

	public double totaalPrijs(){
		this.totaalPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
		return this.totaalPrijs;
	}

	// print AutoHuur
	public String toString(){
		return "Aantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs;
	}
	public static void main(String[] args){
		AutoHuur ah1 = new AutoHuur();
		System.out.println("Eerste autohuur: " + ah1.toString());

		Klant k = new Klant("Mijnheer de vries");
		k.setKorting(10.0);
		ah1.setHuurder(k);
		System.out.println(ah1.toString());
	}
}

