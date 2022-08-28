package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer;
        StringBuffer buffer = new StringBuffer();
        for (int count = 0; count < totalCount; count++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int sum = Integer.parseInt(tokenizer.nextToken())
                    + Integer.parseInt(tokenizer.nextToken());
            buffer.append("Case #")
                    .append(count+1)
                    .append(": ")
                    .append(sum)
                    .append("\n");
        }
        System.out.println(buffer);
    }
}
