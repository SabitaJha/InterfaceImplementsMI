package co.java;

public class BanarsiSilk extends BoutiqueDecorator{
	  
		private final Boutique saare;
		
		public BanarsiSilk(Boutique saare) {
			this.saare = saare;
		}
		
		@Override
		public String getdesc() {
			return saare.getdesc() +", BanarsiSilk(600)";
		}
					
		@Override
		public float getprice() {
				return saare.getprice()+600;
			}
		
	}
