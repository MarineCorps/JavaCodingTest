import java.io.*;
public class Solution_2231 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(br.readLine());
       int result=0;
       for(int i=0; i<N; i++){
           int number=i;
           int sum=0;
           while(number !=0){ //각 자릿수의합 더하기
               sum+=number%10;
               number=number/10;
           }
           if(sum+i==N){ //i값과 자릿수의합의 합이 N과 같으면 끝
               result=i;
               break;
           }
       }
       System.out.println(result);
    }
}
