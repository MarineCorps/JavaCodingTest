import java.util.*;
import java.io.*;
public class Solution_2789 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //첫줄에 카드의 개수, M값이 주어짐
        //둘째줄은 카드에 쓰여있는 수
        //M을 넘지않으면서 최대한 가까운 카드3장의합
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[] card_num=new int[N];
        st=new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            card_num[i]=Integer.parseInt(st.nextToken());
        }
        br.close();
        int result=search(card_num,N,M);
        System.out.println(result);
        //일단 배열에 카드전부넣어둠
        //3중for문으로 해야될거같음
        //M값을뺏을때 0이랑더 가까운수를찾아야함

    }
    static int search(int[] arr, int N, int M) {
        int result = 0; //초기값을 0으로 잡아서 계속 갱신되도록

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (M == temp) { //합이같으면 바로 리턴
                        return temp;
                    }
                    // 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신
                    if (result < temp && temp < M) {
                        result=temp;
                    }
                }

            }
        }
        return result;
    }
}
