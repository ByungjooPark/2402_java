package Edu;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello 자바");

        // 변수
        int num = 1;

        // 상수
        final int num2 = 200_000;

//        num2 = 1; // 상수이기 때문에 재할당 불가능

        // 스왑
        int swap1 = 10;
        int swap2 = 30;
        int tmp;

        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

//        System.out.println(swap1);
//        System.out.println(swap2);
        System.out.printf("swap1 = %d,swap2 = %d%n",swap1, swap2);
    }
}
