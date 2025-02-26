public class Person{
    String name ="kalainila";
    int age= 18;
 public void introduce(){
   System.out.println("my name is"+ name + "I am "+ age +" years old");
 }
public static void main(String args[]){
  Person obj= new Person();
obj.introduce();
} }