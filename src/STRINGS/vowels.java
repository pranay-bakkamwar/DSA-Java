package STRINGS;

import java.util.Scanner;

public class vowels
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel_count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel_count++;
            }

        }
        System.out.println(vowel_count);

    }
}
