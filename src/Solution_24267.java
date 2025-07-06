import java.io.*;
public class Solution_24267 {
    //입력이 n일때 1부터n-2까지의합 ... 1부터1까지의합
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*
        String input=br.readLine();
        if((input.trim().isEmpty())){
            //공백을 제거한 문자열이 비어있을경우
            return;
        }
        int n=Integer.parseInt(input);
        */
        int n=Integer.parseInt(br.readLine());
        long answer=0;

        br.close();
        for(int i=1; i<=n-2; i++){
            answer+=(long)i*(i+1)/2;
        }
        System.out.println(answer);
        System.out.println(3);
    }

}
