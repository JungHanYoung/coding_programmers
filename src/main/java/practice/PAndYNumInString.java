package practice;

public class PAndYNumInString {

    boolean solution(String s) {

        int y = 0;
        int p = 0;
        for(char c : s.toCharArray()) {
            if(c == 'Y' || c == 'y') {
                y++;
            } else if(c == 'P' || c == 'p') {
                p++;
            }
        }

        return y == p;
    }
}
