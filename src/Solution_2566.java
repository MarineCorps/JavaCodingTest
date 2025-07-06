import java.io.*;
import java.util.*;
public class Solution_2566 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a=0;
        int b=0;
        int max=-1;
        //최댓값을  찾았을때 최댓값과 인덱스값을 기억해야됨
        for(int i=0; i<9;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                int val=Integer.parseInt(st.nextToken());
                if(val>max){
                    max=val;
                    a=i+1;
                    b=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(a+" "+b);
    }
}
