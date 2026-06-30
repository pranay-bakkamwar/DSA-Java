package ArrayList;

import java.util.ArrayList;

public class settingvaluesinarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();

        arr.add(51);
        arr.add(2);
        arr.add(3);
        arr.set(1,61);//elemet set
        System.out.println(arr.get(1));//element get
    }
}
