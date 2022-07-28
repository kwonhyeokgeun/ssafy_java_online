package com.ssafy.live2.modifier.singleton;

class SingletonClass{
    // TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
	
	private static SingletonClass sc = new SingletonClass(); //private static이어야함
	private SingletonClass() { //private로 해야함
	}
	
	public static SingletonClass getSingletonClass() {  //static이어야함
		return sc;
	}
    // END:
    public void sayHello() {
      System.out.println("Hello");
    }
}  
  

  public class SingletonTest {
    public static void main(String[] args) {
      // TODO:SingletonClass를 사용해보세요.  
    	
    	//SingletonClass sc = new SingletonClass(); //이건 private라 안됨
    	SingletonClass sc = SingletonClass.getSingletonClass();
    	SingletonClass sc2 = SingletonClass.getSingletonClass();
    	
    	System.out.println(sc==sc2);
    }
  }
