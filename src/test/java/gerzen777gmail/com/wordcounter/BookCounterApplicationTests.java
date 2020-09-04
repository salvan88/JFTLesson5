package gerzen777gmail.com.wordcounter;

import gerzen777gmail.com.wordcounter.service.WordCountService;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;


public class BookCounterApplicationTests {

    @Test
    public void bookCounterTest() throws IOException {
        WordCountService wordCountService = new WordCountService();
        String book = FileUtils.readFileToString(new File(Objects.requireNonNull(this.getClass().getClassLoader().getResource("Dune.txt")).getFile()), "cp1251");

        Map<String, Integer> stringIntegerMap = wordCountService.countWords(book);

        Assertions.assertEquals(3, stringIntegerMap.get("сей"));
    }
}