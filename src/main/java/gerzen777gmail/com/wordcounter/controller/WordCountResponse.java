package gerzen777gmail.com.wordcounter.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class WordCountResponse implements Serializable {
    private int idRequest;
    private Map<String, Integer> bookFiltered = new HashMap<>();

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public Map<String, Integer> getBookFiltered() {
        return bookFiltered;
    }

    public void setBookFiltered(Map<String, Integer> bookFiltered) {
        this.bookFiltered = bookFiltered;
    }

    @Override
    public String toString() {
        return "WordCountResponse{" +
                "idRequest=" + idRequest +
                ", bookFiltered=" + bookFiltered +
                '}';
    }
}
