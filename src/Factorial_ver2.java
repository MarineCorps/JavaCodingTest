//이항 계수는 두개의 항을 전개하여 계수로 나타낸 것
//(a+b)**n을 전개하였을 때 계수를 의미한다는 것
import java.util.*;
import java.io.*;
public class Factorial_ver2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
    }
    public static int factorial(int N){
        if(N<=1) return 1;
        return N*factorial(N-1);
    }
    /*  재귀 함수는 스택형식으로 진행됨
    //입력받는 범위가 13을 초과하면 long으로 선언해야함
    	// return N * factorial(N - 1);
	6 * factorial(5){
		5 * factorial(4){
			4 * factorial(3){
				3 * factorial(2){
					2 * factorial(1){
						return 1;
					}
					return 2 * 1;
				}
				return 3 * 2 * 1;
			}
			return 4 * 3 * 2 * 1;
		}
		return 5 * 4 * 3 * 2 * 1;
	}
	return 6 * 5 * 4 * 3 * 2 * 1;
    * */
}
