package Week1.day2;

public class CreateFibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		for(int i=2;i<=9;i++) {
			System.out.print(firstNum+",");
			int output = firstNum + secondNum;
		    firstNum = secondNum;
		    secondNum = output;
		}
	}
}
