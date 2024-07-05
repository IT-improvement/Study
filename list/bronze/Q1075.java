package list.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int temp = N%100;
        N-=temp;
        int result = 0;
        while(N%F!=0){
            N++;
            result++;
        }
        if(result<10){
            System.out.print("0"+result);
        }else{
            System.out.print(result);
        }
    }
}
// 시간 초 확인하기