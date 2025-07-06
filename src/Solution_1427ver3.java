import java.io.*;
import java.util.*;
public class Solution_1427ver3 {
    //문자열로 바꾸고 그대로 정렬(0~9)는 아스키 코드로(48~57)
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        char[]arr=br.readLine().toCharArray();
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            bw.write(arr[i]+"");
        }
        bw.flush();
        bw.close();
    }
}
