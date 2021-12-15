package fa.training.problem02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số nguyên:");
		int i = scan.nextInt();
		int ri = ReverseInt.reverseInt(i);
		System.out.println("Reverse của số vừa nhập là: "+ ri);

	}

}
