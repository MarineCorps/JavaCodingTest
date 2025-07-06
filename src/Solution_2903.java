import java.io.*;

class Solution_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 입력을 먼저 받기
        br.close();

        if (input == null || input.trim().isEmpty()) {  // 입력이 비어 있는 경우 예외 방지
            System.out.println("Invalid input");
            return;
        }

        int count;
        try {
            count = Integer.parseInt(input);  // 정수 변환
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            return;
        }

        int square = 2;  // 초기 정사각형 변의 길이
        int factor = 1;

        for (int i = 0; i < count; i++) {
            square += factor;
            factor *= 2;
        }

        System.out.println(square * square);  // 점 개수 출력
    }
}
