import java.io.*;
public class Solution_13909 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine()); //창문과 사람의 수
        // 4 9 16 때마다 열린게 1개씩 늘어남
        // 2 3 4  즉 N갑의 제곱근에서 소수점을 버린부분과 같음
        StringBuilder sb=new StringBuilder();
        /*  미리 테스트 케이스 돌려보기
        for(int n=1; n<=20; n++){
            boolean[] windows = new boolean[n+1];
            for(int i=1; i<=n; i++){
                int pos = i;
                while(pos <= windows.length-1){
                    windows[pos] = !windows[pos];
                    pos += i;
                }
            }
            int cnt = 0;
            for(boolean w : windows){
                if(w) cnt++;
            }

            sb.append(n + ": " + cnt);
            sb.append("\n");
        }
        bw.write(sb+"");
        */
        bw.write((int)Math.sqrt(N)+"");
        bw.flush();
        bw.close();

        //false는 닫힌거 true는 열린거
    }
}
