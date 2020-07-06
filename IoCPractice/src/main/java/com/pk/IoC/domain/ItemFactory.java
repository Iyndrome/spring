package com.pk.IoC.domain;

public class ItemFactory {
	//Item 클래스의 인스턴스를 만들어서 
	//리턴하는 메소드 
	public static Item create() { //인스턴스 변수를 안쓰면 빠르게 처리하기위해 static으로 만들자
		Item item = new Item();
		return item;
	}
}
