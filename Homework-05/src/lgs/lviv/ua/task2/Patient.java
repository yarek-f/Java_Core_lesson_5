package lgs.lviv.ua.task2;

public class Patient {
	
	private String name;
	private String sex;
	private int age;
	private boolean smoking;
	
	public Patient(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public Patient(String name, String sex, int age) {
		this(name, sex);
		this.age = age;
	}
	
	public Patient(String name, String sex, int age, boolean smoking) {
		this(name, sex, age);
		this.smoking = smoking;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", sex=" + sex + ", age=" + age + ", smoking=" + smoking + "]";
	}
	
	
	

}
