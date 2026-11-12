package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStreamTest {
    static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Tomas");
        list.add("Adward");
        list.add("Jack");
        // 전체 리스를 출력
        list.stream().forEach(x-> System.out.println(x+"\t"));
        // 정렬후 출력(스트림 또는 체인)
        list.stream().sorted().forEach(x-> System.out.println(x+"\t"));
        // 각요소의 문자열 길이 출력
        // 원본을 다른 형태의 데이터로 바꾸는 함수;map()
        //["Tomas","Adward","jack"]->출력
        list.stream().map(s->s.length()).forEach(s-> System.out.println(s+"\t"));
        // 문자열의 길이가 5개이상인 애들만 정렬해서 출력
        // filter는 원본을 바꾸지 않는다
        System.out.println("====================");
        list.stream().filter(x->x.length()>=5).sorted().forEach(x-> System.out.println(x+"\t"));

        System.out.println();
        System.out.println("==============================");
        // 정수배열 가공
        List<Integer>inList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // inList의 합계를 계산
        int sum=inList.stream().mapToInt(x->x.intValue()).sum();
        System.out.println("리스트의 합:"+sum);
    }
}
