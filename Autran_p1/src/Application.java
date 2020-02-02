/*
 PSEUDO CODE:
 
    Application (){
	digit 1 is the largest valuer of the integer thousandths place
	
*/
import java.util.Scanner; 

public class Application {
	
	public static void main (String args[]) 					{
		Scanner in = new Scanner(System.in);
		Encrypter encryptor = new Encrypter();
		Decrypter decryptor = new Decrypter();
		int fourDigitNum = 0;
		int digitArray[] = new int[4]; // digit 1 is the largest valuer of the integer thousandths place
		int choice = 0; 
		
		System.out.println("Enter 1 to encrypt: Enter 2 to decrypt: Enter -1 to exit:");
		
		while(choice != -1) {
			System.out.print("\nChoice: ");
			choice = in.nextInt();	
			System.out.println();
			
			if(choice == 1) {
				fourDigitNum = getFourDigitInt(in);
				digitArray = encryptor.encrypt(fourDigitNum);
				for(int i = 0; i < digitArray.length; i++) {
					System.out.printf("%d", digitArray[i]);
					
				}
			}
			else if(choice == 2) {
				fourDigitNum = getFourDigitInt(in);
				digitArray = decryptor.decrypt(fourDigitNum);
				for(int i = 0; i < digitArray.length; i++) {
					System.out.printf("%d", digitArray[i]);
				}
			}
			
			else {
				choice = -1; 
			}
			
		}	
		
		in.close(); 	
	}
		
	public static int getFourDigitInt(Scanner in) {
		boolean inputDirty = true; 
		int num = 0;
		while(inputDirty) {
			//in.reset();
			System.out.println("Please enter a four digit number: ");
			num = in.nextInt(); 
			if(num > 9999 || num < 0) {
				System.out.println("Input is invalid please try again.\n");
			}
			else {
				inputDirty = false;
			}
		}
		return num; 
	}
		
}
