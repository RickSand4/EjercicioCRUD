package com.upiiz.datos.Models;

public class CommentModel {
    private int id;
    private String text;
    private int product_id;

    public CommentModel(int id, String text, int product_id) {
        this.id = id;
        this.text = text;
        this.product_id = product_id;
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
    public int getProduct_id() {return product_id;}

    public void setProduct_id(int product_id) {this.product_id = product_id;}

}
