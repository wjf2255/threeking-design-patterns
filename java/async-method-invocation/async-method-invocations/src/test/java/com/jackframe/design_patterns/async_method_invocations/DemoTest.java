package com.jackframe.design_patterns.async_method_invocations;

public class DemoTest {

	public static void main(String[] args) {
		Student student1 = new Student("Ashok", "Kumar", 9.5);
		student1 = PreidcateConsumerDemo.updateStudentFee(student1,
		// Lambda expression for Predicate interface
				student -> student.getGrade() > 8.5,
				// Lambda expression for Consumer inerface
				student -> student.setFeeDiscount(30.0));

		student1.printFee();
		
		Student student2 = new Student("Rajat", "Verma", 8.0);
		student2 = PreidcateConsumerDemo.updateStudentFee(student2,
				student -> student.getGrade() >= 8,
				student -> student.setFeeDiscount(20.0));
		student2.printFee();
	}
}
