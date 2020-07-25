package io;

public class TextConverter {

    // Attribute
    private String yourText;

    // Setter Attribute
    public void setYourText(String inputText){
        this.yourText = inputText;
    }

    // Getter Attribute
    public String getYourText() {
        return yourText;
    }

    // Method Text Converter
    public String textToUpperCase() {
        return this.yourText.toUpperCase();
    }
}
