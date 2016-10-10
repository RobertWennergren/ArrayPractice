public class ArrayPractice {

	String[] stringArray = new String[26];
	
	public static void main(String[] args){
			new ArrayPractice();
	}
	
	ArrayPractice(){
		
		int i = 0;
		for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
			stringArray[i] = String.valueOf(alphabet);
			i++;  
		}
		System.out.println("Alphabet");
		printArray();
		
		for(i = 0; i <= (stringArray.length-1)/2; i++){
			String temp1 = stringArray[i];
			String temp2 = stringArray[stringArray.length - 1 - i];		
			stringArray[stringArray.length - 1 - i] = temp1;
			stringArray[i] = temp2;			
		}
		System.out.println("Reverse");
		printArray();
		
		for(i = 0; i < stringArray.length; i++){			
			stringArray[i] = stringArray[i].concat("pa");
		}

		System.out.println("Add 'pa' to string");
		printArray();
		
	}
	void printArray(){
		for(String s : stringArray){
			System.out.println(s);
		}
	}
}
