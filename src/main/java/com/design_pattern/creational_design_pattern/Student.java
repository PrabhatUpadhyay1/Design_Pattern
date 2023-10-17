package com.design_pattern.creational_design_pattern;

import java.io.Serializable;

// SINGLETON DESIGN PATTERN (Lazy)
public class Student implements Serializable{
	private static Student student;

	private Student() {
		if (student != null) {
			throw new RuntimeException("You are tring to break singleton pattern");
		}
	}

	public static Student getInstance() {
		if (student == null) {
			synchronized (Student.class) {
				if (student == null) {
					student = new Student();
				}
			}
		}
		return student;
	}
	
	protected Object readResolve() {
		return student;
	}
}
