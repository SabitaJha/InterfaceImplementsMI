package co.java;

public class PlainSuits extends BoutiqueDecorator{
	  //store the value which is coming from testdecorator as a ref. like here suits
		private final Boutique suits;
		
		public PlainSuits (Boutique suits) {
			//this is invoke constructor and this is used for current object and mostly object 
			//variable not the local variable
			this.suits = suits;
		}
		//again we are doing overriding the method from interface
		@Override
		public String getdesc() {
			return suits.getdesc() +", PlainSuits(500)";
		}
					
		@Override
		public float getprice() {
				return suits.getprice()+500;
			}
}
		
