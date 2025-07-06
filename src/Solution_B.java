import java.util.*;
import java.io.*;

public class Solution_B {
    // 주석: 코드의 목적 및 설명
    // 이 코드는 주원이와 동현이의 공 던지기 게임에서 주원이가 극적으로 이길 수 있는 방법을 찾습니다.
    // DFS와 백트래킹을 사용해 모든 경우의 수를 탐색하여 최소한의 점수로 이기는 조합을 구합니다.

    static int A, B, N;                  // 동현이 점수, 주원이 점수, 과녁 개수
    static int[][] targets;              // 각 과녁의 왼손, 오른손 점수
    static int minScore = Integer.MAX_VALUE;  // 주원이의 최소 점수
    static int resultX = -1, resultY = -1;    // 최종 출력할 과녁 번호

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 점수 및 과녁 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken()); // 동현이 점수
        B = Integer.parseInt(st.nextToken()); // 주원이 점수

        N = Integer.parseInt(br.readLine());  // 과녁 개수
        targets = new int[N+1][2];            // 과녁 정보 저장 배열 (1번부터 N번까지 사용)

        // 2. 각 과녁의 왼손, 오른손 점수 입력
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            targets[i][0] = Integer.parseInt(st.nextToken()); // 왼손 점수
            targets[i][1] = Integer.parseInt(st.nextToken()); // 오른손 점수
        }

        // 3. DFS로 모든 경우의 수 탐색
        dfs(-1, -1);

        // 4. 결과 출력
        if (minScore == Integer.MAX_VALUE) {
            System.out.println("No");
        } else {
            System.out.println(resultX + " " + resultY);
        }
    }

    /**
     * DFS로 왼손(X), 오른손(Y) 조합을 탐색합니다.
     * @param X 왼손으로 던질 과녁 번호
     * @param Y 오른손으로 던질 과녁 번호
     */
    static void dfs(int X, int Y) {
        // 1. 점수 계산
        int score = B; // 현재 주원이 점수

        // 같은 과녁에 던지면 0점
        if (X == Y) {
            score += 0;
        }
        // 서로 다른 과녁에 던진 경우
        else {
            if (X != -1) score += targets[X][0]; // 왼손 점수
            if (Y != -1) score += targets[Y][1]; // 오른손 점수
        }

        // 2. 점수 비교 및 업데이트
        // 동현이보다 높으면서 가장 낮은 점수 찾기
        if (score > A && score < minScore) {
            minScore = score;
            resultX = X;
            resultY = Y;
        }

        // 3. 다음 조합 탐색
        for (int i = 1; i <= N; i++) {
            // 왼손으로 i번 과녁에 던지고 오른손은 안 던짐
            if (X == -1) dfs(i, Y);

            // 오른손으로 i번 과녁에 던지고 왼손은 안 던짐
            if (Y == -1) dfs(X, i);

            // 왼손 X, 오른손 Y 조합
            if (X == -1 && Y == -1) dfs(i, i); // 같은 과녁에 던져서 0점 얻기
            else if (X != i && Y != i) dfs(X, i); // 서로 다른 과녁 조합
        }
    }
}
