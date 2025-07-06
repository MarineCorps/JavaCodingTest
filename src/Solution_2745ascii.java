import java.io.*;
import java.util.*;
public class Solution_2745ascii {
    //Math.pow없이 해도됨
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        //N진수 입력받음
        String str=st.nextToken();
        int answer=0;
        int factor=1; //자릿수 계산용
        //N진수 길이
        int length=str.length();
        int jin=Integer.parseInt(st.nextToken());
        //아스키코드 65~90(A~Z)
        //즉 입력받은 문자에서 55만빼주면 계산 가능
        
        /*   Math.pow사용 버전
        for(int i=0; i<length; i++){
            char C=str.charAt(i);
            //입력받은 문자가 A와 Z사이인 경우
            if(C>='A'&&C<='Z'){
                //55를 뺴는 이유는 A부터Z까지의 아스키코드값이(65~90)이므로
                //10부터 35까지를 바로 나타낼수있음
                answer+=(C-55)*(int)Math.pow(jin,length-i-1);
            }
            else{
                answer+=(C-48)*(int)Math.pow(jin,length-i-1);
            }
        }
        */
        
        for(int i=length-1; i>=0; i--) {  //Math.pow없이계산
            char C = str.charAt(i);
            int value=0;
            //입력받은 문자가 A와 Z사이인 경우
            if (C >= 'A' && C <= 'Z') {
                //55를 뺴는 이유는 A부터Z까지의 아스키코드값이(65~90)이므로
                //10부터 35까지를 바로 나타낼수있음
                value=(C - 55);
            } else {
                value= (C - 48);
            }
            answer+=value*factor;
            factor=factor*jin;
        }
        System.out.println(answer);

        br.close();
    }
}
