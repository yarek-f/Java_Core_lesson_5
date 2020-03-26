package lgs.lviv.ua.task1;

public class Dog extends Pet{
	
	private String name;
	private int age;
	
	public Dog(double size, int speed, String name, int age){
		super(size, speed);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", getSize()=" + getSize() + ", getSpeed()=" + getSpeed() + "km/h]";
	}

	@Override
	void voice() {
		System.out.println("I'm dog - gaw-gaw-gaw");		
	}
	
	

}
