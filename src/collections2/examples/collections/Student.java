package collections2.examples.collections;

public class Student {

	private String studentId;
	private String name;

	/**
	 * @param studentId
	 * @param name
	 */
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	/**
	 * @return the studentId
	 */
	public final String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public final void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}

}
