import java.util.*;
import java.io.*;
public class Solution_10816ver2 {
    //이분탐색으로 풀어보기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //HashSet으로 선언해서 중복될경우 +1해주는식으로
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        //이분탐색을 위해 오름차순정렬 실행
        Arrays.sort(card);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(card, key) - lowerBound(card, key)).append(' ');
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질때 까지 반복
        while (lo < hi) {
            int mid = (lo + hi) / 2; //중간위치를 구함
            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }


        }
        return lo;
    }

    public static int upperBound(int[] arr,int key){
        int lo=0;
        int hi=arr.length;

        while(lo<hi){
            int mid=(lo+hi)/2;
            //key값이 중간위치의 값보다 작은 경우
            if(key<arr[mid]){
                hi=mid;
            }
            //중복원소의 경우 else에서 처리된다
            else{
                lo=mid+1;
            }
        }

        return lo;
    }

}


