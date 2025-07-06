import java.util.*;
import java.io.*;
public class Solution_2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //제일 위에있는 카드를 바닥에 버림, 그다음 제일위에있는 카드를
        //제일 아래에있는 카드 밑으로 옮김
        //1번카드가 제일위에 N번 카드가 제일 아래인 상태로 카드가놓임
        //큐로 선언하고 맨위에 카드를 버리고 그다음위에있는 카드를
        //큐에서 꺼내고 다시 넣음
        int N=Integer.parseInt(br.readLine());
        Queue<Integer> q=new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        while(q.size()>1){
            //첫번째 poll호출후 큐의 크기가 1이면 바로탈출

            //일단 큐에서 제일 밑에있는 원소를 제거함
            q.poll();
            int num=q.poll();
            q.offer(num);
        }
        bw.write(q.poll()+"");
        //bw.write는 정수를 아스키 문자로 변환하여 출력
        //+""을꼭해줘야함
        bw.flush();
        bw.close();
        br.close();

    }
}
