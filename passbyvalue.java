
/**
 * swaping can't be done because swap will be popped out of stack once its call ended
 */
public class passbyvalue{
public static void main(String [] args){
int one =30;
int two =40;
System.out.println(one +","+ two);
int sum= Swap(one,two);
System.out.println(sum);
System.out.println(one +","+ two);
}
public static int Swap(int one, int two){
    System.out.println(one +","+ two);
    int temp = one;
    one = two;
    two =temp;
    System.out.println(one +","+ two);
    return 0;
}

}
    