package lgs.lviv.ua.task1;

public abstract class Pet {
	
	private double size;
	private int speed;
	
	public Pet(double size, int speed) {
		super();
		this.size = size;
		this.speed = speed;
	}
	
	abstract void voice();

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Pet [size=" + size + ", speed=" + speed + "]";
	}
	
}
