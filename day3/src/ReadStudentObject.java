import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.ObjectInputStream;

public class ReadStudentObject {
    public static void main(String[] args) throws Exception {
        File file =new File("student.txt");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Student s1=(Student) ois.readObject();
        ois.close();
        System.out.println(s1);
    }
}
