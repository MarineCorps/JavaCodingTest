import java.util.*;
import java.io.*;
public class Solution_12789 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //순서대로만 받을 수있음
        //1이 나올떄까지 스택에서 꺼내고 다른스택에다가 넣음
        //예를들어서 1번스택에서 2번스택으로 가는건가능한데
        //2번스택에서 1번으로 가는건 불가능

        //번호표의 마지막 번호
        int N=Integer.parseInt(br.readLine());
        int[]linestack=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N; i++){
            linestack[i]=Integer.parseInt(st.nextToken());
        }

        bw.write(solution(linestack));
        bw.flush();
        bw.close();
        br.close();
    }
    public static String solution(int[] stack){
        int count=1;
        Stack<Integer> tmp_stack=new Stack<>();
        for(int i=0; i<stack.length; i++){
            if(stack[i]==count){
                //찾는번호와 일치할경우
                count++;
            }
            else{
                //일치하지 않는경우 stack에 추가
                tmp_stack.push(stack[i]);

            }
            // 보조 스택에서 꺼낼 수 있는 학생이 있는지 반복적으로 확인
            //스택이 비어있지 않고, 스택에 최상단 부분이 count와 일치하면
            //반복문이 지속되면서 계속 확인 할 수있도록 while문으로
            while (!tmp_stack.isEmpty() && tmp_stack.peek() == count) {
                tmp_stack.pop();
                count++;
            }
        }
        if(tmp_stack.isEmpty()){
            return "Nice";
        }
        else{
            return "Sad";
        }

    }
}
