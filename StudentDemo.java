/**
 * InnerStudentDemo
 */
 class Student{
    int roll_no;
    String name;
    int age;
    int marks;
    
    void getDetails(int roll,String name, int age, int marks){
        this.roll_no=roll;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}



public class StudentDemo {
    public static void main(String[] args) {
        Student []stud =new Student[3];
        Student s1=new Student();
        Student s2=new Student();
        Student s3= new Student();
        s1.getDetails(101, "Renuka", 21, 88);
        s2.getDetails(102, "Shambu", 21, 80);
        s3.getDetails(103, "Karthik", 21, 85);

        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;
        System.out.println("Printing object one by one:");
        System.out.println(stud[0].name +":"+ stud[0].roll_no);
        System.out.println(stud[1].name+":"+stud[1].roll_no);
        System.out.println(stud[0].name+":"+ stud[2].roll_no);
        System.out.println("Printing array of object through enhace for loop or foreach loop:");


        for(Student students: stud){
            System.out.println("name:"+students.name+", "+"Roll No:"+students.roll_no);;
        }
    }
}
