package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapMain {
    static void main(String[] args) {
        // map은 키와 값의 쌍으로 구성되어 있다.
        // HashMap은 순서를 보장하지 않는다.
        // LinkedHashMap; 입력순서까지 보장한다.
        // Map(키타입, 자료타입>; Map<Integer,String>
        Map<Integer,String> store=new HashMap<>();
        //Map<Integer,String> store=new LinkedHashMap<>();
        store.put(2,"물");
        store.put(5,"짜장면");

        // 키;5 조회
        System.out.println(store.get(5));
        // 키값이 중복되어 들어오면 어떻게 될까?
        // == update
        // put(): 키가 없으면 추가,있으면 수정
        System.out.println("=========================");
        store.put(5,"울면");
        System.out.println(store.get(5));
        // 존재 여부 확인
        // 키 존재 확인
        System.out.println(store.containsKey(10));
        //키 값 존재 확인
        System.out.println(store.containsValue("물"));
        // key=3 value=간짜장
        store.put(3,"간짜장");
        // 전체 출력하기
        // 키:값 -> 형태로 출력
        // 1. for 루프; 키 뭉치로 회전
        System.out.println("### for루프: 키뭉치로 회전");
        for (Integer i; store.keySet()){
            System.out.println(i+":"+store.get(i));
        }
        System.out.println("### foreach 구문으로 회전");
        BiConsumer<? super Integer, ? super String> key;
        Object value;
        store.forEach(key,value)->
        System.out.println(key+":"+value);

    }
}
