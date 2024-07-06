
public class recursion {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }
    static int fib(int n){
    /*if(n==1){
        return 0;
    }else if(n==2){
        return 1;
    }*/
    if(n==1 || n==2){
        return n-1;
    }
    else{
        return fib(n-1) + fib(n-2);

    }
 }
 static void pattern_rec(int n){
    if (n>0){
        pattern_rec(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
    public static void main(String[] args) {
        int a = sumRec(4);
        System.out.println(a);
        int c = fib(5);
        System.out.println(c);
        pattern_rec(6);
        
    }
    
}
