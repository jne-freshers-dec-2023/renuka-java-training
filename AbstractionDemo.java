abstract class Hobbies{//it's a abstract class 
  abstract void  dancing();
  abstract void singing();
  abstract void drawing();
  void show(){
    System.out.println("I  am Hobbies class");

}
}

// below class has written all the defination of abstract methods so this class
//became the concrete class 
class RenukaHobbies extends Hobbies{
    void dancing(){
        System.out.println("I love dancing!!");
    }
    void singing(){
        System.out.println("I am not a good singer.");
    }
    
    void drawing(){
        System.out.println("I love drawing!!");
    }
}


abstract class SitaHobbies extends Hobbies{
    void singing(){
        System.out.println("I love singing");
    }
}

//Above class throws errors:-
//The type Sita must implement the inherited abstract method Hobbies.dancing()
//The type Sita must implement the inherited abstract method Hobbies.drawing()
//so the above class also becomes a abstract class


public class AbstractionDemo {
   public static void main(String[] args) {
        RenukaHobbies obj=new RenukaHobbies();
        obj.dancing();
        obj.drawing();
        obj.singing();
        obj.show();
   } 
}
