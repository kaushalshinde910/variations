package VAR1;

public class Armstrong_NUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=370;
        int sum=0;
        int rem=0;
        int temp=num;
        while(num>0)
        {
        	rem=num%10;
        	int cube=rem*rem*rem;
        	sum=sum+cube;
        	num=num/10;
        }
        if(sum==temp)
        {
        	System.out.println("Armstrong number");
        }
	}

}
