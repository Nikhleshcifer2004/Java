
public class method {
    static void checkAge(int age){
        if(age<18){
            System.out.println("Access denied--You are not old enough ");
        }else{
            System.out.println("Acess granted -- You are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
    
}
