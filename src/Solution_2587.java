import java.util.*;
import java.io.*;
public class Solution_2587 {
    public static void main(String[] args)throws IOException{
        //첫줄은 평균값
        //두번째 줄은 중앙값
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[5];
        for(int i=0; i<5; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int avg=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
        System.out.println(avg);
        System.out.println(arr[2]);


    }
}
