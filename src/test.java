import java.util.*;
import java.io.*;
//아스키 코드 65 90
class Solution
{
    public static String[][] table={{"E","A","X","C","X","A"},{"A","E","A","X","C","X"},
            {"X","A","E","A","X","C"},{"C","X","A","E","A","X"},{"X","C","X","A","E","A"},{"A","X","C","X","A","E"}};
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        HashMap<String,Integer> color=new HashMap<>();

        color.put("red",0);color.put("purple",1);color.put("blue",2);
        color.put("green",3);color.put("yellow",4);color.put("orange",5);
        //빨간색을 0으로 잡으면 빨 보 파 초 노 주
        //                  0  1  2  3  4  5
        //마주보는 경우에는 두수를 뻈을때 절댓값이 3
        //인접한 경우에는 절댓값이 1
        for(int i = 0; i<N; i++)
        {
            st=new StringTokenizer(br.readLine());
            String one=st.nextToken();
            String two=st.nextToken();
            int a=color.get(one);
            int b=color.get(two);
            sb.append(table[a][b]).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }

}