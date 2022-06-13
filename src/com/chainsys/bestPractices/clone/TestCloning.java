package com.chainsys.bestPractices.clone;

public class TestCloning {
	public static void main(String[] args) {
		Student firstStudent = new Student();
		firstStudent.name = "prithivi";
		firstStudent.age = 21;
		System.out.println("first student:" + firstStudent.hashCode());
		try {
			Student thirdStudent = firstStudent;
			Student secondStudent = (Student) firstStudent.clone();
			System.out.println(secondStudent.name);
			System.out.println(secondStudent.age);
			System.out.println("third student:" + thirdStudent.hashCode());
			System.out.println("second student:" + secondStudent.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}