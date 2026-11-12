package lambda;

public class LambdaExpression {
    static void main(String[] args) {
        // 1.전달하는 값이 두개 이상일때는 ()안에 넣어야 한다.
        // 2.결과를 리텬할때 처리 절차가 여러줄일때는 항상{}에 넣어야 한다
        //   그리고 return구문도 반드시 필요하다
        // 3.리턴할 문장이 단 한문장이면 return을 생략할수 있다
        Calc add = (x, y) -> {return x+y;};
        Calc minus = (x,y)-> x-y;
        System.out.println(add.calc(3,2));
}
}