package VAR1;

import java.util.ArrayList;
import java.util.List;

public class Fibo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {4,2,8,5,20,1,40,13,23};
        List<Integer>list=new ArrayList<>();
        int a=0;list.add(a);
        list.add(a);
        int b=1;
        list.add(b);
        for(int i=2;i<10;i++)
        {
        	int c=a+b;
        	list.add(c);
        	a=b;
        	b=c;
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(list.contains(arr[i]))
        	{
        		System.out.println(arr[i]+" ");
        	}
        }
	}

}
