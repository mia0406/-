import java.util.Arrays;
import java.util.Scanner;

public class LongestSubStringTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
		boolean[] arr = new boolean[26];
		String str= "";
		String resultString="";
		int result=0;
		
		System.out.print("Input: ");
		String before = scan.nextLine();

		for(int i=0;i<before.length();i++) {
			
			String chars = before.substring(i,i+1);
			int locate = alphabet.indexOf(chars);
			boolean confirm = arr[locate];
		
			if(confirm == false) {
				
				arr[locate]=true;
				str+=chars;
			}else {
				
				Arrays.fill(arr, false);
				str="";
				
				arr[locate]=true;
				str+=chars;
			}
			
			if(result < str.length()) {
				resultString = str;
				result=resultString.length();
			}
		}

		System.out.print("Output: " + result);
		scan.close();
	}
}
