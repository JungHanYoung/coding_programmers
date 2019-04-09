package heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Scovill {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        boolean flag = false;
        PriorityQueue<Integer> pg = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
            pg.offer(scoville[i]);
        }

        System.out.println(pg);

        while(pg.size() > 1) {
            answer++;
            int first = pg.poll();
            int second = pg.poll();

            int result = first + second * 2;

            System.out.printf("%d + (%d * 2) = %d\n", first, second, result);

            if(result >= K) {
                flag = true;
                System.out.println(result + " >= " + K);
                break;
            }
            pg.offer(result);
            System.out.println();
        }
        if(!flag) {
            answer = -1;
        }

        System.out.println("*****************answer: " + answer);

        return answer;
    }
}
