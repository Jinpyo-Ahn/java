package ch03.map;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        //HashMap
        //put, get
//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.get("people"));

        //containsKey
//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.containsKey("people"));

        //remove
//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.remove("people"));

        //size
//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.remove("people"));
//        System.out.println(map.size());

        //keySet
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());


    }
}
