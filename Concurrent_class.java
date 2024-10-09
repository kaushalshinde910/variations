package VAR1;

public class Concurrent_class {
//check the code once again with logic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ms="abcd abc aabc abcaa";//ms=main_string
        String ss="aa";//ss=sub_string
        {
        	String s[]=ms.split(" ");
        	int cnt=0;
        	for(int i=0;i<s.length;i++)
        	{
        		if(ss.equals(s[i]))
        			cnt++;
        	}
        	System.out.println(ss+ "'has occured "+ cnt +" time in "+ ms+ " ");
        }
        
	}

}
