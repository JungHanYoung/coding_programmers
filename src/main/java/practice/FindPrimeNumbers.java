package practice;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {

    public int solution(int n) {

        List<Boolean> primeList = new ArrayList<>(n+1);

        primeList.add(false);
        primeList.add(false);

        for(int i = 2; i <= n; i++)
            primeList.add(true);

        for(int i = 2; (i*i) <= n; i++) {
            if(primeList.get(i))
                for(int j = i*i; j<=n; j += i)
                    primeList.set(j, false);
        }

        int answer = 0;
        for(boolean b : primeList) {
            if(b)
                answer++;
        }

        return answer;
    }

    public int solution2(int n) {

        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrimeNumber(i))
                answer++;
        }

        return answer;
    }

    public boolean isPrimeNumber(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
