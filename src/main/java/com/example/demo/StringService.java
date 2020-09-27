package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service

public class StringService {
    @Autowired
    private StringRepository stringRepository;

    public String RevertString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int CountWords(String inputText){

        if (inputText.isEmpty()) {
            return 0;
        }

        var repoText = stringRepository.findById(inputText);

        if (repoText.isPresent()) {
            return repoText.get().getWords();
        }
        else {
            InputText newInputText = new InputText(inputText);
            stringRepository.save(newInputText);
            return newInputText.getWords();
        }
    }
}


