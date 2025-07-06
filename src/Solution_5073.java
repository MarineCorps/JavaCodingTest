import java.util.*;
import java.io.*;
//1.세각이 모두 60
//2.이등변
//3.걍 삼각형
//4.삼각형이 아님
public class Solution_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] tr = new int[3];
        while(true) {
            st=new StringTokenizer(br.readLine());
            tr[0] = Integer.parseInt(st.nextToken());
            tr[1] = Integer.parseInt(st.nextToken());
            tr[2] = Integer.parseInt(st.nextToken());
            if(tr[0]==0&&tr[1]==0&&tr[2]==0){
                break;
            }
            System.out.println(check(tr));
        }


    }

    static String check(int[] array) {
        Arrays.sort(array);
        if(array[0]+array[1]<=array[2]){
            return "Invalid";
        }
        else{
            if(array[0]==array[1]&&array[1]==array[2]){
                return "Equilateral";
            }
            else if(array[0]!=array[1]&&array[1]!=array[2]){
                return "Scalene";
            }
            else{
                return "Isosceles";
            }

        }
    }

}
