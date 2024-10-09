package VAR1;
import java.util.ArrayList;
import java.util.List;
public class Fibo_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=34;
        List<Integer>list=new ArrayList<>();
        int a=0;
        int b=1;
        list.add(0);
        list.add(b);
        for(int i=2;i<=10;i++)
        {
        	int c=a+b;
        	list.add(c);
        	a=b;
        	b=c;
        }
        if(list.contains(n))
        	System.out.println(n+ "is a fibbonacci number");
        else
        	 System.out.println(n+ "Not a fibbonacci number");
        }
}
