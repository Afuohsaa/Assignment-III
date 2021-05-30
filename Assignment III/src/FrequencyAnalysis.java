import java.util.Scanner;

public class FrequencyAnalysis {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Cipher Text: \nCipher Text: ");
		String cipherText = scanner.nextLine();
		cipherText = cipherText.toUpperCase(); //We just want all text in uppercase

		//Counting of character frequency
		System.out.println("Analysis: ");
		for(char ch ='A'; ch<='Z'; ch++) {
			
			int n = 0;
			for(int i=0; i<cipherText.length(); i++) {
				
				if(ch == cipherText.charAt(i))
					n++;
			}
			if (n!=0)
			System.out.print(ch + "->" + n + ", ");	
		}
		
		//Display user menu:
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\n\nOption:\n1) Take Replacement Rule\n2) Exit");
		
		int Option;
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("\nEnter 1 or 2: ");
		Option = scanner.nextInt();
		
		if(Option== 1) {
			
		}
		else if(Option==2) {
			System.exit(0);
		}
		else{
			System.out.println("Not a valid number!");
	}

}}
