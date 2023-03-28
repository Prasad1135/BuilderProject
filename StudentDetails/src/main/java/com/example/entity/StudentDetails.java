package com.example.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Builder
@Getter
public class StudentDetails {
	private int student_RollNo;
	private String student_name;
	private int student_Class;
	private String student_Division;
}
