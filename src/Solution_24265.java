import java.io.*;
public class Solution_24265 {
    public static void main(String[] args)throws IOException{
        //n-1까지의등차수열의합
        //헷갈리면 안되는게 7번반복이면 1부터 6까지의합
        //즉 n*n+1에 n-1을 대입해야됨
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        br.close();
        long answer=(long)n*(n-1)/2;
        System.out.println(answer);
        System.out.println(2);
    }

}
