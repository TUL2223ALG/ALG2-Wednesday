
package week09_recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    
    public static long fact (int n){
        if(n <= 1){
            return 1;
        }
        return fact(n-1)*n;
    }
    
}
