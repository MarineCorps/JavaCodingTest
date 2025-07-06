import java.util.*;
import java.io.*;
public class Solution_2941 {
    //배열의 최댓값이 주어졌을때는 계수정렬 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        String[] alpha={"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input=br.readLine();
        //크로아티아 알파벳을 1로 변경하고 문자열의 길이 출력
        br.close();
        for(int i=0; i<alpha.length; i++){
            if(input.contains(alpha[i])){
                input=input.replace(alpha[i],"1");
                //정규표현식을 쓸 필요없으니 replace만 써도됨
            }
        }
        bw.write(input.length()+"");
        bw.flush();
        bw.close();

    }
}
