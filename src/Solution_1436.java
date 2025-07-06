import java.io.*;
public class Solution_1436 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //그냥 숫자를 1부터 666을 포함할때 +1
        //부르트하게 풀려고한다는것은 무식하게 푼다고 생각하면됨
        int goal=Integer.parseInt(br.readLine());
        int count=0;
        int number=666;
        while(true){
            String check=String.valueOf(number);
            if(check.contains("666")){
                count++;
            }
            if(count==goal) break;
            number++;
        }
        System.out.println(number);
        br.close();
    }
}
