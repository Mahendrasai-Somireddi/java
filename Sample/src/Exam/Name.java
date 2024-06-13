package Exam;

public class Name implements Sample1,Sample2{
	public void sai() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
//		for(int i=1;i<=100;i++) {
//			System.out.println("Mahendasai");
//		}
		Name n=new Name();
		n.sai();
	}

}

