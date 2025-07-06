import java.io.*;
import java.util.*;
public class Solution_10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //배열을 걍 두개 선언해버리고 일단 나이순으로 정렬하다가
        //나이가 같으면 인덱스값을 비교함
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        //그냥 2차원 문자열 배열로 선언해버림
        //어차피 나이가 같으면 순서가 바뀌지않으므로 가입순대로 정렬이 됨
        //나이와 가입순서를 같이 저장시켜둠
        //ex(20,1) (21,2)
        String[][] inf=new String[N][2];
        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            inf[i][0]=st.nextToken();
            inf[i][1]=st.nextToken();
        }
        br.close();
        Arrays.sort(inf,(s1,s2)->{
            return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
        });
        for(int j=0; j<N; j++){
            bw.write(inf[j][0]+" "+inf[j][1]+"\n");
        }
        bw.flush();
        bw.close();

        //문자열을 출력할 방법을 생각해야됨

    }
}
