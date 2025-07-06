import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_25206 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //마지막에 answer값을 count로 나눠주면됨
        double answer=0.0;
        int count=0;
        //학점디폴트값
        //학점 목록
        //20번 반복
        //등급이 p인경우는 계산에서 제외해야되는 조건문 필요함
        for(int i=0; i<20; i++){
            st=new StringTokenizer(br.readLine());
            //과목명
            String name=st.nextToken();
            //학점(숫자)
            double score=Double.parseDouble(st.nextToken());
            //학점(문자)
            String grade=st.nextToken();

            switch (grade){
                case "P":
                    break;
                case "A+":
                    answer+=4.5*score;
                    count+=score;
                    break;
                case "A0":
                    answer+=4.0*score;
                    count+=score;
                    break;
                case "B+":
                    answer+=3.5*score;
                    count+=score;
                    break;
                case "B0":
                    answer+=3.0*score;
                    count+=score;
                    break;
                case "C+":
                    answer+=2.5*score;
                    count+=score;
                    break;
                case "C0":
                    answer+=2.0*score;
                    count+=score;
                    break;

                case "D+":
                    answer+=1.5*score;
                    count+=score;
                    break;
                case "D0":
                    answer+=1.0*score;
                    count+=score;
                    break;
                case "F":
                    answer+=0.0*score;
                    count+=score;
                    break;
            }

        }
        double sol=answer/count;
        if(count==0.0){
            System.out.println(0.0);
        }
        else{
            System.out.printf("%6f",sol);
        }

    }
}
