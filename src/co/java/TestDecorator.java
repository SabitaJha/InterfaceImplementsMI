package co.java;
// here we make a class testdeco with public args and we make a new objects for all concrete class
public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface with ref in left side and right side we have new object
		Boutique saare = new Saare();
		
		
		// here we have ref in left side and in right side we have new object where we have concrete
		//class with ref. and print both method for all 3 class.
		saare = new SilkSaare(saare);
		saare = new BanarsiSilk(saare);

		System.out.println("Description :"+ saare.getdesc());
		System.out.println("Price "+ saare.getprice());
		
        Boutique coat = new Coat();
		
		coat = new GoldButtonCoat(coat);
		coat = new SilverButtonCoat(coat);

		System.out.println("Description :"+ coat.getdesc());
		System.out.println("Price "+ coat.getprice());
		
       Boutique suits = new Suits();
		
       suits = new PlainSuits(suits);
       suits = new DesignerSuits(suits);

		System.out.println("Description :"+ suits.getdesc());
		System.out.println("Price "+ suits.getprice());
	}

}
