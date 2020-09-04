package gerzen777gmail.com.wordcounter;

import com.fasterxml.jackson.databind.ObjectMapper;
import gerzen777gmail.com.wordcounter.controller.WordCountRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StringCounterApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void stringCounterTest() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        WordCountRequest wordCountRequest = new WordCountRequest(1, "Grut! I am grut!");

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders
                .post("/wordCounter")
                .content(objectMapper.writerFor(WordCountRequest.class).writeValueAsString(wordCountRequest))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isOk());

        String contentAsString = resultActions
                .andReturn()
                .getResponse()
                .getContentAsString();

        Assertions.assertEquals(contentAsString, "{\"idRequest\":0,\"bookFiltered\":{\"i\":1,\"grut\":2,\"am\":1}}");
    }
}
