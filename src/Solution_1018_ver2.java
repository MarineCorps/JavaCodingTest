import java.util.*;
import java.io.*;
public class Solution_1018_ver2 {
    //체스판의 크기는 8x8
    //주어지는 종이의 크기는 8부터 50
    //출발지점을 바꿔가면서 다 계산 해야됨
    //첫번쨰가 흰색인경우, 검은색인경우
    //BWBWBWBW WBWBWBWB 문자열 배열을 만들고 문자 하나 하나 비교 하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); //새로
        int M=Integer.parseInt(st.nextToken()); //가로
        //문자열을 0부터 7까지의 인덱스를검사
        //예를들어 N=10 M=13 이면 아래로 2칸, 옆으로 5칸 갈수있음
        // 0 7 1 8 2 9  새로로는 0 7 1 8 2 9 3 10 4 11 5 12
        String[] board=new String[N];
        for(int i=0; i<N; i++){
            board[i]=br.readLine();
        }
        int sol=Integer.MAX_VALUE;

        for(int i=0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
                int cursol=getSolution(i,j,board);
                if(sol>cursol) sol=cursol;
            }
        }

        StringBuilder sb=new StringBuilder();

        bw.write(sol+"");
        bw.flush();
        bw.close();
    }
    public static int getSolution(int startRow,int startCol,String[] board){
        String[] orgBoard={"WBWBWBWB","BWBWBWBW"}; //짝수행 홀수행 순서
        int whiteSol=0;
        for(int i=0; i<8; i++){  //8X8검사
            int row=startRow+i;  //함수인자로 받아온 행(인덱스값)
            for(int j=0; j<8; j++){
                int col=startCol +j; //함수인자로 받아온 열(인덱스값)
                if(board[row].charAt(col) !=orgBoard[row%2].charAt(j)) whiteSol++;
            }
        }
        return Math.min(whiteSol, 64-whiteSol);
    }


}
