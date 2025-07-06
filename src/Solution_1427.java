import java.io.*;
import java.util.*;
public class Solution_1427 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr=br.readLine().split("");
        br.close();
        int[] arr2=new int[arr.length];

        for(int i=0; i<arr2.length; i++){
            arr2[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        for(int j=arr2.length-1; j>=0; j--){
            bw.write(arr2[j]+"");
        }
        bw.flush();
        bw.close();
    }
}
