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

        

        


    }

    public static void solve(int x1, int y1, int x2, int y2){

        //y - x = y1 - x1

        //x + y = y2 + x2

        /*
        y3 = y1 - x1
        x3 = x2 + y2

        2x = x3 - y3 -> 
                x = (x3 - y3) / 2

        y = y3 + x
        */
       int y3 = y1 - x1;
       int x3 = x2 + y2;

       int x = (x3 - y3) / 2;
       int y = y3 + x;

       System.out.println("x: " + x + " and y: " + y);
    }
}