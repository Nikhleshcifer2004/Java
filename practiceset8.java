

class Employee{
    int salary;
    String name;
  
    public int getSalary(){
       return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name = n;

    }
    public class Phone{
        public void ring(){
            System.out.println("Ringing....");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFriend(){
            System.out.println("calling priya");
        }
    }
}
public class practiceset8 {
    public static void main(String[] args) {
        //problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 344;
        System.out.println(harry.getSalary());
        System.out.println(harry.getname());
        

        //problem 2
        Employee.Phone realme = harry.new Phone();
        realme.callFriend();
        realme.ring();
        realme.vibrate();

    }
    
}
