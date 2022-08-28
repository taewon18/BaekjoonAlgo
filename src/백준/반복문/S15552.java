package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class S15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalCount = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer;
        for (int count = 0; count < totalCount; count++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int sum = Integer.parseInt(tokenizer.nextToken())
                    + Integer.parseInt(tokenizer.nextToken());
            writer.write(sum + "\n");
        }
        writer.close();
    }
}
