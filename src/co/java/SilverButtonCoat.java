package co.java;

public class SilverButtonCoat extends BoutiqueDecorator{
	  
		private final Boutique coat;
		
		public SilverButtonCoat(Boutique coat) {
			this.coat = coat;
		}
		
		@Override
		public String getdesc() {
			return coat.getdesc() +", SilverButtonCoat(2000)";
		}
					
		@Override
		public float getprice() {
				return coat.getprice()+2000;
			}
		
	

}
