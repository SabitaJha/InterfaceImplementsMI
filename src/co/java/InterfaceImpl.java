package co.java;

public class InterfaceImpl implements InterfaceA, InterfaceB, InterfaceC {
  
	@Override
	public void dosomething(){
		System.out.println("dosomething with concrete class");
	}
		
		public static void main(String[] args){
			InterfaceA objA = new InterfaceImpl();
			InterfaceB objB = new InterfaceImpl();
			InterfaceC objC = new InterfaceImpl();
			
			objA.dosomething();
			objB.dosomething();
			objC.dosomething();
		}
	
	
}
