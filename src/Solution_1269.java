import java.util.*;
import java.io.*;
public class Solution_1269 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        //집합 A-B와 B-A의 합집합
        int one=0; //나중에 a에서 뺴주어야할값
        int two=0; //b에ㅐ서 뺼값

        HashSet<Integer> A=new HashSet<>();
        HashSet<Integer> B=new HashSet<>();

        st=new StringTokenizer(br.readLine());

        for(int i=0; i<a; i++){
            A.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine());
        for(int k=0; k<b; k++){
            B.add(Integer.parseInt(st.nextToken()));
        }
        for(int num:A){   //향상된 for문을 사용하면 컬렉션이나 배열을 직접순회
            if(!B.contains(num)){
                two++;
            }
        }
        for(int num:B){
            if(!A.contains(num)){
                one++;
            }
        }
        bw.write(one+two+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
