package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema implements ISistema{

    String name;

    int initialChatbotCodeLink;

    List<Chatbot> chatbots;

    List<User> registerUserList;

    List<String> logedUserList;

    int actualChatbotId;

    int actualFlowId;




    public List<Option> actualOptions = new ArrayList<>();


    public Sistema(String name, int initialChatbotCodeLink, List<Chatbot> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.registerUserList = new ArrayList<>();
        this.logedUserList = new ArrayList<>();
        this.chatbots = new ArrayList<>();
        this.actualChatbotId = -1;
        this.actualFlowId = -1;

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

    public List<String> getLogedUserList() {
        return logedUserList;
    }

    public void setLogedUserList(List<String> logedUserList) {
        this.logedUserList = logedUserList;
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

    public void systemLoginUser(String user) {
        boolean existeUser = false;

        for (int i = 0; i < registerUserList.size(); i++) {
            if (registerUserList.get(i).getName().equals(user)) {
                existeUser = true;
                break;
            }
        }

        boolean isLogedUserListEmpty = logedUserList.isEmpty();
        if (existeUser && isLogedUserListEmpty) {
            this.logedUserList.add(user);
        }
    }

    public Chatbot chatbotById(int id){
        for(Chatbot chatbot : chatbots){
            if(chatbot.getChatbotID() == id){
                return chatbot;
            }
        }
        return null;
    }


    public void systemLogout(){

        logedUserList = new ArrayList<>();
        actualChatbotId = -1;
        actualFlowId = -1;

    }




    public void systemTalk(String message){

        if(logedUserList.isEmpty()){
            System.out.println("No hay usuarios logeados");
        }
        else if(actualChatbotId == -1 && actualFlowId == -1)
        {
            Chatbot chatbot = chatbotById(initialChatbotCodeLink);
            Flow flow = chatbot.flowById(chatbot.getStartFlowId());
            Date fecha = new Date();
            String conversation = fecha + " " + logedUserList.get(0)+ ":" + message + "\n" + fecha + " " + chatbot.getName() + " "+ flow.getNamemsg() +"\n" + flow.messageOptions();
            for (User user: registerUserList){
                if(user.getName().equals(logedUserList.get(0))){
                    user.addChatHistory(conversation);
                }
            }
            actualChatbotId = chatbot.getChatbotID();
            actualFlowId = flow.getId();
        }
        else{
            Chatbot chatbot = chatbotById(actualChatbotId);
            Flow flow = chatbot.flowById(actualFlowId);
            for (Option option: flow.getOptions()){
                if(option.getKeywords().contains(message) || option.getMessage().contains(message)){
                    actualFlowId = option.getInitialFlowCodeLink();
                    actualChatbotId = option.getChatbotCodeLink();


                    }

                }
            chatbot = chatbotById(actualChatbotId);
            flow = chatbot.flowById(actualFlowId);
            Date fecha = new Date();
            String conversation = fecha + " " + logedUserList.get(0)+ ":" + message + "\n" + fecha + " " + chatbot.getName() + " "+ flow.getNamemsg() +"\n" + flow.messageOptions();
            for (User user: registerUserList){
                if(user.getName().equals(logedUserList.get(0))){
                    user.addChatHistory(conversation);
                }
            }
            }
        }

    public String systemSynthesis(String user){
        String conversation = "";
        for(User user1 : registerUserList){

            if(user1.getName().equals(user)){
                for (String chatHistory: user1.getChatHistory()){
                    conversation += chatHistory + "\n";
            }
            }
        }
        return conversation;

    }








    @Override
    public String toString() {
        return "["  +
                name + ","
                + initialChatbotCodeLink +
                registerUserList +
                logedUserList + "\n" +
                chatbots +
                "]";
    }
}

