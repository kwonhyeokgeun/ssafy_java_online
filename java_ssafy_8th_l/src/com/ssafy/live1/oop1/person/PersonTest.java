package com.ssafy.live1.oop1.person;

public class PersonTest {

	public static void main(String[] args) {
		Person p= new Person();
		p.name="홍길동";
		p.age=30;
		p.isHungry=true;
		p.eat();
		System.out.println(p.name+" : "+p.isHungry);
		
		Person p2= new Person();
		p2.name="싸피";
		p2.age=30;
		p2.isHungry=true;
		p2.work();
		System.out.println(p2.name+" : "+p2.isHungry);
		

	}

}
