package com.design_pattern.creational_design_pattern.builder_pattern;

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;

	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public static class Builder {

		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		private String address;

		public Builder() {
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

	@Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
