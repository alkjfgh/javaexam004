package abstractExam;

public class AbstractSub02 extends AbstractSuper {

	public AbstractSub02(int a, double b) {
		this.x = a;
		this.y = b;
	}

	@Override
	public void printResult() {
		System.out.println("삼각형의 넓이 : " + x * y / 2);
	}

}
