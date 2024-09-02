package list.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String question = br.readLine();

        int x = Integer.parseInt(question.split(" ")[0]);
        int y = Integer.parseInt(question.split(" ")[1]);

        int result = reverse(reverse(x)+reverse(y));
        System.out.print(result);
    }
    private static int reverse(int num){

        String number = String.valueOf(num);
        String numberArr[] = new String[number.length()];

        for(int i = 0;i<numberArr.length;i++){
            numberArr[i] = String.valueOf(number.charAt(i));
        }

        for(int i = 0;i<numberArr.length/2;i++){
            String temp = numberArr[i];
            numberArr[i] = numberArr[numberArr.length-1-i];
            numberArr[numberArr.length-1-i] = temp;
        }

        number = "";

        for(int i = 0;i<numberArr.length;i++){
            number+=numberArr[i];
        }

        int target = Integer.valueOf(number);
        return target;
    }
}
