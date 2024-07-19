

     class Employee{
        int id;
        String name;
        int salary;
        public void printDetails(){
         System.out.println("My id is " + id);
         System.out.println("My name is " + name);
        }
        public int getSalary(){
            return salary;
        }
    }
    public class customclass {
        public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee(); //Instiating a new employee object
        Employee john = new Employee();//Instiating a new employee object

      //Setting attributes for harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";
        
      //Setting aattributes for john  
        john.id = 17;
        john.salary  = 12;
        john.name = "john yadav";
 
      //printing the attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
    
}
