package practice;

public class HazardNumber {

    public boolean solution(int x) {
        int tmp = x;
        int sum = 0;
        int divide = 10;
        while((x*10) / divide != 0) {
            int temp = x % divide;
            sum += temp;
            x -= temp;
            x /= 10;
        }

        return tmp%sum == 0;
    }
}
