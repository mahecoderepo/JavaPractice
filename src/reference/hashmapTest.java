package reference;

import java.util.HashMap;

public class hashmapTest {

    public static void main(String[] args) {
        String str ="Bangalore";
        HashMap<String,String> map = new HashMap<>();
        map.put("Test1",str);
        System.out.println(map);
        map.replace("Test1","bxngxlore");
        System.out.println(map);
    }
}
