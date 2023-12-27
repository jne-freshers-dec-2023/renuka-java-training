public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Reka");
        System.out.println("Name:"+sb);
        System.out.println("Capacity:-"+sb.capacity());
        System.out.println("Length:-"+sb.length()) ;
        System.out.println(sb.append("pogul"));
    }   }
