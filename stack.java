
import java.util.Stack;

public class stack {
   Stack<Integer> s1 = new Stack<>();
   Stack<Integer> s2 = new Stack<>();
   Stack<Character> chStack = new Stack<>();

  public void enQueue(int a){
  s1.push(a);
 } //enQueue

 public Integer deQueue(){
     int temp = -1;
     while(!s1.isEmpty()){
         s2.push(s1.pop());
        }//while
        temp = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }//while
        return temp;
  }//dequeue

    public static void main(String[] args) {
        stack ans = new stack();
        ans.enQueue(3);
        ans.enQueue(5);
        ans.enQueue(6);
        ans.enQueue(11);
        System.out.println(ans.s1);

        System.out.println(ans.deQueue());

        System.out.println(ans.s1);
   } //main

}
