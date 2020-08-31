package abstractExam;

public abstract class AbstractSuper { // 추상 클래스(abstract)
	// 추상 클래스는 직접 객체를 생성할 수 없다.
	// 반드시 상속을 통해서 사용하도록 하는 것이 목적이다.
	public int x;
	public double y;

	public abstract void printResult(); // 추상 메소드

}
