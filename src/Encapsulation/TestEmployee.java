package Encapsulation;

public class TestEmployee {
	
	

	public static void main(String[] args) {
		Employee info = new Employee();
		info.setGroup('A');
		info.setID(123);
		info.setName("Farhana");
		info.setNum(1);
		
		System.out.println("My name is"+" "+ info.getName()+", "+"my ID no is"+" "+info.getID()+", "+"and roll no is"+" "+info.getNum()+", "+"group is"+" "+info.getGroup()+".");
		

}
		
	}


