package abstractExam;

public class AbstractSub03 extends AbstractSuper {

	public AbstractSub03(double a) {
		this.y = a;
	}

	@Override
	public void printResult() {
		System.out.println("원의 넓이 : " + y * y + "π");
	}

}
