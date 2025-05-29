package Week1.day2;


public class IsPalindrome {

	public static void main(String[] args) {
		int input = 12345;
		int original = input;
		int reversed = 0;
		//while(input!=0) {
			//int reminder = input%10;
			//reversed = reversed*10+reminder;
			//input = input/10;
		//}
		for(reversed=0;input>0;input = input/10) {
			int rem = input%10;
			reversed = reversed*10+rem;
		}
		if(original==reversed) {
			System.out.println(original+" is a palindrome");
		}
		else {
				System.out.println(original+" is not a palindrome");
			}
		}

		}
	


