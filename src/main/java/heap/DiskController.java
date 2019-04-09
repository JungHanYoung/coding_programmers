package heap;

import java.util.*;

public class DiskController {

    public static void main(String[] args) {

        printSolution(
                new int[][] {
                        {0,2},
                        {4,13},
                        {5,9},
                        {6,6}
                }
        );
        printSolution(
                new int[][] {
                        {0, 3},
                        {1, 9},
                        {2, 6}
                }
        );
        /**
         * input : [[0, 9], [0, 4], [0, 5], [0, 7], [0, 3]]
         * output : 13
         */
        printSolution(
                new int[][] {
                        {0,9},
                        {0,4},
                        {0,5},
                        {0,7},
                        {0,3}
                }
        );

    }

    private static void printSolution(int[][] jobs) {
        System.out.print("이중 배열 확인 : ");
        for(int i = 0; i < jobs.length; i++) {
            System.out.print(Arrays.toString(jobs[i]));
        }
        System.out.println();
        System.out.println(solution(jobs));
        System.out.println("=============================");
    }

    public static int solution(int[][] jobs) {

        List<Task> taskList = new ArrayList<>();
        for(int[] job : jobs) {
            taskList.add(new Task(job[0], job[1]));
        }

        taskList.sort(Comparator.comparingInt(t -> t.pot));

        Queue<Task> queue = new PriorityQueue<>(Comparator.comparingInt(t -> t.second));

        List<Integer> potToEnd = new ArrayList<>();

        int end = 0;

        for(Task task : taskList) {
            boolean isPossible = end <= task.pot;
            if(queue.isEmpty()) {
                if(isPossible) {
                    end = task.pot + task.second;
                    potToEnd.add(end - task.pot);
                } else {
                    queue.offer(task);
                }
            } else {
                if(isPossible) {
                    Task t = queue.poll();
                    end += t.second;
                    potToEnd.add(end - t.pot);
                    queue.offer(task);
                } else {
                    queue.offer(task);
                }
            }
            System.out.println("<= " + queue);
        }

        System.out.println("순회 후 end값 확인 : " + end);

        while(!queue.isEmpty()) {
            Task temp = queue.poll();
            end += temp.second;
            potToEnd.add(end - temp.pot);
            System.out.println("end= " + end + ", queue= <- " + queue);
        }

        int sum = 0;
        for(int item : potToEnd) {
            sum += item;
        }

        return sum / jobs.length;
    }
}

class Task  {

    int pot;
    int second;

    public Task(int pot, int second) {
        this.pot = pot;
        this.second = second;
    }

    @Override
    public String toString() {
        return "{" + pot +
                ", " + second +
                '}';
    }
}
