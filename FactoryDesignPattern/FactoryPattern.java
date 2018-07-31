package FactoryDesignPattern;

// 팩토리 패턴
// SuperClass가 존재하고 여러개의 SubClass가 존재할 때 객체 생성의 로직을 노출 시키지 않고
// input에 따른 하나의 Subclass를 반환해야할 때 사용한다.
// 팩토리 패던에서 Subclass는 interface, class, abstract class가 될 수 있다.


public class FactoryPattern {
	
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("circle");
		shape1.draw();
		
		Shape shape2 = sf.getShape("square");
		shape2.draw();
		
		Shape shape3 = sf.getShape("rectangle");
		shape3.draw();
	}
	
	

}

