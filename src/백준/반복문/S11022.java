package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer;
        StringBuffer buffer = new StringBuffer();
        for (int count = 0; count < totalCount; count++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());
            int sum = num1 + num2;
            buffer.append("Case #")
                    .append(count+1)
                    .append(": ")
                    .append(num1)
                    .append(" + ")
                    .append(num2)
                    .append(" = ")
                    .append(sum)
                    .append("\n");
        }
        System.out.println(buffer);
    }
}
