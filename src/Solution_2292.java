import java.io.*;

public class Solution_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int room = 1;
        int findroom = 1;
        while(true){
            if(findroom >= n){ //만약 입력받은 방번호가 해당 라인의 최대값보다 작은 거면 해당 방 최소 개수는 구한것!
                break;
            }
            findroom += (room*6); //6의 거듭제곱 (1은 시작점임으로 +1을 해준다)
            room++;
        }

        System.out.println(room);

    }
}