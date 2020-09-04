package gerzen777gmail.com.wordcounter.controller;

import gerzen777gmail.com.wordcounter.service.WordCountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCounterController {

    private final WordCountService wordCountService;

    public WordCounterController(WordCountService wordCountService) {
        this.wordCountService = wordCountService;
    }

    @PostMapping("/wordCounter")
    public WordCountResponse wordCounter(@RequestBody WordCountRequest wordCountRequest) {
        WordCountResponse wordCountResponse = new WordCountResponse();
        wordCountResponse.setBookFiltered(wordCountService.countWords(wordCountRequest.getMessageRequest()));

        return wordCountResponse;
    }
}