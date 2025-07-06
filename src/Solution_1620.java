import java.util.*;
import java.io.*;
public class Solution_1620 {
    //아스키 코드 A~Z(65~90) a~z(97~122) 0~9(48~57)
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //헤쉬맵으로 포켓몬의 이름과 도감을 저장해두면 됨
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        //입력값이 문자열로 들어올경우
        HashMap<String,Integer> dogam=new HashMap<>();
        //입력값이 숫자로 들어올 경우
        HashMap<Integer,String> dogam2=new HashMap<>();
        //      Key    Value
        //포켓몬 도감 저장
        for(int i=0; i<N; i++){
            String name=br.readLine();
            dogam.put(name,i+1);//번호와 포켓몬저장
            dogam2.put(i+1,name);
        }
        //입력값이 번호인지 포켓몬이름인지 파악하는 로직이 있어야됨
        //포켓몬의 이름은 첫글자만 대문자 (65~90)아스키코드
        //0~9는 48~57
        for(int j=0; j<M; j++){
            //문자열로 입력값을 받음
            String input=br.readLine();
            //문자열의 첫번째인덱스 문자가 숫자인지 알파벳인지 확인

            if(input.charAt(0)>=49&&input.charAt(0)<=57){
                //숫자로 들어온경우 dogam2사용
                bw.write(dogam2.get(Integer.parseInt(input))+"\n");
            }
            else{
                bw.write(dogam.get(input)+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
    }


