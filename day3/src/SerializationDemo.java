import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;

class  Student implements Serializable {
    String name;
    int rno;
    int age;
    //Transient field
    transient String pass;

    public Student(String name,int rno,int age, String pass){
        this.name=name;
        this.rno=rno;
        this.age=age;
        this.pass=pass;

    }

    public  String toString(){
        return  "roll No:"+rno+" "+"Name:"+name+" Age:"+age+" Pass:"+pass;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws  Exception{
        File file=new File("student.txt");
        Student s=new Student("Renuka",470,21,"renu@123");
        System.out.println(s);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(s);
        oos.close();

    }
}
