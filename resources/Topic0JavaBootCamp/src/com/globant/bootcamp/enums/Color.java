package com.globant.bootcamp.enums;


public enum Color {
    RED("D"),
    WHITE("O");
    private final String letter;

    Color(String letter) {
        this.letter = letter;
    }
    public String getLetter(){
        return letter;
    }
}



