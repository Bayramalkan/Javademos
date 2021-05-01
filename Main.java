package odev3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Bayram");
		user.setLastName("ALKAN");
		user.setUserNumber("1");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Erkan");
		instructor.setLastName(" ALKAN");
		instructor.setUserNumber("01");
		instructor.setInstructorLesson("C++");
		instructor.setInstructorNumber("2");
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("Mehmet Rıza");
		student.setLastName("ALKAN");
		student.setUserNumber("01");
		student.setStudentNumber("04");
		
		Student student2 = new Student();
		student2.setId(4);
		student2.setFirstName("Fadime");
		student2.setLastName("ALKAN");
		student2.setUserNumber("02");
		student2.setStudentNumber("03");
		
		System.out.println(user.getFirstName() +  user.getLastName());
		
		System.out.println("--------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.remove(user);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseInformation(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getStudent(student);
		studentManager.getStudent(student2);
	}

}
