package practice;

public class SumDigit {

    public int solution(int n) {

        int answer = 0;
        for(int i = 10 ; n * 10 / i != 0; i *= 10) {
            int temp = n % i;
            n -= temp;
            answer += temp / (i/10);
        }

        return answer;
    }
}
