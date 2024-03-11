package Test_3;

public class Main {

    public static void main(String[] args) {

        Max_Min_Stack maxMinStack = new Max_Min_Stack();

        maxMinStack.push(12);
        maxMinStack.push(7);
        maxMinStack.push(55);
        maxMinStack.push(98);

        maxMinStack.pop();

        System.out.println(maxMinStack.max());

        System.out.println(maxMinStack.min());
    }
}
