import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
//코드 이해해 보기
public class Solution_12789ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());
        int peopleIndex = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            int input = Integer.parseInt(st.nextToken());
            boolean inputFlag = false;

            // input 체크 -> input이 필요한 값인지
            if (input == peopleIndex){
                peopleIndex++;
                inputFlag = true; // 이게 true로 체크되어 있으면 스택 추가 x
            }

            // stack 체크 -> 스택의 peek가 필요한 값인지
            while (!stack.isEmpty() && stack.peek() == peopleIndex){
                stack.pop();
                peopleIndex++;
            }

            // stack 추가
            if (!inputFlag){
                stack.push(input);
            }

        }

        if (stack.isEmpty()){
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();

    }
}
