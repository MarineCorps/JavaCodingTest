import java.io.*;
import java.util.*;
//입력은 여러테스트 케이스
// 마지막에는 0이2개
// 첫수가 두번쨰수의 약구라면 factor 배수면 multiple둘다 아니면 neither
//Exception in thread "main" java.util.NoSuchElementException
//위와 같은 오류가뜨는것은 입력받는 문자열이 null일경우 발생하므로 예외처리를 해줘야함
class Solution_5086{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) !=null){
            //입력이 null이면 종료
            if(input.trim().isEmpty()) continue;//공백입력 방지

            StringTokenizer st=new StringTokenizer(input);
            int fnum=Integer.parseInt(st.nextToken());
            int snum=Integer.parseInt(st.nextToken());

            if(fnum==0&&snum==0){
                break;
            }
            if(fnum<snum){
                if(snum%fnum==0){
                    System.out.println("factor");
                }
                else{
                    System.out.println("neither");
                }
            }
            else{
                if(fnum%snum==0){
                    System.out.println("multiple");
                }
                else{
                    System.out.println("neither");
                }
            }

        }
        br.close();
    }
}
