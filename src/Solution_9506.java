import java.util.*;
import java.io.*;
public class Solution_9506 {
    // -1이 주어질때 까지 입력받은 수의 약수를
    //ArrayList에 넣어주고 약수의 총합이 입력받은수와
    //일치하는지 확인
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String input;
        ArrayList<Integer> yaksu=new ArrayList<>();
        int sum=0;
        while((input=br.readLine())!=null){
            int num=Integer.parseInt(input);
            if(num==-1){
                break;
            }
            for(int i=1; i<num; i++){
                if(num%i==0){
                    yaksu.add(i);
                    sum+=i;
                }
            }
            if(sum!=num){
                System.out.println(num+" is NOT perfect.");
                yaksu=new ArrayList<>();
                sum=0;
                continue;
            }
            else{
                System.out.print(num+" = ");
                for(int i=0; i<yaksu.size()-1; i++){
                    System.out.print(yaksu.get(i)+" + ");
                }
                System.out.print(yaksu.get(yaksu.size()-1));
                System.out.println();
                yaksu=new ArrayList<>();
                sum=0;
            }

        }

    }
}
