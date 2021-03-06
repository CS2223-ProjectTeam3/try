import java.io.*;
import java.util.*;

public class hashPortion {
    static ArrayList<String> wordArray = new ArrayList<>();

    public static int hashCode(String word) {
        int h = 0;
        int m = 1000;
        for (int i = 0; i < word.length(); i++) {
            int a = (int) word.charAt(i);
            h = (h * 123 + a) % m;
        }
        return h;
    }

    public static void hashCheckWords (ArrayList<String> words, Integer key){
        wordArray.clear();
        for (int i = 0; i < words.size(); i++){
            int a = hashCode(words.get(i));
            int b = a;
            if (a != key){
                continue;
            }
            wordArray.add(words.get(i));
        }
    }

    public static void hashText(String keyString) throws IOException {
        long startTime = System.nanoTime();
        int count = 0;
        int key = hashCode(keyString);
        ArrayList<String> textWords = new ArrayList<String>();
        File file = new File("acadia.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        while ((line = br.readLine()) != null) {
            Scanner s = new Scanner(line).useDelimiter("[^A-Za-z|'|-]+");
            while (s.hasNext()){
                textWords.add(s.next());
            }
            s.close();
        }
        hashCheckWords(textWords, key);
        for (int i = 0; i < wordArray.size(); i++){
            if (wordArray.get(i).equals(keyString)){
                count += 1;
            }
            continue;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double duration2 = duration * Math.pow(10, -9);
        System.out.println("Execute order " + count + ".\nTime taken to find: " + duration2 + " seconds.");
    }

    public static void main(String[] args) throws IOException {
        hashText("acadia'park");
    }
}
