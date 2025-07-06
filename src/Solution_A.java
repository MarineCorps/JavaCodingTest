import java.util.*;
import java.io.*;
public class Solution_A {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        br.close();

        while(true){
            if(num==9999){
                System.out.println(-1);
                break;
            }
            num++;
            String input=String.valueOf(num);
            int a=Integer.parseInt(input.substring(0,2));
            int b=Integer.parseInt(input.substring(2,4));
            if((a+b)*(a+b)==num){
                System.out.println(num);
                break;
            }


        }

}
}
