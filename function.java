public class function{
public static void main(String [] args){
addshit(23, 34);

int sum = additionreturn(34,40);//if not capture it will be lost
//and main sum does have different address(memory) then additionreturn sum

System.out.println(sum);

}
public static int additionreturn(int a, int b){
    int sum = a + b;
    return sum;

}


public static void addshit(int a, int b){
    int sum = a+b;
System.out.println(sum);
}

}