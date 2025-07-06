import java.util.*;
import java.io.*;
public class Solution_2346 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //1번부터 n번까지 원형으로 놓인 풍선
        //1번 왼쪽에 N번풍선
        //풍선안에 있는 종이에 적혀있는만큼 이동해서 다음풍선을 터뜨림
        //+면 오른쪽, -면 왼쪽
        //터진풍선은 제외하고 이동하므로, 덱에서 뺴주면됨
        //+인경우
        Deque<Balloon> dq=new ArrayDeque<>();

        int N=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());

        StringBuilder sb=new StringBuilder();
        int[] balloonLocation=new int[N];
        //풍선안에있는 움직여야 하는 수를 저장시킴

        for(int i=0; i<N;i++){
            balloonLocation[i]=Integer.parseInt(st.nextToken());
        }
        sb.append("1 ");
        int moveValue=balloonLocation[0]; // 움직여야할 이동 값
        //풍선의 위치와 가지고있는 이동값을 덱에넣음

        //처음풍선은 안넣어도됨
        for(int i=1; i<N; i++){
            dq.offer(new Balloon(i+1,balloonLocation[i]));
            //풍선의 절대위치값, 이동해야되는 값
        }
        //
        while(!dq.isEmpty()){
            if(moveValue>0){
                //오른쪽으로 이동
                //즉 앞에있는 원소를 뒤로 옮김
                //3칸을 이동하는거면 2개를 옮기고 그 다음원소를 뺴줘야됨
                for(int i=1; i<moveValue; i++){
                    dq.offerLast(dq.pollFirst());
                }
                Balloon next=dq.poll(); //poll=Lastpoll
                moveValue=next.numValue; //이동값 갱신
                sb.append(next.index+" ");
                //터뜨린 풍선의 위치값 출력

            }
            else{
                //왼쪽으로 이동
                //앞에있는 원소를 뒤로 옮김
                for(int i=1; i<-moveValue; i++){
                    dq.offerFirst(dq.pollLast());
                }
                Balloon next=dq.pollLast();
                moveValue=next.numValue;
                sb.append(next.index+" ");

            }
        }
        br.close();
        bw.write(sb+"");
        bw.flush();
        bw.close();

    }
}
class Balloon{
    int index;
    int numValue;

    public Balloon(int index,int numValue){
        this.index=index;
        this.numValue=numValue;
    }
}
