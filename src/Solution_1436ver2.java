import java.io.*;
public class Solution_1436ver2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //그냥 숫자를 1부터 666을 포함할때 +1
        //부르트하게 풀려고한다는것은 무식하게 푼다고 생각하면됨
        int N=Integer.parseInt(br.readLine());
        if(N>1){
            func(N);
        }
        else{
            System.out.println(666);
        }

    }
    public static void func(int n){
        int count =1;
        int prev_digit=0; //선수 자릿수
        int num=0; //선수 자릿수를 제외한 나머지 뒷 자릿수
        // 앞자리가 6인경우와 아닌경우를 나눠서 생각

        while(true){
            /*
             *  선수 자릿수가 X...666X 이면서 X...6666 이 아닐 경우
             *  (ex. 6660_000, 6660_001, ...)
             */

        }
    }
}
