package com.ssafy.live3.abs;

// TODO: Vehicle을 상속받는 구조로 변경해보자.
 public class ElectricCar extends Vehicle {
		
	public void addFuel() {
	    System.out.printf("차종: %s: 연료 주입: %s%n", this.getClass().getSimpleName(), "충전");
	}
}
