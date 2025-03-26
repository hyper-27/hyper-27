public class swap{
 public static void main(String[] args){
     int arr[] = null;
     arr = new int[5];
    arr[0] = 10;
    arr[2] =30;
    arr[1] =20;
    arr[3] =40;
    arr[4] = 50;
    int i = 0, j = 2 ;
    Swap(arr,i,j);
    System.out.println(arr[i] + " " + arr[j]);
    
    
    }
    //swap function makes changes in heap
    //if something is changed in heap then it remain permanently
    
    public static void Swap(int[] arr, int i, int j){
    
    System.out.println(arr[i] + " " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp ;
    
    
    }
    
    
}