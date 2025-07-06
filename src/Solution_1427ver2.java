import java.io.*;

public class Solution_1427ver2 {
    //어차피 10으로 나눈 나머지는 0부터 9이므로 크기가 10인배열 먼저 선언
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();

        int[] counting=new int[10]; //0부터9게수를 나타냄
        int N=Integer.parseInt(br.readLine());
        while(N>0){
           counting[N%10]++;
           N=N/10;
        }
        for(int i=9; i>=0; i--){
            while(counting[i]>0){
                sb.append(i);
                counting[i]--;
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
