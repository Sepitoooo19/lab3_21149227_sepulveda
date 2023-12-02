package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sistema implements ISistema{

    String name;

    int initialChatbotCodeLink;

    List<Chatbot> chatbots;

    List<User> registerUserList;

    List<User> logedUserList;

    List<String> chatHistory;




    public Sistema(String name, int initialChatbotCodeLink, List<Chatbot> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.registerUserList = new ArrayList<>();
        this.logedUserList = new ArrayList<>();
        this.chatHistory = new ArrayList<>();
        this.chatbots = new ArrayList<>();



        for(Chatbot chatbot: chatbots){
            boolean existeChatbot = false;
            for(Chatbot existenChatbot: this.chatbots){
                if(existenChatbot.getChatbotID() == chatbot.getChatbotID()){
                    existeChatbot = true;
                    break;
                }
            }
            if(!existeChatbot){
                this.chatbots.add(chatbot);
            }

        }



    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
        this.initialChatbotCodeLink = initialChatbotCodeLink;
    }

    public List<User> getRegisterUserList() {
        return registerUserList;
    }

    public void setRegisterUserList(List<User> registerUserList) {
        this.registerUserList = registerUserList;
    }

    public List<User> getLogedUserList() {
        return logedUserList;
    }

    public void setLogedUserList(List<User> logedUserList) {
        this.logedUserList = logedUserList;
    }

    public List<String> getChatHistory() {
        return chatHistory;
    }

    public void setChatHistory(List<String> chatHistory) {
        this.chatHistory = chatHistory;
    }

    public List<Chatbot> getChatbots() {
        return chatbots;
    }

    public void setChatbots(List<Chatbot> chatbots) {
        this.chatbots = chatbots;
    }

    public void systemAddChatbot(Chatbot chatbot){

        boolean existeChatbot = false;
        for(int i  = 0; i < chatbots.size(); i++){
            if(chatbots.get(i).getChatbotID() == chatbot.getChatbotID()) {
                existeChatbot = true;
                break;
            }
        }
        if(!existeChatbot){
            this.chatbots.add(chatbot);
        }

    }

    public void systemAddUser(User user){
        boolean existeUser = false;
        for(int i  = 0; i < registerUserList.size(); i++){
            if(registerUserList.get(i).getName() == user.getName()) {
                existeUser = true;
                break;
            }
        }
        if(!existeUser){
            this.registerUserList.add(user);
        }
    }

    public void systemLoginUser(User user) {
        boolean existeUser = false;

        for (int i = 0; i < registerUserList.size(); i++) {
            if (registerUserList.get(i).getName().equals(user.getName())) {
                existeUser = true;
                break;
            }
        }

        boolean isLogedUserListEmpty = logedUserList.isEmpty();
        if (existeUser && isLogedUserListEmpty) {
            this.logedUserList.add(user);
        }
    }

    public void systemLogout(){

        logedUserList = new ArrayList<>();

    }


    @Override
    public String toString() {
        return "["  +
                name + ","
                + initialChatbotCodeLink +
                registerUserList +
                logedUserList +
                chatHistory + "\n" +
                chatbots +
                "]";
    }
}

