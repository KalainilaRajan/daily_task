public class Employee{

 private int id;
private int salary;

public void setSalary(int Salary){
       this.salary = Salary;
}

public String getSalary(int salary){
       if (salary<10000){
        
      //String a="Salary is less than 10,000"; 
       }
        return "Salary is less than 10,000";
}


public static void main(String args[]){
   Employee obj = new Employee();
    Scanner obj1 = new Scanner(System.in);
   
    System.out.print("enter the salary:");
    int s = obj1.nextInt();
    
    obj.setSalary(s);
    System.out.println(obj.getSalary(s));  }}
