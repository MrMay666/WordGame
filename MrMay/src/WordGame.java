import java.util.HashMap;
import java.util.Random;

public class WordGame {
    public HashMap<String,String> wordsWithTranslation;
    public HashMap<String,Integer> scores;
    public String[] words;
    Random random =new Random();
    public boolean check(String word, String translationToCheck){
        String rightTranslation=wordsWithTranslation.get(word);
        return rightTranslation.equals(translationToCheck);
    }
    public String nextWord(){
        int index=random.nextInt(words.length);
        return words[index];
    }
    public WordGame(){
        this.wordsWithTranslation.put("friend","друг");
        this.wordsWithTranslation.put("cube","куб");
        this.wordsWithTranslation.put("fire","огонь");
        this.scores=new HashMap<>();
        words =new String[wordsWithTranslation.size()];
        int i=0;
        for(String current:this.wordsWithTranslation.keySet()){
            this.scores.put(current,0);
            words[i]=current;
            i++;
        }
    }
}
