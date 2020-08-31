package exam04;

public class Lecture01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AaaSuper obj01 = new AaaSuper();
		obj01.dataPrint("AaaSuper타입의 메소드 실행");
		
		Object obj02 = new AaaSuper();
		// obj02.dataPrint("Object타입의 메소드 실행"); dataPrint는  AaaSuper타입의 메소드 이므로  Object타입의 obj02는 쓸 수 없다
		((AaaSuper)obj02).dataPrint("Object타입의 메소드 실행"); // Object타입을 AaaSuper타입으로 변환하면 실행이 가능해진다
	}

}
