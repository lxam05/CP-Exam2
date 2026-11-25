import java.util.*;

public class Backspace{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char[] input = word.toCharArray();

        int skip = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = input.length - 1; i >= 0; i--){
            
            if(input[i] == '<'){
                skip++;
                continue;
            }
            if(skip > 0){
                skip--;
                continue;
            }
            sb.append(input[i]);
        }
        sb.reverse();

        System.out.println(sb);
    }
}