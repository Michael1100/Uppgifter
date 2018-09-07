
public class person {

	String name;
	int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	public static void main(String[] args) {
		person Michael = new person("Michael",18);
		person jaok = new person("jaok",91);
		person pelle = new person("pelle",42);
		person.oldestperson(Michael, jaok);
	}
	
	public static void oldestperson(person p1, person p2) {
		if(p1.age>p2.age) {
			System.out.println(p1.name);	
		}
		else {
			System.out.println(p2.age);
		}
	}
}
