package stack_queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {

        TruckSolution truckSolution = new TruckSolution();

        int solution = truckSolution.solution(2, 10, new int[]{7, 4, 5, 6});

        System.out.println(solution);


    }
}
