import java.util.*;
import java.io.*;
public class Solution_1181 {
    //사전순 정렬은 compareTo() 기억해두기
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        //1.길이가 짧은 것부터
        //2.길이가 같으면 사전순으로
        //3.입력받을때 중복된 단어는 하나만
        //4.일단 문자열의 길이별로 정렬하고 길이가 같으면 사전순
        String[] arr=new String[N];
        for(int i=0; i<N; i++){
            arr[i]=br.readLine();
        }
        br.close();
        Arrays.sort(arr,(o1,o2)->{
            //단어의 길이가 같은경우
            if(o1.length()==o2.length()){
                //두개의 문자의 아스키코드 값을 빼줌
                return o1.compareTo(o2);
            }
            //단어의 길이가 다른경우 그냥 길이로 비교
            else{
                return o1.length()-o2.length();
            }
        });

        bw.write(arr[0]+"\n");
        for(int j=1; j<N; j++){
            if(!arr[j].equals(arr[j-1])){
                bw.write(arr[j]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
