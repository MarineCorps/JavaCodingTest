import java.util.*;
import java.io.*;
public class Sort2 {
    public static void main(String[] args)throws IOException{
        int[][] arr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10},{6,40},{6,50},{6,10},{6,20},{6,30}};
        //Compare 메서드를 오버라이드해서 자신만의 정렬방식으로 바꿈
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                return o1[0]!=o2[0] ? o1[0]-o2[0]:o1[1]-o2[1];
            }
        });
        /*
        Arrays.sort(arr,new Comparator<int[]>(){
        // 첫번째 원소가 같다면 두 번째 원소끼리 비교
            @Override          //람다식 안쓰는 버전
            public int compare(int[] o1,int[] o2){
                if(o1[0]==o2[0]) return o1[1]-o2[1];

                else return return o1[0]-o2[0]
            }
        });
         */
    }
}
