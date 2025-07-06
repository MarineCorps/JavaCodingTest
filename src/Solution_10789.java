import java.io.*;

public class Solution_10789 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //입력은 5줄 그러므로 5X15배열생성
        char[][] array=new char[5][15];
        for(int i=0; i<5; i++){   //값을 대입할 필요없이 값이 없으면 \u0000(null)값을 가지게됨
            String str=br.readLine();
            for(int j=0; j<str.length(); j++){
                array[i][j]=str.charAt(j);
            }
        }
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(array[j][i]!='\u0000'){    //null값이 아닌경우에만 출력하도록
                    System.out.print(array[j][i]);
                }

            }
        }

        br.close();
    }

}
