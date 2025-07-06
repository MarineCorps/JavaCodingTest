import java.util.*;
import java.io.*;
public class Solution_7785 {
    public static void main(String[] args)throws IOException{
        HashSet<String> str=new HashSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //첫째 줄에 문자열의 개수 N과 검사해야되는 M개의 문자열
        StringTokenizer st;
        //현재 회사에 있는사람만 헤쉬셋에 넣어주고 leave인사람은 없앰
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());

            String name=st.nextToken();
            String state=st.nextToken();
            if(state.equals("enter")){
                str.add(name);
            }
            else if(state.equals("leave")){
                str.remove(name);
            }
        }
        //헤시셋/맵은 바로 어레이 리스트로 바꿀수있음
        ArrayList<String> list=new ArrayList<String>(str);
        Collections.sort(list);
        //역순으로 출력하니까 뒤에부터 출력
        for(int i=list.size()-1;i>=0; i--){
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
