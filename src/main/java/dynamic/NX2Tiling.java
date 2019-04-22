package dynamic;


public class NX2Tiling {

    public int solution(int n) {
        int answer;
        int i = 3;
        int ans_minus_2 = 1;
        int ans_minus_1 = 2;

        while(i < n) {
            answer = (ans_minus_2 + ans_minus_1) % 1000000007;
            ans_minus_2 = ans_minus_1;
            ans_minus_1 = answer;
            i++;
        }
        answer = (ans_minus_1 + ans_minus_2) % 1000000007;

        return answer;
    }
}
