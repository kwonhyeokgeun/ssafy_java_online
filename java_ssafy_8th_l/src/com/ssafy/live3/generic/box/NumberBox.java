package com.ssafy.live3.generic.box;

public class NumberBox<T extends Number> {//T는 Number를 상속받은 녀석만
	public void addSome(T...ts) {
		double sum=0;
		for(T t: ts) {
			sum+=t.doubleValue();
		}
		System.out.println(sum);
	}
}
