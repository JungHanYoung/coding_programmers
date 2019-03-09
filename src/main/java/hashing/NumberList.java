package hashing;

import java.util.HashSet;
import java.util.Set;

public class NumberList {

    /**
     *
     * 입출력 예제
     * phone_book	                return
     * [119, 97674223, 1195524421]	false
     * [123,456,789]	            true
     * [12,123,1235,567,88]	        false
     *
     * @param phone_book
     * @return
     */
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String> set = new HashSet<>();

        for(String phone : phone_book) {
            if(set.size() > 0) {
                for (String str : set) {

                    if (phone.indexOf(str) == 0 || str.indexOf(phone) == 0) {
                        answer = false;
                        break;
                    }
                }
                if(!answer)
                    break;
            }
            set.add(phone);
        }

        return answer;
    }
}
