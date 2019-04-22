package stack_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Tower {

    public int[] solution(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        stack.push(heights[heights.length-1]);

        List<Integer> list = new ArrayList<>();
        for(int i = heights.length - 2; i >= 0; i-- ) {

            if(stack.peek() < heights[i]) {
                while(!stack.isEmpty()) {
                    list.add(i+1);
                    stack.pop();
                }
            }

            stack.push(heights[i]);
        }

        while(!stack.isEmpty()) {
            list.add(0);
            stack.pop();
        }

        Collections.reverse(list);

        System.out.println(list);

        return new int[]{};
    }
}
