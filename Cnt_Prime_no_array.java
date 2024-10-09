package VAR1;

public class Cnt_Prime_no_array {
//cnt prime no in given array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {1,3,5,7,2,3,4,5,6,11,31,24,56 };
          int dcnt=0;
          for(int i=0;i<a.length;i++)
          {
        	  
        		  int cnt=0;
        		  for(int j=2;j<a[i];j++)
        		  {
        			  if(a[i]%j==0)
        				  dcnt++;
        			  
        		  }
        		  System.out.println("count of prime number = "+dcnt);
        	  }
          }
}
