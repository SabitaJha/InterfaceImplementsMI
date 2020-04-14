package co.java;

public class DesignerSuits extends BoutiqueDecorator{
	  
		private final Boutique suits;
		
		public DesignerSuits (Boutique suits) {
			this.suits = suits;
		}
		
		@Override
		public String getdesc() {
			return suits.getdesc() +", DesignerSuits(900)";
		}
					
		@Override
		public float getprice() {
				return suits.getprice()+900;
			}
} 