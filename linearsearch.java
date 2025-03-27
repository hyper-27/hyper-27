public class linearsearch{

    public static void main(String[] args){
    
        int[] arr = {10,20,300};
        System.out.println(search(arr,90));
        
    }
    public static int search(int[] on,int item){
    
        for(int i=0; i<on.length; i++){
          if(on[i]==item){
            return i;
            
            }
        }
        return -1;
    }
}