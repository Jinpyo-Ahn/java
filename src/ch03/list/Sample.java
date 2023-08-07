package ch03.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        // ArrayList

        // add
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//
//        pitches.add(0,"133");
//        pitches.add(1, "133");

        // get
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches.get(1));

        // size
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches.size());

        // contains
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches.contains("142"));

        // remove
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches.remove("129"));
//        System.out.println(pitches.remove(0));





        // 제네릭스

        // 제너릭스 사용X
//        ArrayList pitches = new ArrayList();
//        pitches.add("138");
//        pitches.add("129");
//
//        String one = (String) pitches.get(0);
//        String two = (String) pitches.get(1);

        // 제네릭스 사용o
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//
//        String one = pitches.get(0);  // 형 변환이 필요없다.
//        String two = pitches.get(1);  // 형 변환이 필요없다.




        // 다양한 방법으로 ArrayList 만들기
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches);

        // 이미 문자열 배열이 있을 때
//        String[] data = {"138", "129", "142"};
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
//        System.out.println(pitches);

        // 이미 문자열 배열이 있을 때 - String 자료형 여러 개 전달
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        System.out.println(pitches);




        // String.join

        // String.join을 사용하지 않고 각 요소 중간에 콤마 넣기
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = "";
//        for(int i = 0; i < pitches.size(); i++) {
//            result += pitches.get(i);
//            result += ",";
//        }
//        result = result.substring(0, result.length() -1);
//        System.out.println(result);

        // String.join 사용해 각 요소 중간에 콤마 넣기
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = String.join(",", pitches);
//        System.out.println(result);

        // String.join 문자열 배열에 사용
//        String[] pitches = new String[]{"138", "129", "142"};
//        String result = String.join(",", pitches);
//        System.out.println(result);




        //리스트 정렬 하기
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
    }
}
