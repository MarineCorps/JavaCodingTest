import java.io.*;
public class Solution_24266 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        br.close();
        long answer=(long)n*n*n;
        System.out.println(answer);
        System.out.println(3);
    }

}
