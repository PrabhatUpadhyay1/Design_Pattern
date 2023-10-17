package com.design_pattern.creational_design_pattern;

public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
