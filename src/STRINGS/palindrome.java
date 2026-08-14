package STRINGS;

public class palindrome {
    public static void main(String[] args) {
        String str="madam";

        int i=0;
        int n=str.length();
        int j =n-1;
        boolean flag=false;

        while (i<=j){
            char charatleft=str.charAt(i);
            char charatright=str.charAt(j);
            if(charatleft==charatright){
                i++;
                j--;
                flag=true;
            }
            else{
                flag=false;
                System.out.println("Not a valid palindrome");
                break;
            }
        }
        if (flag=true){
            System.out.println("valid palindrome");
        }
    }
}
