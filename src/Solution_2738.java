import java.util.*;
import java.io.*;

public class Solution_2738 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int[][]array1=new int[a][b];

        //배열에 원소 삽입
        for(int i=0; i<a; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++){
                if(st.hasMoreTokens()){
                    array1[i][j]=Integer.parseInt(st.nextToken());
                }

            }
        }
        //두번째로 입력받을때 원래있던 원소랑 더해줌
        for(int i=0; i<a; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++){
                if(st.hasMoreTokens()){
                    System.out.print(array1[i][j]+Integer.parseInt(st.nextToken())+" ");
                }

            }
            System.out.println();
        }
        br.close();
    }

}
