package 프로그래머스.LV2;

public class P1829 {

    private boolean[][] visitInfoArr;

    public static void main(String[] args) {
        P1829 p1829 = new P1829();
        int m = 6;
        int n = 4;
        int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
        p1829.solution(m, n, picture);
    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        visitInfoArr = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = visit(i, j, m, n, picture);
                if (count != 0) {
                    numberOfArea = numberOfArea + 1;
                    if (maxSizeOfOneArea < count) {
                        maxSizeOfOneArea = count;
                    }
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int visit(int currentM, int currentN, int maxM, int maxN, int[][] picture) {
        int count = 0;
        if (visitInfoArr[currentM][currentN]) {
            return count;
        }
        int color = picture[currentM][currentN];
        if (color == 0) {
            return count;
        }

        count = count + 1;
        visitInfoArr[currentM][currentN] = true;

        if (currentM > 0 && picture[currentM - 1][currentN] == color) {
            count = count + visit(currentM - 1, currentN, maxM, maxN, picture);
        }
        if (currentN > 0 && picture[currentM][currentN - 1] == color) {
            count = count + visit(currentM, currentN - 1, maxM, maxN, picture);
        }
        if (currentM < maxM - 1 && picture[currentM + 1][currentN] == color) {
            count = count + visit(currentM + 1, currentN, maxM, maxN, picture);
        }
        if (currentN < maxN - 1 && picture[currentM][currentN + 1] == color) {
            count = count + visit(currentM, currentN + 1, maxM, maxN, picture);
        }

        return count;
    }
}
