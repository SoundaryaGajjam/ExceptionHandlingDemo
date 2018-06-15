package com.scp.exceptionHandling;
class Base extends Exception{
	
}
class Derived extends Base{
	
}
public class DemoException {
	public static void main(String[] args) {
		try{
			throw new Derived();
		}
		catch(Base b){
			System.out.println("Caught base cls exception");
		}
		/*catch(Derived d){
			System.out.println("Caught derived cls exception");
		}*/
		
		/**
		 * In this case it will work.......
		 */
		/*catch(Derived d){
			System.out.println("Caught derived cls exception");
		}
		catch(Base b){
			System.out.println("Caught base cls exception");
		}*/
		
	}
}
