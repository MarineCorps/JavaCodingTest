import java.util.*;
import java.io.*;
public class Solution_10816 {
    //Hash를 사용할때는 getOrDefalut를 잘 사용해야함
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //HashSet으로 선언해서 중복될경우 +1해주는식으로
        //첫째 줄에 숫자 카드의 개수
        //듈째 줄에는 숫자카드에 적혀있는 정수
        //셋쨰 줄에는 구해야하는 숫자카드의 수
        //넷째줄에는 구해야하는 숫자카드의 적혀있는 수
        HashMap<Integer,Integer> card=new HashMap<>();
        //      정수     개수
        int num=0;
        //몇개를 가지고있는지 확인할 변수
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            int count=1;
            num=Integer.parseInt(st.nextToken());
            count++;
            //이미 존재할경우 +1을 해주고 없으면 1
            card.put(num,card.getOrDefault(num,0)+1);
        }
        int M=Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine());
        //getOrDefalut사용해서 인덱스값이있으면 해당값출력 아니면 지정한값
        for(int j=0; j<M; j++){
            num=Integer.parseInt(st.nextToken());
            bw.write(card.getOrDefault(num, 0) + " ");
            //HashMap에 있으면 value값 출력
            //없으면 0출력
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
