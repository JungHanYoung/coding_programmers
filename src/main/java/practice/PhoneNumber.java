package practice;

public class PhoneNumber {

    public static void main(String[] args) {

        String phone_number = "01033334444";

        System.out.println(phone_number);

//        char[] phone = phone_number.toCharArray();

//        for(int i = 0; i < phone.length - 4; i++) {
//            phone[i] = '*';
//        }

        // string "0103333 4444"    "02873 5132"
        // index   0123456 78910     01234 5678
        // "01033334444".substring(7)
//        System.out.println(phone_number.substring(phone_number.length() - 4));
//
//        System.out.println(phone_number.substring(7)); -> 4444
//        System.out.println(phone_number.substring(7, 9)); -> 44



        String remain = phone_number.substring(phone_number.length() - 4);

        String answer = "";

        for(int i = 0 ; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        answer += remain;


        System.out.println(answer);


    }
//
//    public String solution(String phone_number) {
//        String answer = "";
//
//        char[] phone = phone_number.toCharArray();
//
//        for(int i = 0; i < phone.length - 4; i++) {
//            phone[i] = '*';
//        }
//
//        String phone_last = phone_number.substring(phone_number.length() - 4);
//
//
//
//
//
//
//        return ;
//    }
}
