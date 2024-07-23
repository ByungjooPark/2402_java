package Edu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        System.out.println(arr);

        // 1~ 100,000 의 숫자를 배열로 만들어 주세요.
        int[] arr2 = new int[100000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
//        System.out.println(Arrays.toString(arr2));

        // 캐릭터 배열
        char[] arr3 = {'a', 'b', 'c'};
//        System.out.println(Arrays.toString(arr3));

        // 배열 사용 주의 사항
//        int[] arr4 = {1, 2, 3};
//        int[] arr5 = arr4;
//        arr5[1] = 43;
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr4));
        int[] arr4 = {1, 2, 3};

        // for 문 이용
//        int[] arr5 = new int[arr4.length];
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = arr4[i];
//        }

        // Arrays.copyOf() 메소드 이용
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        arr5[1] = 43;
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        // 다차원 배열
        int[][] arr6 = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };
        System.out.println(arr6[0][1]);

        int[] arr7 = {5, 76, 2, 4, 1, 6, 33};
        // 오름차순 정렬 (버블 정렬)
        for (int i = 0; i < arr7.length; i++) {
            boolean completeFlg = true;
            for (int j = 0; j < arr7.length - 1 - i; j++) {
                if(arr7[j] > arr7[j+1]) {
                    int tmp = arr7[j];
                    arr7[j] = arr7[j+1];
                    arr7[j+1] = tmp;
                    completeFlg = false;
                }
            }
            if(completeFlg) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr7));
    }
}
