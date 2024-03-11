package Test_3;

import java.util.Deque;
import java.util.LinkedList;

public class Max_Min_Stack {
        private final Deque<Integer> data;
        private final Deque<Integer> stackMin;
        private final Deque<Integer> stackMax;

        public Max_Min_Stack() {
            data = new LinkedList<>();
            stackMin = new LinkedList<>();
            stackMax = new LinkedList<>();
        }

        void push(int info) {
            data.push(info);

            if (stackMin.isEmpty() || stackMin.peek() > info) {
                stackMin.push(info);
            }
            if (stackMax.isEmpty() || stackMax.peek() < info) {
                stackMax.push(info);
            }
        }

        void pop() {
            if (!data.isEmpty()) {
                int info = data.pop();

                if (stackMax.peek() == info) {
                    stackMax.pop();
                }

                if (stackMin.peek() == info) {
                    stackMin.pop();
                }

            } else {
                throw new IllegalArgumentException("Exception Stack is empty");
            }
        }

        int min() {
            if (!stackMin.isEmpty()) {
                return stackMin.peek();
            } else {
                throw new IllegalArgumentException("Exception Stack is empty");
            }
        }
        int max() {
            if (!stackMax.isEmpty()) {
                return stackMax.peek();
            } else {
                throw new IllegalArgumentException("Стек пуст");
            }
        }
}

