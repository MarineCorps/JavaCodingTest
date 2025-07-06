import java.util.*;
import java.io.*;
public class Solution_24313 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        //모든 n>=n0 에 대하여 fn<=gn 이 성립해야됨
        int fn=Integer.parseInt(st.nextToken());//fn의 n계수
        int s=Integer.parseInt(st.nextToken()); //fn의상수항

        int gn=Integer.parseInt(br.readLine()); //gn의 n계수

        int n=Integer.parseInt(br.readLine()); //n값

        if(fn*n+s<=gn*n&&gn>=fn){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
