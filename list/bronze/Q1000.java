package list.bronze;

//https://www.acmicpc.net/problem/1000

/*
* 문제 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//Scanner 보다 BufferedReader가 속도가 더 빠르다
public class Q1000 {
public static void main(String[] args) throws IOException {
//    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//
//        System.out.print((x+y));
//    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력을 읽어오기
        String input = br.readLine();

        // 공백을 기준으로 문자열을 나누기
        String[] numbers = input.split(" ");

        int x= Integer.parseInt(numbers[0]);
        int y= Integer.parseInt(numbers[1]);

        System.out.print((x+y));
    }
}
