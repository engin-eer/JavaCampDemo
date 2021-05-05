package javaHomework3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setUserId(1);
		student.setFirstName("Engin");
		student.setLastName("Aydoðdu");
		student.setEmail("engin@engin.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engindemirog@gmail.com");
		
		System.out.println(student.getFirstName() + " " + student.getLastName());
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName());

	}

}
