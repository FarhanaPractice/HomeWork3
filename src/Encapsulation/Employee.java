package Encapsulation;

/*binding data with methods
 * 
 */

public class Employee {
	private int num;
	private String name;
	private int ID;
	private char group;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public char getGroup() {
		return group;
	}
	public void setGroup(char group) {
		this.group = group;
	}
	

}
