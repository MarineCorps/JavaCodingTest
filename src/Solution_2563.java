import java.io.*;
import java.util.*;
public class Solution_2563 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //100x100도화지
        int[][] background=new int[100][100]; //초기값은 0

        int answer=0;
        //입력받은 좌표부분을 1로 함
        //색종이(10x10) 개수
        int count=Integer.parseInt(br.readLine());

        //색종이 영역만큼 1로
        for(int i=0; i<count; i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken())-1;
            int y=Integer.parseInt(st.nextToken())-1;
            int num=0;
            //10번 반복
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    background[j][k]=1;
                }
            }
        }
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(background[i][j]==1){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        br.close();
    }

}
