package CollectionsEx;

public class StudentDemo {
    String name;
    int rollNo;

    StudentDemo(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString(){
        return "student{" +
            "name='"+name+'\''+
            ",rollNo="+ rollNo +
            '}';
    }
    
}
