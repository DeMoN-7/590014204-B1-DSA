import java.util.*;

public class stack_implementation_using_array {
    public static int max = 10;
    public static int[] arr = new int[max];
    public static int top = -1;
    public static Scanner scanner = new Scanner(System.in);

    static void push() {
         if (top == max - 1) {
            System.out.println("OverFlow Condition");
        }
        else{
            System.out.println("Enter Number");
            int num = scanner.nextInt();
            top++;
            arr[top] = num;
            System.out.println("Item pushed " + num);
        }
    }

    static void pop() {
        if (top != -1) {
            System.out.println("Item poped " + arr[top]);
            top--;
        } else if (top == -1) {
            System.out.println("UnderFlow Condition");
        }
    }

    static void display() {
        for (int i = 0; i <= top; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void peek() {
        if (top == -1) {
            System.out.println("UnderFlow condition");
        } else {
            System.out.println("Peek: " + arr[top]);
        }
    }

    public static void main(String[] args) {
        boolean num=true;
        while (num) {
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit ");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                pop();
                break;
                case 3:
                peek();
                break;
                case 4:
                display();
                break;
                case 5:
                num=false;
                default:
                    break;
            }
        }
        
        scanner.close();

    }
}