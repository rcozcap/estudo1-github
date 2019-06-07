package entities;

public class Notes {

	private double NP1;
	private double NP2;
	private String professor_name;
	private String discipline;


	public Notes(double nP1, double nP2, String professor_name, String discipline) {
		NP1 = nP1;
		NP2 = nP2;
		this.professor_name = professor_name;
		this.discipline = discipline;
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

	public String getProfessor_name() {
		return professor_name;
	}

	public void setProfessor_name(String professor_name) {
		this.professor_name = professor_name;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

}
