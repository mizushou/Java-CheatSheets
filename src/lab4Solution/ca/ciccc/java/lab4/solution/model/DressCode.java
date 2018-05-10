package lab4Solution.ca.ciccc.java.lab4.solution.model;

public enum DressCode {

	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	private final String description;

	private DressCode(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
