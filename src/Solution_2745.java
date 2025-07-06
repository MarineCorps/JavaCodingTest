import java.io.*;
import java.util.*;
public class Solution_2745 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        //N진수 입력받음
        String str=st.nextToken();
        int answer=0;
        //N진수 길이
        int length=str.length();
        int jin=Integer.parseInt(st.nextToken());
        //크기36의배열
        String[] alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        //역for문을 사용해서 첫번째 자리수에 jin의 제곱만큼곱한걸 더함
        for(int i=0; i<length; i++){
            //진법이 10보다 큰경우
            if(jin>10){
                    for(int j=0; j<alpha.length; j++){
                        if(String.valueOf(str.charAt(i)).equals(alpha[j])){
                            answer+=j*(int)Math.pow(jin,length-1-i);
                            break;
                        }
                    }
            }//10진법인경우
            else if(jin==10){
                answer=Integer.parseInt(str);
                break;
            }//진법이 10보다낮은경우
            else{
                int su=Integer.parseInt(String.valueOf(str.charAt(i)));
                answer+=su*(int)Math.pow(jin,length-1-i);
            }
        }
        System.out.println(answer);

    }
}
