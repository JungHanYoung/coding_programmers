package practice;

public class Average {

    public double solution(int[] arr) {
        double answer = 0;




        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }





        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {

        Average average = new Average();

        double result = average.solution(new int[]{1,2,3,4});
        double result1 = average.solution(new int[]{1,2,3,4,5,5,6,7,8,8,9,9,10});

        System.out.println(result);

    }
}
