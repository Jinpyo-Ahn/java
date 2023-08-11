package ch03.casting_final;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        // 형 변환

        // 문자열 -> 정수
//        String num = "123";
//        int n = Integer.parseInt(num);
//        System.out.println(n);

        // 정수 -> 문자열
        // 1
//        int n = 123;
//        String num = "" + n;
//        System.out.println(num);

        // 2
//        int n = 123;
//        String num1 = String.valueOf(n);
//        String num2 = Integer.toString(n);
//        System.out.println(num1);
//        System.out.println(num2);

        // 소수점이 포함되어 있는 실수 -> 문자열
//        String num = "123.456";
//        double d = Double.parseDouble(num);
//        System.out.println(d);

        // 정수 -> 실수, 실수 -> 정수
//        int n1 = 123;
//        double d1 =n1;
//        System.out.println(d1);
//
//        double d2 = 123.456;
//        int n2 = (int) d2;
//        System.out.println(n2);

        // 실수 형태의 문자열을 정수로 바꿀 때의 에러
//        String num = "123.456";
//        int n = Integer.parseInt(num);



        // final

        // 1
//        final int n = 123;
//        n = 456;

        // 2
//        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
//        a = new ArrayList<>(Arrays.asList("c", "d"));
    }
}
