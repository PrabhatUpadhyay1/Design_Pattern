package com.design_pattern.creational_design_pattern;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student student = Student.getInstance();
		System.out.println(student.hashCode());
        Student instanceTwo = null;
		try {
            Constructor[] constructors = Student.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Student) constructor.newInstance();
                System.out.println(instanceTwo.hashCode());
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
}
