//Here are the basic methods and operations on a stack
//Methods: Push(value), Pop(), Peek(), Search(value), Empty()

import java.util.Stack;
import java.util.Iterator;

public class Stack {
    public static void main(String[] args) {
        //Creating an instance of Stack class
        Stack<Integer> stk = new Stack<>();

        //Checking if stack is empty
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        //Pushing elements
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);  

        //prints elements of the stack  
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();  
        System.out.println("Is the stack empty? " + result);  

        //Iterate & Print stack
        Iterator iterator = stk.iterator();
        while(iterator.hasNext()) {
            Object values = iterator.next();
            System.out.println(values);
        }

        //Popping all elements
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();

        //Ensuring stack is empty
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();  
        System.out.println("Is the stack empty? " + result);  
    } 
}
