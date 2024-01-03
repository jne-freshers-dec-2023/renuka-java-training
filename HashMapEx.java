import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap=new HashMap<>();
        hmap.put(1,"one");
        hmap.put(4,"four");
        hmap.put(8,"eight");

        System.out.println(hmap);

        //get return value
        System.out.println(hmap.get(1));

        //values()
        System.out.println(hmap.values());

        HashMap<Integer,String> hmap1= new HashMap<>();

        hmap1= (HashMap<Integer, String>) hmap.clone();


        System.out.println("hmap1:"+hmap1);

       // hmap.put(5,"Five");
        System.out.println("hmap1:"+hmap1);
        System.out.println("hmap:"+hmap);


        //boolean containsValue(Object value)
        System.out.println("boolean containsValue(Object value):"+hmap.containsValue("one"));

        //boolean containsKey(Object key)
        System.out.println("boolean containsKey(Object key):"+hmap.containsKey(3));

        //boolean equals(Object o)
        System.out.println("boolean equals(Object o):-"+ hmap.equals(hmap1));

        if(hmap1==hmap){
            System.out.println("equal");

        }
        else {
            System.out.println("not equal");
        }

        //V getOrDefault(Object key, V defaultValue)
        System.out.println("V getOrDefault(Object key, V defaultValue):"+hmap.getOrDefault(1,"Three"));


        //V replace(K key, V value)
        hmap.replace(4,"FOUR");
        System.out.println(hmap);


    }
}
