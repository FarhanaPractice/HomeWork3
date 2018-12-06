package Interface;

public class BIU implements University{

	public void auditorium() {
		System.out.println("they have extra auditorium");
	}
	 
	public void garden() {
		System.out.println("they have a garden");
	}

	@Override
	public void student() {
		System.out.println("it has number of student");
		
	}

	@Override
	public void campus() {
		System.out.println("it has it's own campus");
		
	}

	@Override
	public void office() {
		System.out.println("they have main office");
		
	}

	@Override
	public void library() {
		System.out.println("it has a library");
		
	}

	@Override
	public void field() {
		System.out.println("it has a big field");
		
	}

	@Override
	public void teacher() {
		System.out.println("it has number of teacher");
		
	}

}
