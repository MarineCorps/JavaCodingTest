import java.util.*;
import java.io.*;
//좌표 정렬은 가낭 낮은수가 0순위 그담 1 2 3 순위 이런식으로
public class Solution_18870 {
    public static void main(String[] args)throws IOException{
        HashMap<Integer,Integer> rankingmap=new HashMap<>();
        //      key     value
        //     배열원소  우선순위
        //그 말인 즉슨  나중에 원래원소값을 key값에 넣으면
        //해당 value, 즉 우선순위를 리턴받을 수 있음
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        int[] origin=new int[N];
        int[] sorted=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            sorted[i]=origin[i]=Integer.parseInt(st.nextToken());
        }
        br.close();
        //원본배열에 대해 오름차순으로 정렬 한 새 배열을 얻는다.
        Arrays.sort(sorted);
        int rank=0; //0순위 부터
        //정렬된 배열을 map에 하나씩 추가하면서 순위를매김
        for(int v:sorted){
            /*
            이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
            중복되면 안되므로, 원소가 중복되지 않을때만
            map에 원소와 그에 대응되는 순위를 넣어준다.
            */
            if(!rankingmap.containsKey(v)){
                rankingmap.put(v,rank);
                rank++;
            }
        }
        StringBuilder sb=new StringBuilder();
        //원본 배열을 차례대로 순회하면서 해당 원소에 대한 rank를 갖고온다.
        for(int key:origin){
            // 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
            int ranking=rankingmap.get(key);
            sb.append(ranking).append(' ');
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();



    }
}
