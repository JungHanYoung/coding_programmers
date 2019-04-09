package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class TruckSolution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        LinkedList<Truck> queue = new LinkedList<>();

        int bridge_load = 0;

        for(int i = 0; i < truck_weights.length; i++) {

            if(bridge_load + truck_weights[i] > weight) {

                while(bridge_load + truck_weights[i] > weight) {

                }

            } else {

            }
            // 트럭이 다리에 올라오지 못하는 동안 트럭들을 시간에 따라 이동시킨다.
            // 해당 반복문으로 다음 하중이 들어올 수 있을때까지 트럭을 이동시키고,
            while(bridge_load + truck_weights[i] > weight)
            {
                for(Truck truck : queue) {
                    truck.distance++;
                    // 만약 다리길이보다 트럭이 이동한 거리가 클때 다리에서 트럭을 빠져나왔다고 간주.
                    if(truck.distance > bridge_length) {
                        bridge_load -= queue.poll().weight;
                    }
                }
                answer++;
            }

            // 만약 트럭이 올라올 수 있다면은?
            //

            // 다음 트럭이 들어선다.
            queue.offer(new Truck(truck_weights[i], 1));

            /**
             * 만약 다음에 들어올 트럭이 없다.
             * 반복문이 다 돌았다는건 트럭이 모두 다리에 진입을 했다는 것.
             * 만약 진입을 하고, 트럭무게가 다리하중보다 작으면 while문을 통과해버림.
             * 따라서, 다리에 있는 나머지 트럭은 (다리길이 -  가장 적게 이동한 트럭의 거리)를 answer에 더해준다.
             */
        }

        answer += bridge_length - queue.getLast().distance;

        return answer;
    }
}

class Truck {
    int weight;
    int distance;

    public Truck(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }
}