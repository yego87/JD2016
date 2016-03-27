package by.it.lukin.jd12.B;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordCounter {
    public static void main(String[] args){
        Map<String,Integer> wordMap = new HashMap<>();
        String text = "Cumimpaw is a large cattle region in northern New Mexico. It is a land of rich pastures, of great flocks and herds, a land of running streams, which at last unite in the Currumpaw River. And the king of this whole region was an manual gray wolf. Old Lobo or the king, as the Mexicans called him, was the leader of a pack of gray wolves. All the shepherds and ranchmen of Currumpaw knew him well, and wherever he appeared with his pack of wolves, there was terror among the cattle, and anger and despair among the ranchmen. Lobo was a giant among wolves, and he was very cunning and strong. His voice at night was well-known. If an ordinary wolf howled all night, the shepherds paid little attention to it. But when they heard the deep roar of the manual king in the valley, they prepared to learn in the morning that some of their cattle and sheep were missing. Old Lobo's hand was a small one. Usually, the king of a band of wolves has many followers, hut perhaps other wolves were afraid of Lobo's fierce temper and kept away. However, the ranchmen and shepherds knew that Lobo had only five followers during the last year of his life. Each of these was a wolf of great size, but not one of them could compare with their leader in size and courage. One of the band was a beautiful white wolf that the Mexicans called Blanca. These wolves were well-known to the cowboys, the shepherds and the hunters. Every ranchman was ready to give a big sum of money for the head of any one of the pack, but Lobo and his followers defied all hunters, all poisons and all kinds of traps. For five years they continued to kill at least one cow a day. The band, therefore, killed more than two thousand of the best cattle, for the ranchmen knew too well that Lobo chose only the best.";
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String word = matcher.group();
            if (wordMap.containsKey(word)){
                int count = wordMap.get(word);
                count++;
                wordMap.put(word,count);
            }
            else {
                wordMap.put(word,1);
            }
        }
        System.out.println(wordMap);
    }
}
