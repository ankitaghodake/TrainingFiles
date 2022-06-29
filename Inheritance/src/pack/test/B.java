package pack.test;

public class B extends A {
	private int hours;
	private int rate;

	public B(int salary, String name, int hours, int rate) {
		super(salary, name);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString() + hours * rate;
	}

	public boolean equals(Object b1) { // obj=b1 B=b
		B b = (B) b1;
		if (super.getSalary() == b.getSalary()
				&& super.getName() == b.getName() && b.hours == getHours()
				&& b.rate == getRate()) {
			return true;
		}
		return false;
	}

}
