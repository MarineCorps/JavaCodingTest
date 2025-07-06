import java.io.*;

public class Solution_1316 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException{
        int count=0;
        int N=Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            if(check()==true){
                count++;
            }
        }
        System.out.println(count);

    }


    public static boolean check() throws IOException {
        boolean[] check=new boolean[26]; //초기 값 false
        //입력받는 문자열이 전 문자열과 같은지 다른지 확인하기위해선언
        int prev=0;
        String str=br.readLine();

        for(int i=0; i<str.length(); i++){
            int now =str.charAt(i); //i번째 문자 저장(현재 문자)아스키코드

            //앞선문자와 i번째 문자가 같지 않다면
            if(prev!=now){
                // 해당문자가 처음 나오는 경우
                if(check[now -'a']==false){
                    check[now -'a']=true; //true로 바꿔줌
                    prev=now;
                }
                else{ //처음나오지도 않았는데 앞선문자와 i번째 문자가 같으면
                    return false; //함수종료
                }
            }

        }
        return true;
    }

}
