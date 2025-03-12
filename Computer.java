public class Computer{
  void display(){
    System.out.print(" computer IS parent  class");
  
  }

public class Processor{
    void show(){
      System.out.print("processor is a child class");
    }
    
  }




  public static void main(String args[]){
    Computer o = new Computer();
    o.display();
    Computer.Processor obj = o. new Processor();
    obj.show();
  }
}