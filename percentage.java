import java.util.Scanner;

public class percentage {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics mark : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English mark : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry mark : ");
        int Chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics mark : ");
        int Mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science mark : ");
        int Computer = scan.nextInt();

        float percentage = ((physics + English + Chemistry + Mathematics + Computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
    

