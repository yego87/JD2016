package by.it.dorostchenok.jd01_12.variant_b;

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

    public void printWordCount(){
        Map<String, Integer> wordMap = new HashMap<>();
        for (String s : getWords()){
            Integer count = wordMap.get(s);
            if (count == null){
                wordMap.put(s, 0);
            }
        }


    }
}
