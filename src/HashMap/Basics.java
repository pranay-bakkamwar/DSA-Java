package HashMap;
import java.util.HashMap;
import java.util.Map;

public class Basics {
    public static void main(String[] args){
        HashMap <String,Integer> Map=new HashMap<>();
        Map.put("India",150);
        Map.put("China",100);
        Map.put("Nepal",50);
        Map.put("Bhutan",30);
        Map.put("Russia",80);
        Map.put("Afghanistan",90);
        Map.put("Iran",50);
        System.out.println(Map);

        System.out.println(Map);
        System.out.println(Map.get("India"));
        for(Map.Entry<String,Integer> a :Map.entrySet()){
            System.out.print(a+" , ");
        }

    }
}
