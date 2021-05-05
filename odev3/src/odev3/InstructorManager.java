package odev3;

public class InstructorManager extends UserManager {
	public void courseInformation(Instructor instructor) {
		System.out.println(instructor.getInstructorLesson()+ " kursu " +  instructor.getFirstName() + instructor.getLastName() + " tarafýndan verilmektedir.");
	}
}
