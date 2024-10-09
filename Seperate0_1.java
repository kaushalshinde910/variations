package VAR1;

public class Seperate0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr_int[]= {0,0,1,1,0,1,1,1,0};
      int index=0;
      int[]b=new int[arr_int.length];
      for(int i=0;i<arr_int.length;i++)
      {
    	  if(arr_int[i]==0)
    		  b[index++]=arr_int[i];
      }
      for(int i=0;i<arr_int.length;i++)
      {
    	  if(arr_int[i]==1)
    	  b[index++]=arr_int[i];
      }
      for(int i=0;i<b.length;i++)
      {
    	  System.out.print(b[i]+" ");
      }
	}

}
