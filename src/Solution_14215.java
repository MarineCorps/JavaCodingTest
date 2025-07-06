import java.util.*;
import java.io.*;
public class Solution_14215 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] tr=new int[3];
        int answer=0;
        tr[0]=Integer.parseInt(st.nextToken());
        tr[1]=Integer.parseInt(st.nextToken());
        tr[2]=Integer.parseInt(st.nextToken());
        br.close();
        Arrays.sort(tr);
        //삼각형의 성질을 만족하는경우 만족하지않는 경우,정삼각형으로 나눔

        if(tr[0]+tr[1]>tr[2]){ //만족하는경우 그대로 출력
            answer=tr[0]+tr[1]+tr[2];
        }
        else{ //만족하지 않는경우 긴변을 제외한 두변의 2를곱해서 -1을해줌
            answer=(tr[0]+tr[1])*2-1;
        }

        System.out.println(answer);


    }
}
