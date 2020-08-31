package abstractExam;

public class AbstractSub01 extends AbstractSuper {

	public AbstractSub01(int a, double b) {
		super();
		this.x = a;
		this.y = b;
	}

	public AbstractSub01(double a, int b) {
		this(b, a);
	}

	public AbstractSub01(int a, int b) {
		this(a, (double) b);
	}

	public AbstractSub01(double a, double b) {
		this((int) a, b);
	}

	@Override
	public void printResult() {
		System.out.println("직사각형의 넓이 : " + x * y);
	}

}
