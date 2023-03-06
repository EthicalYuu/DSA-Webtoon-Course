// Yussif Abdalla
// 18-2-2023  DSA I Course
public class Main {
    public static void main(String[] args) {

        Stack stack_1 = new Stack(5);   // Create a given size stack

        System.out.println(stack_1.empty()); // Check if stack is empty

        stack_1.printElements();            // Print elements in the stack

        stack_1.push(1);              // Push to stack
        stack_1.push(2);
        stack_1.push(3);
        stack_1.push(4);
        stack_1.push(5);

        stack_1.printElements();

        int popped = stack_1.pop();         // Pop elements out of the stack
        System.out.println(popped);

        stack_1.printElements();

        int peeked = stack_1.peek();        // Peak at the top of the stack
        System.out.println(peeked);

        stack_1.printElements();

        System.out.println(stack_1.search(33)); // Look for an element in the stack

        System.out.println("--------------------------------------------------------");

        Stack stack_2= new Stack();     // Create a non given size stack

        System.out.println(stack_2.empty());

        stack_2.printElements();

        stack_2.push(1);
        stack_2.push(2);
        stack_2.push(3);
        stack_2.push(4);
        stack_2.push(5);

        stack_2.printElements();

        stack_2.push(6);
        stack_2.push(7);
        stack_2.push(8);

        stack_2.printElements();

        popped = stack_2.pop();
        System.out.println(popped);

        popped = stack_2.pop();
        System.out.println(popped);

        stack_2.printElements();

        peeked = stack_2.peek();
        System.out.println(peeked);

        stack_2.printElements();

        System.out.println(stack_1.search(33));
    }

}