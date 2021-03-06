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
		Option = scanner2.nextInt();

		if(Option== 1) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Cipher Text Again: ");
			String str = input.nextLine();
			System.out.println("Enter the character to replace");
			char ch = input.next().charAt(0);
			System.out.println("Enter the character to be replaced with");
			char newCh = input.next().charAt(0);

			String newText = str.replace(ch, newCh);
			System.out.println(newText);
			newText =newText.toUpperCase();

			for(char ch1 ='A';ch1<='Z';ch1++ ) {
				int n = 0;
				for(int j=0; j<newText.length(); j++) {

					if(ch1 == newText.charAt(j))
						n++;
				}
				System.out.println("Analysis: ");
				if(n!=0);
				System.out.print(ch1 + "->" + n + ", ");	
				}
			
			}
		if(Option==2) {
			System.exit(0);
		}
		
	}
}
