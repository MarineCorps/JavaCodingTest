import java.util.*;
import java.io.*;
//현수의 위치는 x y
//직사각형은 0,0 에서 w,h로 이루어짐
public class Solution_1085 {
    public static void main(String[] args)throws IOException{
        //Math.min을 사용해서 구해보자(배열로 만들어서 정렬해도됨)
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        br.close();
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());

        int x_min=Math.min(x,w-x);
        int y_min=Math.min(y,h-y);
        System.out.println(Math.min(x_min,y_min));
    }
}
