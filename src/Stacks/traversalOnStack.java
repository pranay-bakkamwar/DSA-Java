package Stacks;
import java.util.Stack;
public class traversalOnStack {
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
        Stack <Integer> st2=new Stack<>();
        while (st.size()>0){
            int top=st.pop();
            System.out.print(top+" ");
            st2.push(top);

        }
        while (st2.size()>0){
            st.push(st2.pop());
        }

    }
}
