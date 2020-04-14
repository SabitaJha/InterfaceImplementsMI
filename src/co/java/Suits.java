package co.java;
//Here we add suits and implements with boutique and override the method or function which are 
//desc and price
public class Suits implements Boutique {
 
	@Override
	public String getdesc() {
		return "Suits(1000)";
	}
	
	@Override
	public float getprice() {
		return 1000;
	}
}

