package Edu;

public class ControlStatement {
    public static void main(String[] args) {
        // if문
//        if(조건1) {
//            // 처리 코드
//        } else if(조건2) {
//            // 처리코드
//        } else {
//            // 처리코드
//        }

        // switch 문
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                break;
        }

        // for 문
        for(int i = 0; i < 3; i ++) {
            if ( i == 1) {
                break;
            }
            System.out.println(i);
        }
        // 구구단 출력
//        for(int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d X %d = %d%n", i, j, i * j);
//            }
//        }

        //     *
        //    **
        //   ***
        //  ****
        // *****
        int cnt = 6;
        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= cnt; i++) {
            for (int k = i; k < cnt; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
