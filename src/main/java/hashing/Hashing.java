package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashing {

    /**
     * 문제 설명
     * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
     *
     * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
     *
     *
     * 입출력 예
     * participant	                            completion	                        return
     * -------------------------------------------------------------------------------------
     * [leo, kiki, eden]	                    [eden, kiki]	                    leo
     * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
     * [mislav, stanko, mislav, ana]	        [stanko, ana, mislav]	            mislav
     *
     * @param participant
     * @param completion
     * @return
     */

    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> party = new HashMap<>();
        for(String pant : participant) {
            party.put(pant, party.getOrDefault(pant, 0) + 1);
        }

        for(String comp : completion) {
            Integer integer = party.get(comp);
            party.put(comp, integer - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = party.entrySet().iterator();
        String answer = null;
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if(next.getValue() == 1) {
                answer = next.getKey();
                break;
            }
        }

        return answer;
    }
}
