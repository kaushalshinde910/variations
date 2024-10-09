package VAR1;
//find all factors of a natural number
public class FIND_ALL_FAC_OF_NNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=100;
       System.out.println("The divisors are: ");
       for(int i=1;i<=n;i++)
       {
    	   if(n%i==0)
    		   System.out.print(i+" ");
       }
	}

}
