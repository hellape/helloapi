package com.example.helloapi;

public class Hello {
    private Long id;
    private String text;

    public Hello(Long id, String text){
        this.id = id;
        this.text = text;
    }
    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }
}