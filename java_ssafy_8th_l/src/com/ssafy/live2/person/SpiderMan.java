package com.ssafy.live2.person;

public class SpiderMan extends Person {
	boolean isSpider;
	Spider spider = new Spider();
	
	public SpiderMan(String name, boolean isSpider){
		super(name);
		this.isSpider = isSpider;
	}
	void fireWeb() {
		if(isSpider) {
			spider.fireWeb();
		}else {
			System.out.println("인간일때는 참자");
		}
	}
	@Override //오버라이드임을 알림. 이름이 잘못되면 알려줌
	public void jump() {
		if(isSpider) {
			spider.jump();
		}else {
			super.jump();
		}
	}
	@Deprecated //쓸수는 잇는데 쓰지 않는걸 권장할때 사용함
	void love() {
		System.out.println("메리제인 사랑해!");
	}
	@Override
	public String toString() {
		return super.toString()+" isSpider : "+isSpider;
	}
}
