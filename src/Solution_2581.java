import java.io.*;
public class Solution_2581 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // 첫줄에 M 둘째줄에 N
        //M이상N이하의 수중에 소수를 모두찾고 첫줄에는 그합
        //둘째줄에는 제일작은 소수
        //소수가 없는경우에는 -1리턴
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int sum=0; //소수의합
        int min=Integer.MAX_VALUE; //최소 소수
        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                sum+=i;
                if(i<min){
                    min=i;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.print(min);
        }
    }
    // 소수 판별 함수(1과 본인을 제외하고 약수가있는지확인)
    private static boolean isPrime(int num) {
        if (num < 2) return false; // 1은 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) { // √num까지만 검사
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
