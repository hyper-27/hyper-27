
/**
 * for local variable in stack
 * {
 * scope is differnent 
 * the order matters
 * both functions have differnt local variables
 * stack first takes main function then calculate all 
 * both are unaware of each others variable
      }
      
      global variale{
          it is outside all functions
          kept in heap
          ****if function have same variable as global then local will win fight 
      }
 */
//block scope
//variabl declared outside the block is accessible insidee it 
//it comes under if else
//but var declared inside cant be accessed outside;
public class scope
{
    public static int val= 90;
    public static void main(String [] args){
       int scond = 30;
       int thunder =30;
       int sum = addition(scond,thunder);
       System.out.println(sum);
       System.out.println(val);
       int val= 500;
       System.out.println(val);
       System.out.println(scope.val);
       int asn = globalscope(scond);
       System.out.println(asn);
       if(scond<=thunder) {
           int three=90;
           System.out.print(three);
        }
    } 
        
    public static int addition(int one,int another){
     int sum = one + another;
     return sum;
    }
    
    public static int globalscope(int th){
    int sum = th + val;
    return sum;
    }


}
