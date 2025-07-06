import java.util.*;
import java.io.*;
public class Solution_18258 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q=new LinkedList<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int back=0;
        for(int i=0; i<N; i++){
            //삽입할때마다 가장뒤에있는 정수를 변수에 저장시켜야됨
            String command=br.readLine();
            if(command.equals("pop")){
                if(!q.isEmpty()){
                    sb.append(q.poll()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }

            }
            else if(command.equals("size")){
                sb.append(q.size()).append("\n");

            }
            else if(command.equals("empty")){
                if(q.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }

            }
            else if(command.equals("front")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(q.peek()).append("\n");
                }
            }
            else if(command.equals("back")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(back).append("\n");
                }

            }
            else{ //push인경우
                st=new StringTokenizer(command);
                String gar=st.nextToken();
                int num=Integer.parseInt(st.nextToken());
                q.add(num);
                back=num;
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
