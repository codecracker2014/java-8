package com.java8.lembda;

public class TestLembdas {

	public static void main(String[] args) {

		Apple greenApple=new Apple();
		greenApple.setColor("green");
		greenApple.setName("greenApple");
		
		Apple redApple=new Apple();
		redApple.setColor("red");
		redApple.setName("redApple");
		testCondition(greenApple,redApple,(e1, e2)->{return e1.equals(e2);});
		
		
	}
	public static  void testCondition(Apple greenApple,Apple redApple,MyPredicate myPredicate)
	{
		System.out.println(myPredicate.testCondition(greenApple,redApple));
	}

}
