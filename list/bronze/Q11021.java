package list.bronze;


import java.util.Scanner;

//https://www.acmicpc.net/problem/11021
public class Q11021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] result = new int[T];

        for(int i = 0;i<T;i++){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            result[i] = m+n;
        }
        for(int i = 0;i<T;i++) {
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
}
