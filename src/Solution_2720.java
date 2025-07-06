import java.io.*;
import java.util.*;
//입력은 과목명, 학점, 등급 공백으로 구분되어짐
//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눔
//과목은 20개, 등급이 p인과목은 계산에서 제외
class Solution_2720{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] money={25,10,5,1};
        for(int i=0; i<count; i++){
            int val=Integer.parseInt(br.readLine());
            for(int j=0; j<money.length; j++){
                int temp=val/money[j];
                val=val%money[j];
                System.out.print(temp+" ");
            }
            System.out.println();

        }
        br.close();
    }
}