 /**
  * InnerpolymorphismDemo
  */
  class Animal {
    void show(){
        System.out.println("I am animal class");
    }
    
 } 
 class Dog extends Animal{
    void show(){
        System.out.println("I'm Dog class extended from Animal class");
    }
 } 


 class Cat extends Dog{
    void show(){
        System.out.println("I'm Cat class Extended form Animal class");
    }
 }
    





public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.show();     //it will call a animal clas show()

        Dog  cat=new Cat();
        cat.show();   //It will call a Cat class Show Method
    }
}
