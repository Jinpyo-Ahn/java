package ch04.if_sentence;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        // and, or, not 연산자
//        int money = 2000;
//        boolean hasCard = true;
//
//        if(money>=3000 || hasCard) {
//            System.out.println("택시를 타고 가라");
//        } else {
//            System.out.println("걸어가라");
//        }

        // contains
//        ArrayList<String> pocket = new ArrayList<>();
//        pocket.add("paper");
//        pocket.add("handphone");
//        pocket.add("money");
//
//        if(pocket.contains("money")){
//            System.out.println("택시를 타고 가라");
//        } else {
//            System.out.println("걸어가라");
//        }

        // else if
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");

//        if(pocket.contains("money")){
//            System.out.println("택시를 타고 가라");
//        } else {
//            if(hasCard){
//                System.out.println("택시를 타고 가라");
//            } else {
//                System.out.println("걸어 가라");
//            }
//        }

//        if(pocket.contains("money")) {
//            System.out.println("택시를 타고 가라");
//        } else if (hasCard) {
//            System.out.println("택시를 타고 가라");
//        } else {
//            System.out.println("걸어 가라");
//        }

    }
}
