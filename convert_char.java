package VAR1;
//convert the characters
//exp:- The first letter (a) is lowerCase. hence the complete string is made lowerCase.
public class convert_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="abcD";
       if(s1.charAt(0)>='a' && s1.charAt(0)<='z')
       {
    	   System.out.println(s1.toLowerCase());
       }
       else
       {
    	   System.out.println(s1.toUpperCase());
       }
	}

}
