package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveMinNumber {

    public int[] solution(int[] arr) {

        if(arr.length <= 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        List<Integer> list = new ArrayList<>();
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }

        list.remove(index);

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
