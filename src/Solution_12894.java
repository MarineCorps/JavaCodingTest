import java.io.*;
//N의 범위가 int의범위(2147483647)10의9승까지만 표현가능
//초과하므로 long형을 써서 N을 입력받아야 한다.
public class Solution_12894 {
    public static void main(String[] args)throws IOException{
        //2개늘어나면 이전보다 5늘음 3개늘어나면 6 4개늘어나면 7
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        // 1 2 3 4 .... 이런식으로 늘어남 사각형의 개수가 늘어나면
        // 4 8 12 16 n+3개 씩 늘어남
        long num=Long.parseLong(br.readLine())*4;
        br.close();
        System.out.println(num);

    }
}
