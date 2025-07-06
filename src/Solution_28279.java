import java.util.*;
import java.io.*;
public class Solution_28279 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        Deque<Integer> dq=new ArrayDeque<>();
        //offerFirst, offerLast, pollFirst, pollLast사용
        //큐는 offer poll
        //스택은 push pop
        //덱은 많음
        StringTokenizer st;

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            String input=br.readLine();
            st=new StringTokenizer(input);
            int num=0;
            int command=Integer.parseInt(st.nextToken());
            switch (command){
                case 1:
                    num=Integer.parseInt(st.nextToken());
                    dq.offerFirst(num);
                    break;
                case 2:
                    num=Integer.parseInt(st.nextToken());
                    dq.offerLast(num);
                    break;
                case 3:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(dq.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(dq.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(dq.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if(!dq.isEmpty()){
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case 8:
                    if(!dq.isEmpty()){
                        sb.append(dq.peekLast()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
