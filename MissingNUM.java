package VAR1;


public class MissingNUM {
	public static void main(String[] args)
	{
	long num=9;
	int cnt=0;
	for(int i=1;i<=num;i++)
	{
     if(num%i==0)
     
    	 cnt++;
     }
     if(cnt==3)
     
    	System.out.println("Yes");
     
     else
     
    	 System.out.println("No");
     
	}
	
}

