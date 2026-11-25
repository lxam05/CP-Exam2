import java.util.*;

public class test{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.asList(100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 0, 0, 115);
        // List<Integer> list = Arrays.asList(100, 100, 0, 100);

        // int n = sc.nextInt();
        // sc.nextLine();
        // int count = 0;
        // List<Integer> list = new ArrayList<>();
        // while(count < n){
        //     int temp = sc.nextInt();
        //     list.add(temp);
        //     sc.nextLine();
        //     count++;
        // }
        int multiplier = 1;
        int subsequent = 1;
        int score = list.get(0);
        for(int i = 1; i < list.size(); i++){

            if(list.get(i) == list.get(i - 1)){
                subsequent++;
                if(subsequent == multiplier * 2 && multiplier < 8){
                    multiplier *= 2;
                }
            }
            else{
                subsequent = 1;
                if(multiplier >= 2){
                    multiplier /= 2;
                }
            }

            System.out.println(multiplier);
            score += list.get(i) * multiplier;
        }

        System.out.println(score);
    }
}

