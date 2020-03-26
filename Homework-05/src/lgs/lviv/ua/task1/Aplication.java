package lgs.lviv.ua.task1;

public class Aplication {
	
	public static void main(String[] args) {
		
		Cow cow = new Cow(35.6, 10, "Bella", 8);
		System.out.println(cow);
		
		cow.voice();
		
		System.out.println();
		
		Cat k = new Cat(12.2, 55, "Garfield", 3);
		System.out.println(k);
		
		k.voice();
		
		System.out.println();
		
		Dog d = new Dog(19.5, 44, "Filya", 4);
		System.out.println(d);
		
		d.voice();
		
	}

}
