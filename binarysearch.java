
/**
 * Write a description of class binarysearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binarysearch
{
  public static void main(String [] args){
    
      int [] array = {10,20,30,40,50,60,70,80};
   
      System.out.println(bsearch(array,60));
      
    
    } 
    public static int bsearch( int [] arr, int item){
    
        int lo = 0;
        int hi = arr.length - 1;
     
        while(lo <= hi ){
        
            int mid = (lo + hi)/2 ;
            
            if (arr[mid]<item){
            
                lo =mid +1;
                
            }
            else if(arr[mid]> item){
            hi = mid -1 ;
            }
            else{
                System.out.println(arr[mid]);
            return mid;
            }
            
        }
        return -1;
    }
  
}
