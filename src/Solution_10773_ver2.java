import java.io.*;
public class Solution_10773_ver2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //0을 외쳐서, 가장최근에 쓴수를 지움
        //배열로 구현하는것도 가능
        int N=Integer.parseInt(br.readLine());
        int top=-1; //맨위에 원소
        int[] arr=new int[N];

        for(int i=0; i<N; i++){
            int num=Integer.parseInt(br.readLine());

            if(num==0){
                //0이라면 top위치에 있는 원소를 0으로 초기화
                top--;
            }
            else{
                top++;// top이 가리키는 위치 1 증가
                arr[top]=num;
            }
        }
        int sum=0;
        for(int i=0; i<=top; i++){
            //top까지만 계산해주면 됨
            sum+=arr[i];
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
