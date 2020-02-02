/*
 PSEUDO CODE: 
    Enryptor (){
        initialize scanner object 
    	
    public int[] encrypt(int fourDigitNum) {
    store numbers into an array based on tenths hundredth etc
    reduce form into single digits by perform appropriate place division
   	uses for loop to add seven to each digit and dividing by 10 and storing the remainder
 	replaces 1st digit with 3rd digit and 2nd digit with 4th
 	exp: temp= a[i]; a[i] = a[i+2]; a[i+2]= temp; 

 */
public class Encrypter {

	int digitArray[] = new int[4]; // digit 1 is the largest valuer of the integer thousandths place
	
	public int[] encrypt(int fourDigitNum) {
		// store numbers into an array based on tenths hundredth etc
		digitArray[0] = fourDigitNum;
		digitArray[1] = fourDigitNum % 1000; 
		digitArray[2] = fourDigitNum % 100;
		digitArray[3] = fourDigitNum % 10;
		
		System.out.println();
		
		//reduce form into single digits by perform appropriate place division
		digitArray[0] = (digitArray[0] - digitArray[1])/1000 ; 
		digitArray[1] = (digitArray[1] - digitArray[2])/100 ;
		digitArray[2] = (digitArray[2] - digitArray[3])/10 ; 
		
		//add seven to each digit and dividing by 10 and storing the remainder
		for(int i = 0; i < digitArray.length; i++) {
			digitArray[i] = (digitArray[i] + 7) % 10; 
			
		}
		
		// replaces 1st digit with 3rd digit and 2nd digit with 4th
		for(int i = 0; i < 2; i++) {
			int temp = 0; 
			temp = digitArray[i];
			digitArray[i] = digitArray[i+2];
			digitArray[i+2] = temp; 
		}

		/*
		for(int i = 0; i < digitArray.length; i++) {
			System.out.printf("%d", digitArray[i]);
			
		}*/
		
		
		return digitArray; 
		
	}
 	
}
