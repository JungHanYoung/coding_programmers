package practice;

public class MakeWeirdString {

    public String solution(String s) {

        String[] s1 = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for(String temp : s1) {
            char[] tmp = temp.toCharArray();
            for(int i = 0; i < tmp.length; i++) {
                if((i+1) % 2 == 0) {
                    // 짝수 - 소문자
                    sb.append(Character.toLowerCase(tmp[i]));
                } else {
                    // 홀수 - 대문자
                    sb.append(Character.toUpperCase(tmp[i]));
                }
            }
            sb.append(' ');
//            System.out.print(temp + " ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
