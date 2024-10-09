package VAR1;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int N=12;
           int cnt=0;
           for(int i=2;i<N;i++)
           {
        	   if(N%i==0&&i%2==0)
        	    cnt++;
        	   
           }
           if(cnt!=0)
           {
        	   System.out.println(cnt-1);
           }
           else
           {
        	   System.out.println(cnt);
           }
	}
}

   
         
