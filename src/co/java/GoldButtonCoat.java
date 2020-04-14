package co.java;

public class GoldButtonCoat extends BoutiqueDecorator{
	  
		private final Boutique coat;
		
		public GoldButtonCoat(Boutique coat) {
			this.coat = coat;
		}
		
		@Override
		public String getdesc() {
			return coat.getdesc() +", GoldButtonCoat(6000)";
		}
					
		@Override
		public float getprice() {
				return coat.getprice()+6000;
			}
		
	}
 


