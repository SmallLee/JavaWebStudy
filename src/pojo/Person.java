package pojo;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		System.out.println("=======hashCode");
		return age*31;
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("=======equals");
		Person person = (Person) obj;
		return this.name.equals(person.getName());
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}
