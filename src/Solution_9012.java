import java.util.*;
import java.io.*;
public class Solution_9012 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //스택에 쌓아두고 마지막에 스택이 비어있지않으면 NO출력
        //스택이 비어있는지 아닌지먼저 확인
        //공백이 있는지 없는지 꼭확인
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<N; i++){
            String input=br.readLine();
            for(int j=0; j<input.length(); j++){
                char c=input.charAt(j);
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    if(c==')'){
                        if(stack.peek()=='('){
                            stack.pop();
                        }
                        else{
                            stack.push(c);
                        }
                    }
                    else{ //(인경우
                        stack.push(c);
                    }
                }
            }
            if(stack.isEmpty()){
                sb.append("YES").append("\n");
            }
            else{
                sb.append("NO").append("\n");
            }
            stack.clear();
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
