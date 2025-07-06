import java.util.*;
import java.io.*;
public class Solution_11478 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //일단 입력받은 문자열에서 부분문자열을 해시에 저장하면됨
        //해시는 중복이 안되므로 서로  다른 부분의 문자열의 개수를 알 수있음
        String str=br.readLine();
        HashSet<String> part=new HashSet<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){ //substring(a,b)는 a부터 b-1이므로
                String input=str.substring(i,j);  //j가 문자열의 길이와 같아져도 됨
                part.add(input);
            }
        }
        bw.write(part.size()+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
