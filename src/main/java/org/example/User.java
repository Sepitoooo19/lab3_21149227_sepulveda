package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;

    List<String> chatHistory = new ArrayList<>();

    String tipoUsuario;


    public User(String name, String tipoUsuario) {
        this.name = name;
        this.tipoUsuario = tipoUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getChatHistory() {
        return chatHistory;
    }

    public void addChatHistory(String chatHistory) {
        this.chatHistory.add(chatHistory);
    }



    @Override
    public String toString() {
        return name + " " + chatHistory;
    }
}
