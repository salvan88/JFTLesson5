package gerzen777gmail.com.wordcounter.service;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class WordCountService {
    public Map<String, Integer> countWords(String book) {

        List<String> list = new ArrayList<>(Arrays.asList(book.toLowerCase().split("[\\p{Z}\\p{P}\\p{N}\\p{C}\\p{S}]+")));
        Map<String, Integer> result = new HashMap<>();

        for (String word : list) {
            if (result.containsKey(word)) {
                int count = result.get(word);
                result.put(word, count + 1);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }
}
