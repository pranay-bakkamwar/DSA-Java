package Stacks;
import java.util.Stack;
public class Basics {
    public static void main(String[] args){
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(110);
        System.out.println(st);
       st.pop();
       System.out.println(st);


    }
}
