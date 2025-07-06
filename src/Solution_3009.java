import java.util.*;
import java.io.*;

public class Solution_3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // 2개의 수를 입력받을때 x좌표 y좌표 중 하나만 나온걸 리턴
        int[] x_arr=new int[3];
        int[] y_arr=new int[3];
        for(int i=0;i<3;i++) {
            st = new StringTokenizer(br.readLine().trim());
            if (st.countTokens() == 2) { //토큰이 2개인지 확인
                x_arr[i] = Integer.parseInt(st.nextToken());
                y_arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        bw.write(find(x_arr)+" "+find(y_arr));
        bw.flush();
        bw.close();


    }
    static int find(int[] array){
        if(array[0]==array[1]){
            return array[2];
        }
        else if(array[0]==array[2]){
            return array[1];
        }
        else{  //3항연산자 써도됨
            return array[0];
        }
    }

}
