package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigestNumber {

    public static void main(String[] args) {

        solution(new int[] {6, 10, 2});
        System.out.println("====================");
        solution(new int[] {10, 13, 4, 55, 28, 100, 103});
    }

    public static String solution(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        Collections.sort(list, (i1, i2) -> {
            String s1 = String.valueOf(i1);
            String s2 = String.valueOf(i2);
            return Integer.parseInt(s2+s1) - Integer.parseInt(s1+s2);
        });

        for(int num : list) {
            System.out.print(num + " ");
            sb.append(num);
        }
        System.out.println();
        System.out.println(sb.toString());

        return null;

//        for(int i = 0; i < numbers.length; i++) {
//            int mod = 0;
//            int divide = 10000;
//            while(mod == 0) {
//                divide /= 10;
//                mod = numbers[i] / divide;
//            }
//            list.add(new Temp(i, mod, numbers[i], divide));
//        }
//        Collections.sort(list);
//
//
//        StringBuilder sb = new StringBuilder();
//        for(Temp t : list) {
//            System.out.print(t.actu + " ");
//            sb.append(t.actu);
//        }
//        System.out.println();
//        System.out.println(sb.toString());
//
//        return null;
    }
}

class Temp implements Comparable<Temp> {
    int index;
    int mod;
    int actu;
    int divide;

    public Temp(int index, int mod, int actu, int divide) {
        this.index = index;
        this.mod = mod;
        this.actu = actu;
        this.divide = divide;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "index=" + index +
                ", mod=" + mod +
                ", actu=" + actu +
                ", divide=" + divide +
                '}';
    }

    @Override
    public int compareTo(Temp o) {
        if(this.mod != o.mod) {
            return o.mod - this.mod;
        } else {
            if(this.divide != o.divide) {
                return this.divide - o.divide;
            } else {
                return this.actu - o.actu;
            }
        }
    }
}