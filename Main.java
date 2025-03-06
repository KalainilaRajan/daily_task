interface Playable{
     void play();
}


class Guitar implements Playable{
    public void play(){
      System.out.println("this person is playing Guitar");
      
    }
}

class Piano implements Playable{
    public void play(){
      System.out.println("this person is playing Piano");
    }
      
}
public class Main{
    public static void main(String args[]){
     Playable a = new Guitar();
     a.play();
     
    Playable b = new Piano();
    b.play();
    }
}