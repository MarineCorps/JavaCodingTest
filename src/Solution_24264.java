import java.io.*;
//int 는 10의9승까지 10의 10승은 안됨
//2147483647
public class Solution_24264 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        //500000*500000은 int의 범위를 초과함
        long sol=(long)n*n;
        br.close();
        System.out.println(sol);
        System.out.println(2);
    }

}
