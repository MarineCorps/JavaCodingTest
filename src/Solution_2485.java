import java.io.*;

public class Solution_2485 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //유클리드호제법으로 어떻게?
        //각각의 간격들중에 유클리드호제법을통해 최대공약수를구해야됨
        // 앞에간격에서 구한 최대공약수와 그다음간격이랑 또 구하는 식으로
        int N=Integer.parseInt(br.readLine());
        int[] tree=new int[N];
        for(int i=0; i<N; i++){
            tree[i]=Integer.parseInt(br.readLine());
        }
        //유클리드 호제법의 정의상 gcd(a,0)=a이므로 0으로잡음
        int r=0; //가로수 간격의 최대공약수를 저장
        for(int j=0; j<N-1; j++){
            int gap=tree[j+1]-tree[j];
            r=gcd(gap,r);
        }
        //처음 나무에서 끝나무까지의간격에서 최대공약수로 나누고-1, 기존에있던 나무를
        //뺴줘야됨
        int one=((tree[N-1]-tree[0])/r)-1-(tree.length-2) ;
        bw.write(one+"");
        bw.flush();
        bw.close();
        br.close();


    }
    //유클리드호제법
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}

