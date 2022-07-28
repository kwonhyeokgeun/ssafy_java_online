package com.ssafy.live2.person;

public class SpiderManTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커",true);
		sman.eat();
		sman.jump();
		sman.fireWeb();
		System.out.println();
		sman.isSpider=true;
		sman.eat();
		sman.jump();
		sman.fireWeb();
		System.out.println(sman.toString());
	}

}
