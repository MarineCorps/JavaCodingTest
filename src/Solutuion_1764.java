import java.util.*;
import java.io.*;
public class Solutuion_1764 {
    //그러니까 듣 듣 보 듣 듣 보 이런순서대로 주어지는거임
    //       0  1 2  3  4  5
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken()); //듣도못한 사람 수
        int M=Integer.parseInt(st.nextToken()); //보도 못한 사람 수

        HashSet<String> listen=new HashSet<>();
        HashSet<String> watch=new HashSet<>();
        int count=0;
        StringBuilder sb=new StringBuilder();
        //그냥 헤시셋에 넣으면서 이미존재한다면 sb에 추가 count변수에 추가
        for(int i=0; i<N; i++){
            listen.add(br.readLine());
        }
        for(int j=0; j<M; j++){
            watch.add(br.readLine());
        }
        ArrayList<String> list=new ArrayList<>(watch);
        Collections.sort(list);
        for(int k=0; k<list.size(); k++){
            if(listen.contains(list.get(k))){
                sb.append(list.get(k)).append("\n");
                count++;
            }
        }

        bw.write(count+"\n"+sb);
        bw.flush();
        br.close();
        bw.close();
    }
}
