package com.upiiz.datos.Models;

public class CommentModel {
    private int id;
    private String text;

    public CommentModel(int id, String text) {
        this.id = id;
        this.text = text;
    }
    public CommentModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
