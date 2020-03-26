package lgs.lviv.ua.task2;

public class MainHospital {

	public static void main(String[] args) {
		
		Patient p1 = new Patient("Vasya", "male");
		System.out.println(p1);
		
		System.out.println();
		
		Patient p2 = new Patient("Kateryna", "female", 51);
		System.out.println(p2);
		
		System.out.println();

		Patient p3 = new Patient("Max", "male", 72, true);
		System.out.println(p3);
		
	}

}
