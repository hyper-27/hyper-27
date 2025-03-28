public class Swap2
{
    public static void main(String [] args){
    int [] arr={10,100,1000};
    int [] other={30,40,50};
    System.out.println( arr[0] + " " + other[0]);
    Swap(arr,other);
    }
    public static void Swap(int [] one,int [] two){
    int [] temp= one;
    one= two;
    two = temp;
    }
}
//it doesn't swap