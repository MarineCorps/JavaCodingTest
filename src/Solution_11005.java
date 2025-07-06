import java.io.*;
import java.util.*;
//입력은 과목명, 학점, 등급 공백으로 구분되어짐
//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눔
//과목은 20개, 등급이 p인과목은 계산에서 제외
class Solution_11005{   //  A~Z(65~90)
    //입력받은 수를 N으로 나누고 나머지에다가 N의 거듭제곱을 곱함
    //몫이 N보다 작을떄까지 반복
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num=Integer.parseInt(st.nextToken());
        int jin=Integer.parseInt(st.nextToken());
        int temp=0;
        String answer="";
        while(num>0){ //몫이 0보다 클경우(더이상 B진법으로 못바꿀떄까지
            temp=num%jin; //나머지
            if(temp>=10){
                char c=(char)(temp+55); //아스키코드값 55를 더해줌
                answer+=c;
            }
            else{
                answer+=temp;
            }
            num=num/jin;
        }
        for(int i=answer.length()-1; i>=0; i--){
            System.out.print(answer.charAt(i));
        }

        br.close();
    }
}