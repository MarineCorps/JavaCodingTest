import java.util.*;
import java.io.*;

public class String_Sort {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        String[] arr=new String[N];
        for(int i=0; i<N; i++){
            arr[i]=br.readLine();
        }
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length()-s2.length();
                }
            }
        });
        /*  람다식 버전
        Arrays.sort(arr,(s1,s2)->{
            if(s1.length()==s2.length()){
                return s1.compareTo(s2);
            }
            else{
                return s1.length()-s2.length();
            }
        });
        */
         
    }

}
