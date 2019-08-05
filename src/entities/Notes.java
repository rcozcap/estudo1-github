package entities;

public class Notes extends Student {

	private double NP1;
	private double NP2;

	public Notes() {
		super();
	}

	public Notes(String name, String email, double nP1, double nP2) {
		super(name, email);
		NP1 = nP1;
		NP2 = nP2;
	}

	public double getNP1() {
		return NP1;
	}

	public void setNP1(double nP1) {
		NP1 = nP1;
	}

	public double getNP2() {
		return NP2;
	}

	public void setNP2(double nP2) {
		NP2 = nP2;
	}

	
	@Override
	public String toString() {
		return super.toString();
	}

}
