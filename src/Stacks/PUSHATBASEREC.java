package Stacks;
import java.util.Stack;
public class PUSHATBASEREC {

    public static void pushatbase(int x,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top=st.pop();

        pushatbase(x,st);

        st.push(top);
    }
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

        pushatbase(5,st);
        System.out.print(st+" ");
    }



}
