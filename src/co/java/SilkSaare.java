package co.java;

public class SilkSaare extends BoutiqueDecorator{
  
	private final Boutique saare;
	
	public SilkSaare (Boutique saare) {
		this.saare = saare;
	}
	
	@Override
	public String getdesc() {
		return saare.getdesc() +", SilkSaare(500)";
	}
				
	@Override
	public float getprice() {
			return saare.getprice()+500;
		}
	
}
