import java.util.Stack;

public  class StackDemo{
    public static void main(String[] args) {
        Stack stk = new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(4);
        System.out.println("after poping ");
           stk.pop();
           System.out.println(stk);
    //     for (Object stkObj : stk) {
    //       //  System.out.println(stkObj);
    //     }
    }

}