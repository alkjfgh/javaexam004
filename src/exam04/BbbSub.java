package exam04;

public class BbbSub extends AaaSuper {
	String address = "경기도";

	public BbbSub() {
		super();
	}

	public void printAddress() {
		System.out.println(address); // 자기 자신의 필드
		System.out.println(name); // 부모 클래스의 필드
		System.out.println(this.no); // 부모 클래스의 필드
	}

	@Override
	public void dataPrint(String message) {
		super.no = 2000301;
		super.name = "쬬";
		super.dataPrint("Super");
		System.out.println("슈퍼 클래스의 dataPrint를 재 정의");
	}
}