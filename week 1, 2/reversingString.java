
//Class for reversing string character
public class reversingString {
	//Main function
	public static void main(String[] args){
		String string="Characters";
		
		// converting String to array by using .toCharArray()         
		char[] toarray = string.toCharArray();
		for (int i=toarray.length-1; i>=0; i--) {
			System.out.print(toarray[i]);
		}
	}
}
