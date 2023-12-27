import java.util.*;

/**
 * InnerEncapsulationEx
 */
class InnerEncapsulationEx {
    private int user_id;
    private String email;
    

    public void setId(int id){
        user_id=id;
    }

    public void setEmail(String e){
        email=e;
    }

    public int getId(){
        return user_id;
    }

    public String getEmail(){
        return email;
    }
}


public class EncapsulationEx {
    public static void main(String args[]){
        InnerEncapsulationEx en= new InnerEncapsulationEx();
        en.setId(101);
        en.setEmail("renuka@gmail.com");
        System.out.println("User Email:-"+en.getEmail());
        System.out.println("User ID:-"+en.getId());

    }
}
