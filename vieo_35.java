import java.util.Scanner;

public class vieo_35 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format(" %d X %d  = %d\n ",n, i, n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        pattern1(n);

    
    multiplication(7);
        

    }
    
}
