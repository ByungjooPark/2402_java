package Edu;


//class Plus implements InterfacePlus{
//    public int plus(int x, int y) {
//        return x + y;
//    }
//}

import java.util.function.*;

public class EduLambda {
    public static void main(String[] args) {
        // 인터페이스 및 오버라딩 이용
//        Plus p = new Plus();
//        System.out.println(p.plus(1, 2));

//        // --- 익명 클래스 이용
//        InterfacePlus obj = new InterfacePlus() {
//            public int plus(int x, int y) {
//                return x + y;
//            }
//        };
//        System.out.println(obj.plus(3, 5));
//
//        // 람다식
//        InterfacePlus lambda = (x, y) -> x + y;
//        System.out.println(lambda.plus(5, 5));

        // --- 표준 함수형 인터페이스 API
        // 파라미터 1개, 리턴값 있다.
        Function<Integer, Integer> funLambda = x -> x + 2;
        System.out.println(funLambda.apply(5));
        // 파라미터 2개, 리턴값 있다.
        BiFunction<Integer, Integer, Integer> funBiLambda = Integer::sum;
        System.out.println(funBiLambda.apply(5, 7));
        // 파라미터 없고, 리턴값이 있다.
        Supplier<Integer> funSupplierLambda = () -> 5;
        System.out.println(funSupplierLambda.get());
        // 파라미터 있고, 리턴값도 있는데, 조건식을 표현하는데 사용
        Predicate<Integer> funPredicateLambda = x -> x % 2 == 0;
        System.out.println(funPredicateLambda.test(5));
        // 파라미터 있고, 리턴은 없다.
        Consumer<String> funConsumerLambda = System.out::println;
        funConsumerLambda.accept("안녕자바");

        // Function 합성
        // andThen
        // x + y 람다식
        BiFunction<Integer, Integer, Integer> biFncPlusLambda = Integer::sum;
        // x - 4 람다식
        Function<Integer, Integer> biFncMinusLambda = x -> x - 4;
        int result1 = biFncPlusLambda.andThen(biFncMinusLambda).apply(6, 4);
        System.out.println(result1);
        // compose
        Function<Integer, Integer> biFncPlusLambda2 = x -> x * 2;
        int result2 = biFncPlusLambda2.compose(biFncMinusLambda).apply(7);
        System.out.println(result2);
        // identity
        Function<Integer, Integer> identityLambda = Function.identity();
        System.out.println(identityLambda.apply(5));

        // --- Predicate 결합
        Predicate<Integer> greater = x -> x > 0;
        Predicate<Integer> lesser = x -> x < 10;
        // &&
        Predicate<Integer> andPredicate = greater.and(lesser);
        System.out.println(andPredicate.test(100));
        // ||
        Predicate<Integer> orPredicate = greater.or(lesser);
        System.out.println(orPredicate.test(-100));
        // !
        Predicate<Integer> notPredicate = greater.negate();
        System.out.println(notPredicate.test(-100));
    }
}
