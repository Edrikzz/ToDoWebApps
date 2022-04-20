package com.example.todowebapps.DTO;


public class toDoDTO {
    private Integer tID;
    private String tTitle;
    private String tDesc;
    private Boolean tComplete;

    public toDoDTO(Integer tID, String tTitle, String tDesc, Boolean tComplete) {
        this.tID = tID;
        this.tTitle = tTitle;
        this.tDesc = tDesc;
        this.tComplete = tComplete;
    }

    public Integer gettID() {
        return tID;
    }

    public void settID(Integer tID) {
        this.tID = tID;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String gettDesc() {
        return tDesc;
    }

    public void settDesc(String tDesc) {
        this.tDesc = tDesc;
    }

    public Boolean gettComplete() {
        return tComplete;
    }

    public void settComplete(Boolean tComplete) {
        this.tComplete = tComplete;
    }
}
