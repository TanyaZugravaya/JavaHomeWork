package org.example.Lesson5;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    //1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово
    // будет являться ключом), вносить все слова не нужно
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        str = str.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        String findWord = "Россия";
        String[] wolds = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : wolds) {
            if (s.equalsIgnoreCase(findWord)) {
                if(wordCount.containsKey(findWord)) {
                    wordCount.put(findWord, wordCount.get(findWord) + 1);
                }else{
                    wordCount.put(findWord, 1);
                }
            }
        }
        System.out.print("Количество искомого слова: " + wordCount.getOrDefault(findWord, 0));
    }
}
