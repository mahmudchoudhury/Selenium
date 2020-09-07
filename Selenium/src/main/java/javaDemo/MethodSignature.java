package javaDemo;

public class MethodSignature {

	public static void main(String[] args) {

		//Syntax of object creation
				// className obj = new calssName();
				
				MethodSignature obj = new MethodSignature();
				
				//MethodSignature obj = new MethodSignature();
				
			obj.driving();
			obj.horn();
			obj.CarBreak();
			obj.miror();
			obj.tipu();
			obj.rumman();
			obj.eat();
			obj.java();
			
				
				/*obj.driving();
				obj.horn();
				obj.CarBreak();
				obj.mioor();
				obj.tipu();
				obj.rumman();
				obj.eat();
				obj.java();*/
							
				
				//Through an error- we can'nt call non-static method inside static method
				//driving();

			}
			
			//A method have 4 things
			//public- Access Modifier
			//void- return type
			//driving()- Method name
			//Method body- { System.out.println("I am Driving");}
			
			public void driving() {
				
				System.out.println("I am Driving"); //method Body
			}

			private void horn() {
				System.out.println("My car horn is vry good");
			}
			
			 void CarBreak() {
				System.out.println("Car has break");
			}
			
			protected void miror() {
				System.out.println("Car has mioor");
			}
			public void tipu() {
				System.out.println("My name is Tipu");
			}
			private void rumman() {
				System.out.println("Rumman learns java well");
			}
			void eat() {
				System.out.println("I am eating");
			}
			
			protected void java() {
				System.out.println("We ar learning Java");
				
			}
			
		

	}


