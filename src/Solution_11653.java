import java.io.*;
public class Solution_11653 {
    public static void main(String[] args)throws IOException{
        BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
        int su=2;
        int num=Integer.parseInt(br.readLine());
        while(true){
            if(num==1){
                break;
            }

            if(num%su==0){
                System.out.println(su);
                num=num/su;
            }
            else{
                su++;
            }

        }
    }

}
