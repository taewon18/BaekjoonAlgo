package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class S10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            if (!tokenizer.hasMoreTokens()) {
                break;
            }
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());
            buffer.append(num1 + num2).append("\n");
        }
        System.out.println(buffer);
    }
}
