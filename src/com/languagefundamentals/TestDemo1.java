package com.languagefundamentals;

public class TestDemo1 {
	int stu_id=10;
	String stu_name="kinnu";

	void displayMessage() {
		String message = "Identifiers!";
		System.out.println(message);
	}

	public static void main(String[] args) {
		TestDemo1 id = new TestDemo1();
		TestDemo1 A = new TestDemo1();
		id.displayMessage();
		System.out.println("student id=" + id.stu_id);
		System.out.println("student name=" + A.stu_name);
	}
}
