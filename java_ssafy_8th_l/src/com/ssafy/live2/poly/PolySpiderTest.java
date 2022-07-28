package com.ssafy.live2.poly;

import com.ssafy.live2.person.*;


public class PolySpiderTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커",false);
		//다형성
		SpiderMan sman2= sman;
		Person person = sman;
		Object obj = person;
		
		//뭐든 담는 만능 주머니
		Object[] objs = new Object[4];
		objs[0]=sman;
		objs[1]="hello";
		objs[2]=objs;
		objs[3]=1; //기본형도 된다? 이유는 자동으로 Integer로 래핑이 되기 때문
		
		for(Object o : objs) {
			System.out.println(o.getClass().getName());
		}
		//objs[0].jump();  //Object 타입이라 SpiderMan의 메소드가 사용안됨
		((SpiderMan) objs[0]).jump();  //이렇게 캐스팅 해야 가능

	}

}
