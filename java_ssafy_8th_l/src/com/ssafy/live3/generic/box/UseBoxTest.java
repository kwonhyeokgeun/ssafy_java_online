package com.ssafy.live3.generic.box;

public class UseBoxTest {

    public static void main(String[] args) {
        useNormalBox();
        useGenericBox();
        useNumberBox();
    }

    private static void useNormalBox() {
        // TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
    	NormalBox nbox = new NormalBox();
    	nbox.setSome(1);
    	nbox.setSome("hello");
    	Object obj = nbox.getSome(); //Object로 밖에 못꺼냄
    	
    	if(obj instanceof String) { //그래서 이렇게 번거러움게 타입체크하고 형변환해야함 
    		String str=(String)obj;
    		System.out.println(str);
    	}
    	
        // END:
    }

    private static void useGenericBox() {
        // TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.
    	GenericBox<String> sbox = new GenericBox<>();
    	sbox.setSome("Hello");
    	String str=sbox.getSome();
    	System.out.println(str);
        // END:
    }

    private static void useNumberBox() {
        // TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.
    	NumberBox<Number> numbox = new NumberBox<>();
    	numbox.addSome(1, 10L, 3.14);
    	NumberBox<Double> numbox2 = new NumberBox<>();
    	NumberBox<String> numbox3 = new NumberBox<>(); //에러
        // END:
    }

}
