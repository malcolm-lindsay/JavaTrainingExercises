package mavenFirst;

public interface StringLambdasPractise {

	String operation(String a, String b);

	StringLambdasPractise concatenation = (a, b) -> a + b;

}