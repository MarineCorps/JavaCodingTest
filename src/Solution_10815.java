import java.util.*;
import java.io.*;
//첫줄은 가지고있는 카드 수 N
//둘째 줄에는 카드에 적혀있는 정수 -10000000부터 10000000
//셋째 줄에는 찾아야될 카드 수M
//넷째 줄엔느 구해야할 M개의 정수
public class Solution_10815 {
    public static void main(String[] args)throws IOException{
        HashSet<Integer> card=new HashSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            card.add(Integer.parseInt(st.nextToken()));//원소를넣어줌
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());

        StringBuilder sb=new StringBuilder();
        for(int j=0; j<M; j++){
            int num=Integer.parseInt(st.nextToken());
            if(card.contains(num)){
                sb.append("1").append(" ");
            }
            else{
                sb.append("0").append(" ");
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
