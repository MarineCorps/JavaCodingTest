import java.util.*;
import java.io.*;

//자연수가 주어졋을때 1부터 해당자연수까지를 나누고 나머지가 0인경우만
//기억해둠
//입력을 미리읽고 예외처리
//ArrayList .add()원소 추가 .get()원소리턴 이름.size()크기 리턴
public class Solution_2501 {
    public static void main(String[] args)throws IOException{
        ArrayList<Integer> yaksu=new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 입력을 먼저 읽기
        if (input == null || input.trim().isEmpty()) { // 입력이 없거나 공백이면 종료
            System.out.println(0);
            return;
        }
        StringTokenizer st = new StringTokenizer(input);

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        br.close();

        for(int i=1; i<=N; i++){
            if(N%i==0){
                yaksu.add(i);
            }
        }
        if(K>yaksu.size()){
            System.out.println(0);
        }
        else{
            System.out.println(yaksu.get(K-1));
        }

    }


}
