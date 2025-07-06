import java.util.*;
import java.io.*;
public class Solution_28278 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        Stack<Integer> store=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<N; i++){
            String input=br.readLine();
            if(input.contains("1")){
                st=new StringTokenizer(input);
                String garbage=st.nextToken();
                store.push(Integer.parseInt(st.nextToken()));
            }
            else if(Integer.parseInt(input)==2){
                if(store.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(store.pop()).append("\n");
                }
            }
            else if(Integer.parseInt(input)==3){
                sb.append(store.size()).append("\n");
            }
            else if(Integer.parseInt(input)==4){
                if(store.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else {
                if(store.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(store.peek()).append("\n");
                }
            }

        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
