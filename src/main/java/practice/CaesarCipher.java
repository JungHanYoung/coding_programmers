package practice;

public class CaesarCipher {

    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                if((char)(c + n) > 'Z')
                    sb.append((char)(c + n - 'Z' + 'A' - 1));
                else
                    sb.append((char)(c + n));
            } else if(c >= 'a' && c <= 'z') {
//                System.out.println((char)(c + n - 'z' + 'a' - 1));
                if((char)(c + n) > 'z')
                    sb.append((char)(c + n - 'z' + 'a' - 1));
                else
                    sb.append((char)(c + n));
            } else if(c >= ' ') {
                sb.append(c);
            }
        }

        return sb.toString();

    }
}
