package Encapsulation;

public class TestHuman {

	public static void main(String[] args) {
		Human info = new Human();
		info.setAge(26);
		info.setColor("brown");
		info.setHeight(5.2);
		info.setName("Farhana");
		info.setRelegious("Muslim");
		
		System.out.println("My name is"+" "+info.getName()+"age is"+" "+info.getAge()+"i am"+" "+info.getColor()+"my height is"+" "+info.getHeight()+"and i am"+" "+info.getRelegious());
		
	}

	}


