package STRINGS;

public class print_all_substrings {
    public static void main(String[] args) {
        String s = "BAKKAMWAR";
        for (int i =0;i<=s.length();i++){
            for (int j =i;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }


    }

}
