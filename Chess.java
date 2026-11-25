import java.util.*;

public class Chess{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        while(sc.hasNextLine()){
            String temp = sc.nextLine();
            list.add(temp);
        }

        char[] first = list.get(1).toCharArray();

        int firsta = first[0] - 'A' + 1;
        int firstb = first[2] - '0';
        int seconda = first[4] - 'A' + 1;
        int secondb = first[6] - '0';

        int[] firstAns = solve(firsta, firstb, seconda, secondb);
        int[] secondAns = solve(seconda, secondb, firsta, firstb);

        char point1;

        if(firstAns[0] > 8 || firstAns[1] > 8){
            System.out.println("error in first");
            firstAns[0] = -1;
            firstAns[1] = -1;
        }
        else{
            for(int i = 0; i < firstAns.length; i++){
                System.out.println(firstAns[i]);
                
            }
        }

        if(secondAns[0] > 8 || secondAns[0] > 8){
            System.out.println("error in second one");
        }
        else{
            for(int i = 0; i < secondAns.length; i++){
                System.out.println(secondAns[i]);
            }
        }


    }

    public static int[] solve(int x1, int y1, int x2, int y2){

       int y3 = y1 - x1;
       
       int x3 = x2 + y2;

       int x = (x3 - y3) / 2;
       int y = y3 + x;

        return new int[]{x,y};
    }
}