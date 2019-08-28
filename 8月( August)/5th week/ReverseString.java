import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input: ");
		String input = scan.nextLine();
		
		String[] inputArr = input.split(" ");
		
		System.out.print("Output: ");
		for(String str : inputArr) {
			
			char[] strArray = str.toCharArray();
			if((str.length()%2) == 0) {
						
				for(int i=0;i<=(str.length()/2);i++) {
					
					char j;
					j=strArray[i];
					strArray[i]=strArray[str.length()-i-1];
					strArray[str.length()-i-1]=j;
				}
			}
			else {
				
				for(int i=0;i<(str.length()/2);i++) {
					
					char j;
					j=strArray[i];
					strArray[i]=strArray[str.length()-i-1];
					strArray[str.length()-i-1]=j;
				}			
			}
			
			System.out.print(new String(strArray) + " ");
		}		
	}
}
