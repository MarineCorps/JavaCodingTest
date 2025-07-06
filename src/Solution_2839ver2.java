import java.util.*;
import java.io.*;
public class Solution_2839ver2 {
    //배열의 최댓값이 주어졌을때는 계수정렬 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        //5키로,3키로 봉지로 가장 적은 봉지를 들어야됨
        //3x+5y=N
        StringBuilder sb=new StringBuilder();
        //5의 배수인경우는 그냥 5로 나눈 몫을 리턴하면됨
        //그 외에 경우에는 경우의 수를 계산
        if(N%5==0){
            //5의 배수인경우
            sb.append(N/5);
        }
        else{
            //그외
            sb.append(cac(N));
        }

        br.close();
        bw.write(sb+"");
        bw.flush();
        bw.close();

    }
    static public int cac(int N){
        int r=N/5;
        int min=Integer.MAX_VALUE; //min값은 MAX_VALUE로 고정됨
        boolean check=true; //true면 초기화가 한번도 안된거임
        //아니면 boolean을 이용하는방법
        while(r>=0){
            int val=N-(5*r);

            if(val%3==0){ //3으로 나누어떨어지는 경우//5로나눈몫과 3으로 나눈몫을 더해줌
                check=false; //-1리턴은 안해도됨

                if(r+(val/3)<min){  //계산한값이 이전값보다 작을 경우 초기화
                    min=r+(val/3);
                }
            }
            r--;
        }
        if(check){
            min=-1;
        }
        return min;
    }


}
