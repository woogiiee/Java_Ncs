package ncs0612;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
	}
	
	public String toString() {return name+ " : "+age;}
	
	public int compareTo(Person p) {
		return this.age-p.age;
	}
}
