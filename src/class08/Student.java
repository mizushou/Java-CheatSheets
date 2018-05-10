package class08;

public class Student extends Person {

	private String studentID;

	public Student(String name, String studentID) {
		super(name);
		setStudentID(studentID);
	}

	public final String getStudentID() {
		return studentID;
	}

	public final void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", getName()=" + getName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object that) {

		if (that == null) {
			return false;
		}

		if (this == that) {
			return true;
		}

		if (!(that instanceof Student)) {
			return false;
		}

		Student s = (Student) that;
		if (this.studentID.equals(s.studentID)) {
			return true;
		}

		return false;
	}

}
