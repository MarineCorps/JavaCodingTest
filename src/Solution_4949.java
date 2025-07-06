import java.util.*;
import java.io.*;
public class Solution_4949 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //첫번째 문자가 .인지 아닌지로 반복문의 종료 파악
        /*
        String str = "Hello 자바123 World!";

        // 영문자 소문자(a~z)와 대문자(A~Z)를 모두 공백으로 치환
        str = str.replaceAll("[a-zA-Z]", " ");
        * */
        StringBuilder sb=new StringBuilder();
        while(true){
            String input=br.readLine();
            if(input.charAt(0)=='.'){
                break;
            }
            sb.append(solve(input)).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static String solve(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='('||c=='['){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.isEmpty() ||stack.peek()!='('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else if(c==']'){
                if(stack.isEmpty() ||stack.peek()!='['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            //나머지 문자는 무시
        }
        if(stack.isEmpty()){
            return "yes";
        }
        else{
            return "no";
        }

    }
}
