package abstractExam;

public class UseMain {

	public static void main(String[] args) {
//		AbstractSuper obj1 = new AbstractSub01(10, 30);
//		AbstractSuper obj2 = new AbstractSub02(10, 30);
		proc(new AbstractSub01(10, 30)); // 직사각형
		proc(new AbstractSub02(10, 30)); // 삼각형
		proc(new AbstractSub03(10)); // 원
	}

	public static void proc(AbstractSuper obj) {
		obj.printResult();
	}

}
