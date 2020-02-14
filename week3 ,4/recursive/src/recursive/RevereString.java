package recursive;

public class RevereString {
	 void reverse(String str) 
	    { 
	        if ((str==null)||(str.length() <= 1)) 
	           System.out.print(str); 
	        else
	        { 
	            System.out.print(str.charAt(str.length()-1)); 
	            reverse(str.substring(0,str.length()-1)); 
	        } 
	    } 
	     
	    public static void main(String[] args)  
	    { 
	        String str = "Nishchit Shah"; 
	        RevereString obj = new RevereString(); 
	        obj.reverse(str); 
	    }     

}
