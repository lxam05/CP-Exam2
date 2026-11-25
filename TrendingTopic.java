import java.util.*;

public class TrendingTopic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            String[] hi = tmp.split(" ");
            for(String word : hi){
                if(word.length() < 4){
                    continue;
                }
                if(map.containsKey(word)){
                    int num = map.get(word);
                    num++;
                    map.put(word, num);
                }
                else{
                    map.put(word, 1);
                }
            }
        }
        sc.close();

        for(String id : map.keySet()){
            System.out.println(id + " " + map.get(id));
        }
    }
}