package DynamicProgramming;

import java.util.Scanner;

public class B1463 {
    // 1로 만들기
    public static void main(String[] args) {
        int[] arr = new int[1000001];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int count = 4; count <= num; count++) {
            int result = count - 1;
            int min = arr[result];

            if(count % 3 == 0) {
                result = count / 3;
                if(arr[result] < min) {
                    min = arr[result];
                }
            }
            if(count % 2 == 0) {
                result = count / 2;
                if(arr[result] < min) {
                    min = arr[result];
                }
            }
            arr[count] = min + 1;
        }
        System.out.println(arr[num]);
    }
}
