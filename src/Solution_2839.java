import java.io.*;
public class Solution_2839 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // 3킬로 봉지와 5킬로 봉지가 있음
        // 무게가 주어지면 가장 작은수의 봉지를 배달하는경우를 찾아야됨
        //3의배수인경우, 5의배수인경우, 15의 배수인경우 전부확인
        int N=Integer.parseInt(br.readLine());
        if(N%5==0){
            System.out.println(N/5);
        }
        else{
            func(N);
        }

    }
    public static void func(int N){  //입력으로 들어오는 변수는 바뀌면 안됨
        int mok=N/5;
        int answer=Integer.MAX_VALUE;
        int count=0;
        for(int i=0; i<=mok; i++){
            int check=N-i*5;
            int value=i; //5로 나눈몫의 값
            value+=check/3;
            check=check%3;
            if(check==0){
                count++;
                if(value<answer){
                    answer=value;
                }
            }
        }
        if(count==0){
            System.out.println(-1);
        }
        else{
            System.out.println(answer);
        }
    }

    }

