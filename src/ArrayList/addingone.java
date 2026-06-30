package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class addingone {
    public static void main(String[] args) {
        int [] arr= {5,6,7,8};
        ArrayList <Integer> list = new ArrayList<>();
        int carry=1;
        for(int i = arr.length-1;i>=0;i++){
            if(arr.length-1<=9){
                arr[i]=arr[i+1];
            }
        }



    }
}
