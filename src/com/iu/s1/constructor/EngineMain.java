package com.iu.s1.constructor;

public class EngineMain {

	public static void main(String[] args) {
		Engine engine = new Engine();
		System.out.println("객체 생성 후 대입"); // 4번
		engine.name="V4";
		engine.fuel="F4";
		engine.info();

	}

}
