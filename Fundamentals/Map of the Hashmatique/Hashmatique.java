import java.util.HashMap;

public class Hashmatique {


    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Song1","lyrics1");
        trackList.put("Song2","lyrics2");
        trackList.put("Song3","lyrics3");
        trackList.put("Song4","lyrics4");

        System.out.println(trackList.get("Song1"));

        for(String i : trackList.keySet()){
            System.out.println(i +" : "+trackList.get(i));
        }


        
        // System.out.println(trackList.keySet()+" "+trackList.values());
    }

    


}