package com.ssafy.live2.person;

public class Person {
	public String name = "피터파커";
	
	Person(String name){
		this.name=name;
	}
	void jump() {
		System.out.println("두다리로 폴짝 점프");
	}
	void eat() {
		System.out.println("냠냠");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

}
