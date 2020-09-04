package gerzen777gmail.com.wordcounter.controller;

public class WordCountRequest {

    private int idRequest;
    private String messageRequest;

    public WordCountRequest(int idRequest, String messageRequest) {
        this.idRequest = idRequest;
        this.messageRequest = messageRequest;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getMessageRequest() {
        return messageRequest;
    }

    public void setMessageRequest(String messageRequest) {
        this.messageRequest = messageRequest;
    }
}
