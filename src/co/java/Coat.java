package co.java;

public class Coat implements Boutique {

	@Override
	public String getdesc() {
		return "Coat(1000)";
	}
	
	@Override
	public float getprice() {
		return 1000;
	}
}
