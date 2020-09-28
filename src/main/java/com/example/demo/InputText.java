package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class InputText {
    @Id
    private String text;
    private int words;

    public InputText(){ }

    public InputText(String inputText){
        this.text = inputText;
        String[] words = inputText.split("\\s+");
        this.words = words.length;
    }
}
