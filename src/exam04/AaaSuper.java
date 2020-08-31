package exam04;

public class AaaSuper {
	public int no;
	public String name;

	public AaaSuper() {
		super();
		this.no = 1997503;
		this.name = "SangHa";
	}

	public AaaSuper(String irum) {
		this();
		no = 1980220;
		name = irum;
	}

	public AaaSuper(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public AaaSuper(String name, int no) {// 순서가 바뀌어도 정상 작동 하도록 한다
		this(no, name);
	}

	public void dataPrint(String message) {
		System.out.println(message);
		System.out.println(this.no + "\t" + name);
	}
}
