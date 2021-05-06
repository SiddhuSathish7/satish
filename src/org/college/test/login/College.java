package org.college.test.login;

public class College {
	private void collegeName() {
System.out.println("College Name is SRM");
	}
    private void collegeCode() {
System.out.println("College code is 543");
	}
    private void collegeRank() {
System.out.println("Rank is One");
	}
    public static void main(String[] args) {
		College co = new College();
		Student st = new Student();
		Hostel ho = new Hostel();
		Dept de = new Dept();
		co.collegeName();
		co.collegeCode();
		co.collegeRank();
		st.studentName();
		st.studentDept();
		st.studentId();
		ho.hostelName();
		de.deptName();
	}
}
