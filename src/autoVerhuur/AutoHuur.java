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
		return "Op naam van: " + naam + " (Korting: " + kortingsPercentage + "%)";		
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
		return "autotype: " + type + " met prijs per dag: " + prijsPerDag;		
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
	public String getGehuurdeAuto(){
		return gehuurdeAuto.toString();
	}
	
	// getter for Huurder
	public Klant getHuurder(Klant Klant){
		return Klant;
	}	

	public double totaalPrijs(){
		this.totaalPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
		this.totaalPrijs = totaalPrijs - (totaalPrijs * huurder.getKorting() / 100);
		
		return this.totaalPrijs;
	}

	// print AutoHuur
	public String toString(){
		if (this.huurder == null && this.gehuurdeAuto == null){
			return "\ter is geen auto bekend" + "\n\tEr is geen huurder bekend" +
			"\n\tAantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs;
		}
		else if (this.huurder != null && this.gehuurdeAuto == null){
			return "\tAantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs() +
			"\n" + huurder.toString() + "\n\n" + this.gehuurdeAuto;			
		}
		else{ 
			return "\t" + gehuurdeAuto.toString() + "\n\t" + huurder.toString() + 
			"\n\tAantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs();
			
		}
	}
	public static void main(String[] args){
		AutoHuur ah1 = new AutoHuur();
		AutoHuur ah2 = new AutoHuur();
		System.out.println("\nEerste autohuur: \n" + ah1.toString());

		Klant k = new Klant("Mijnheer de vries");
		k.setKorting(10.0);
		ah1.setHuurder(k);
		Auto a1 = new Auto("Peugot 207", 50.0);
		ah1.setGehuurdeAuto(a1);
		ah1.setAantalDagen(4);

		Auto a2 = new Auto("Ferrari", 3500);
		ah2.setGehuurdeAuto(a2);
		ah2.setHuurder(k);
		ah2.setAantalDagen(1);

		System.out.println("\nEerste autohuur: \n" + ah1.toString());
		System.out.println("\nTweede autohuur: \n" + ah2.toString());

		System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
		System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());		
	}
}

