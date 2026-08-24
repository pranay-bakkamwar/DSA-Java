package RECURSION;

import java.util.ArrayList;

public class HCF {
    public static ArrayList<Integer> HCF(int n , int k,ArrayList<Integer> arrayList ) {
        for (int i=1;i<=n;i++){

            if(n%i==0 && k%i==0){
            arrayList.add(i);
            }

        }
        return arrayList;
    }
    public static void main(String[] args) {
        int f =12;
        int s = 16;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        HCF(12,16,arrayList1);

        System.out.println(arrayList1.getLast());



    }
}
