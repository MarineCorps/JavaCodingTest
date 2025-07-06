import java.io.*;
public class Solution_4949_ver2 {
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
        char[] stack=new char[s.length()];
        int size=0; //0이면 스택이 비어있다는거임
        //예를들어 size=1이라면 스택의 최상단에 있는값의
        //인덱스는 size-1이됨

        for(char val: s.toCharArray()) {
            if(val=='(' || val=='['){
                stack[size]=val;
                size++;
            }
            else if(val==')'){
                if(size==0 || stack[size-1]!='('){
                    return "no";
                }
                else{
                    size--;
                }
            }
            else if(val==']'){
                if(size==0 || stack[size-1]!='['){
                    return "no";
                }
                else{
                    size--;
                }
            }

            //나머지 문자는 무시
        }
        if(size!=0){
            return "no";
        }
        else{
            return "yes";
        }

    }
}
