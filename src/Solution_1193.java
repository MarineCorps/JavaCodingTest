import java.io.*;

// 대각선의 개수는 1 2 3 4 로늘어남
// 분자분모의 최댓값이 대각선의 칸 개수와 일치함
//대각선의 개수가 홀수일떄와 짝수일떄경우를나눠야함
//입력받을 x 값
//해당 범위의 대각선 칸 개수 ( cross_count )
//해당 대각선 직전 대각선 까지의 칸의 누적 합 ( prev_count_sum )
class Solution_1193{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        br.close();
        int cross_count=1; 
        int prev_count_sum=0;// 직전까지 누적개수
        // 0 1 3 6 이런식으로

        while(true){
            //직선 대각선 누적합+해당대각선 개수 이용한 범위 판별
            if(input<=cross_count+prev_count_sum){
                if(cross_count%2==1){ //대각선의 개수가 홀수
                    //분자가 큰수부터 시작함
                    //분자는 대각선상 블럭의개수 -(X번째-직전 대각선까지의 블록개수-1)
                    //분모는 X번째 - 직전 대각선까지의 블럭개수
                    System.out.print((cross_count-(input-prev_count_sum-1))+"/"+(input-prev_count_sum));
                    break;
                }
                else{
                    System.out.print((input-prev_count_sum)+"/"+(cross_count-(input-prev_count_sum-1)));
                    break;
                }

            }
            else{
                prev_count_sum+=cross_count;
                cross_count++;//대각선의 칸 개수는 1칸씩증가하므로
            }
        }
    }
}