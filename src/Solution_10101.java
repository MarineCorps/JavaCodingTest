import java.util.*;
import java.io.*;
//1.세각이 모두 60
//2.이등변
//3.걍 삼각형
//4.삼각형이 아님
public class Solution_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tr = new int[3];
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(br.readLine());
            tr[i] = a;
        }

        System.out.println(check(tr));
        br.close();

    }

    static String check(int[] array) {
        Arrays.sort(array);
        if (array[0] + array[1] + array[2] == 180) {
            if (array[0] != array[1]&&array[1] != array[2]) {
                return "Scalene";
            } else if (array[0] == 60) { //어차피 오름차순정렬에서 가장 작은각이 60이면
                //무조건 정삼각형
                return "Equilateral";
            } else {
                return "Isosceles";
            }
        } else {
            return "Error";
        }
    }

}
