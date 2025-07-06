import java.util.*;
import java.io.*;

public class Solution_1018 {
    // 전역 변수 선언
    public static boolean[][] arr;  // 체스판 색상을 저장하는 2차원 배열
    public static int min = 64;     // 최소 칠해야 하는 개수 (최대 64)

    // 메인 메서드 - 프로그램의 시작점
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력: 체스판 크기 N(행)과 M(열) 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 행의 개수
        int M = Integer.parseInt(st.nextToken());  // 열의 개수

        // 체스판의 색상을 저장할 배열 생성
        arr = new boolean[N][M];

        // N개의 줄에 대해 체스판의 색상 정보를 저장
        for (int i = 0; i < N; i++) {
            String str = br.readLine();  // 한 줄씩 입력 받기
            for (int j = 0; j < M; j++) {
                // 'W'이면 true, 'B'이면 false로 저장
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;  // W: 흰색 -> true
                } else {
                    arr[i][j] = false; // B: 검은색 -> false
                }
            }
        }

        // 8x8 체스판을 검사할 수 있는 시작 위치의 최대 값 설정
        int N_row = N - 7; // 행 시작점의 최대 값 N값과M값이 최소 8이기떄문에
        int M_col = M - 7; // 열 시작점의 최대 값

        // 모든 가능한 8x8 체스판의 시작점을 검사
        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                // 각 시작점에서 8x8 체스판을 검사
                find(i, j);
            }
        }

        // 최종적으로 가장 적게 칠해야 하는 칸의 수를 출력
        System.out.println(min);
    }

    // find() 메서드 - (x, y)에서 시작하는 8x8 체스판 검사
    public static void find(int x, int y) {
        // 검사할 8x8 체스판의 끝 좌표 설정
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;  // 다시 칠해야 하는 칸의 개수

        // 체스판의 첫 번째 칸의 색상 저장
        // true: W (흰색), false: B (검은색)
        boolean TF = arr[x][y];

        // 8x8 크기의 체스판 탐색
        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                // 현재 칸의 색이 예상(TF)과 다르면 색칠이 필요
                if (arr[i][j] != TF) {
                    count++;  // 색칠해야 하므로 count 증가
                }
                // 다음 칸은 색이 바뀌어야 하므로 TF를 반전
                TF = !TF;
            }
            // 줄이 바뀌면 첫 칸의 색도 반대가 되어야 함
            TF = !TF;
        }

        /*
         * 첫 번째 칸이 흰색일 때 색칠할 개수는 count
         * 첫 번째 칸이 검은색일 때 색칠할 개수는 (64 - count)
         * 두 가지 경우 중 더 적은 값을 선택
         */
        count = Math.min(count, 64 - count);

        // 현재까지의 최소 값과 비교해 더 작은 값을 저장
        min = Math.min(min, count);
    }
}
