/*
 PSEUDO CODE:
 
    Decryptor (){
    
    reduce form into single digits by perform appropriate place division
    subtract previous value from current 
    replaces 1st digit with 3rd digit and 2nd digit with 4th 
	if digit greater than or equal to 7 -7 
    else add 3 
*/
public class Decrypter {
	int digitArray[] = new int[4];
	
	public int[] decrypt(int fourDigitNum) {
		
		digitArray[0] = fourDigitNum;
		digitArray[1] = fourDigitNum % 1000; 
		digitArray[2] = fourDigitNum % 100;
		digitArray[3] = fourDigitNum % 10;
		
		System.out.println();
		
		//reduce form into single digits by perform appropriate place division
		digitArray[0] = (digitArray[0] - digitArray[1])/1000 ; 
		digitArray[1] = (digitArray[1] - digitArray[2])/100 ;
		digitArray[2] = (digitArray[2] - digitArray[3])/10 ; 
		
		// replaces 1st digit with 3rd digit and 2nd digit with 4th
		for(int i = 0; i < 2; i++) {
			int temp = 0; 
			temp = digitArray[i];
			digitArray[i] = digitArray[i+2];
			digitArray[i+2] = temp; 
		}
		
		for(int i = 0; i < digitArray.length; i++) {
			if(digitArray[i] >= 7) {
				digitArray[i] -= 7; 
					
			}
			else {
				digitArray[i] += 3; 
			}
		
		}
		
		return digitArray; 
		
	}
	
}
