package com.example.test;

import com.example.entity.StudentDetails;

public class TestDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails S = StudentDetails.builder().student_RollNo(1).student_name("Prasad").student_Class(8)
				.student_Division("A").build();
		System.out.println(S.getStudent_RollNo() + " " + S.getStudent_name() + " " + S.getStudent_Class() + " "
				+ S.getStudent_Division());
	}

}
