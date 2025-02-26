public class Book{
 String title;
 String author;
 public Book(){
 title = "xy";
  author = "kkk";
System.out.println("title of the book " + title + " author is " + author);}

public Book(String Title, String Author){
  this.title = Title;
  this.author = Author;
System.out.println("title of the book " + title + " author is " + author);}

public static void main(String args[]){
  Book obj1 = new Book("xyz", "abc");
  Book obj2 = new Book();  }
}