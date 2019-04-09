package practice;

public class FindKim {

    public String solution(String[] seoul) {

        int findIndex = -1;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                findIndex = i;
                break;
            }
        }

        return "김서방은 " + findIndex + "에 있다";
    }
}
