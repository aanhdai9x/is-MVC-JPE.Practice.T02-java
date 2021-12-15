package fa.training.problem02;

public class ReverseInt {
	public static int reverseInt(int input) {
		int ri=0;
		while (input != 0) {
		    ri = ri * 10 + input % 10;
		    input = input / 10;   
		}
		return ri;
	}
}
