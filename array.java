public class array

{

public static void main(String [] args)
{
    //declare
  int arr[] =null;
  //allocate space
  arr = new int[5];
  
 arr[0] = 10;
 arr[1] =  20;
 arr[2] = 30;
 arr[3] = 40;
 arr[4] = 50;
 
 //enhanced for loop
 for (int val :arr)
 {
    System.out.println(val);
    }
  
}
}
