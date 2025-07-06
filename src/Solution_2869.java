import java.io.*;
import java.util.*;
//up-down으로 나누지만
class Solution_2869{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int up=Integer.parseInt(st.nextToken());
        int down=Integer.parseInt(st.nextToken());
        int length=Integer.parseInt(st.nextToken());
        //마지막날에는 내려가지않으므로 미리빼줌
        int day=(length-down)/(up-down);

        //그러나 나머지가 남는경우에는 하루더 올라가야하므로
        if((length-down)%(up-down)!=0){
            day++; //잔여블록이 남은경우는 한후더 올라가야하므로
        }
        System.out.println(day);
        br.close();



    }
}