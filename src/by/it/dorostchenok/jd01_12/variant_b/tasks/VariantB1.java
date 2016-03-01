package by.it.dorostchenok.jd01_12.variant_b.tasks;

import java.util.*;

public class VariantB1 {


    public String getText() {
        return text;
    }

    private String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit Duis leo nunc commodo ac nulla nec suscipit condimentum odio In finibus quam ac maximus ultricies Nullam consequat lacinia est eu convallis Mauris luctus ligula nec purus volutpat et varius nisi sagittis Duis sodales non lectus vel sodales Phasellus libero metus auctor sit amet efficitur vitae mollis quis neque Praesent sit amet nisi malesuada egestas mi vel finibus libero Aliquam tempor dignissim efficitur Phasellus tincidunt tortor ultricies neque interdum id tempor dolor semper Pellentesque lobortis augue risus sed maximus enim sodales sed Phasellus iaculis leo in ornare condimentum felis lorem convallis dolor eget laoreet sem tellus vel tellus Nullam ut lorem sed est lobortis ultricies Proin ligula elit maximus a faucibus non tincidunt imperdiet leo Etiam fermentum rutrum molestie Integer et magna lobortis pretium orci et pellentesque enim Curabitur aliquet auctor dui vitae egestas Proin ac consequat augue Donec a nunc risus";

    private List<String> getWords(){
        List<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));

        return words;
    }

    private Map<String, Integer> countWords(){
        Map<String, Integer> wordMap = new HashMap<>();
        List<String> words = getWords();
        for (String word : words){
            Integer count = wordMap.get(word);
            if (count == null){
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, ++count);
            }
        }

        return wordMap;
    }

    public void printWordCount(){

        for (Map.Entry<String, Integer> entry : countWords().entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void printUniqueWords(){
        Map<String, Integer> map = countWords();
        Set<String> words = map.keySet();
        for (String s : words){
            System.out.println(s);
        }
    }
}
