package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    String name;

    int initialChatbotCodeLink;

    List<Chatbot> chatbots;


    public Sistema(String name, int initialChatbotCodeLink, List<Chatbot> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
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
    @Override
    public String toString() {
        return "Sistema{" +
                "name='" + name + '\'' +
                ", initialChatbotCodeLink=" + initialChatbotCodeLink +
                ", chatbots=" + chatbots +
                '}';
    }


}

