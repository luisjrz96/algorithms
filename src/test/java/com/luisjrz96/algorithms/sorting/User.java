package com.luisjrz96.algorithms.sorting;

public class User implements Comparable<User>{

	private int age;
	private String name;
	private String phoneNumber;

	public User() {}

	public User(int age, String name, String phoneNumber) {
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}

	
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	public int compareTo(User user) {
		return (this.age < user.age)? -1: (this.age > user.age)? 1: 0;
	}
	
	public static class UserBuilder{
		private User user;
		
		public UserBuilder() {
			this.user = new User();
		}
		
		public UserBuilder name(String name) {
			user.setName(name);;
			return this;
		}
		
		public UserBuilder age(int age) {
			user.setAge(age);
			return this;
		}
		
		public UserBuilder phoneNumber(String phoneNumber) {
			user.setPhoneNumber(phoneNumber);
			return this;
		}
		
		public User build() {
			return user;
		}		
	}
}
