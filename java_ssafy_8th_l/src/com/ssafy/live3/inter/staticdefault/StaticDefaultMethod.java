package com.ssafy.live3.inter.staticdefault;

interface Aircon {
    void makeCool();
    
    // TODO: 2. 건조기능을 추가해보자.
    
    //void dry();  //기능이 추가됨 ->오버라이딩 에러가 발생됨
    default void dry() {  //기능이 추가됨 ->디폴트라 에러 안남
    	System.out.println("건조해야해");
    }
    // END:
    
    // TODO: 3.Aircon이 동작 방식에 대해 설명해보자.
    // END:
    
}

class OldisButGoodies1 implements Aircon{
    @Override
    public void makeCool() {
        System.out.println("전체 냉각해줘");
    }
}

class OldisButGoodies2 implements Aircon{
    @Override
    public void makeCool() {
        System.out.println("집중 냉각해줘");
    }
}

// TODO: 1. 무풍 에어컨을 구현해보자.
class NoWind1 implements Aircon{

	@Override
	public void makeCool() {
		System.out.println("바람은 없지만 시원해~");
	}
	
	public void dry() {
		System.out.println("종료되면 건조시켜 줘"); //여기서만 dry를 오버라이딩함
	}
	
}
// END:

public class StaticDefaultMethod {
    public static void main(String[] args) {
        Aircon [] aircons = {new OldisButGoodies1(), new OldisButGoodies2()};
        for(Aircon aircon: aircons) {
            if(aircon==null) {
                continue;
            }
            aircon.makeCool();
        }
    }
}
