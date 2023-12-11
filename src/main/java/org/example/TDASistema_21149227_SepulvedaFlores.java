package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDASistema_21149227_SepulvedaFlores implements TDAISistema_21149227_SepulvedaFlores {


    private String name;

    private int initialChatbotCodeLink;

    private List<TDAChatbot_21149227_SepulvedaFlores> chatbots;

    private List<TDAUser_21149227_SepulvedaFlores> registerUserList;

    private List<String> logedUserList;

    private int actualChatbotId;

    private int actualFlowId;


    /**
     * Este metodo es el constuctor del Sistema, crea un sistema con sus chatbots, si se repite un chatbot, no lo agrega
     * @param name nombre del sistema de tipo String
     * @param initialChatbotCodeLink id del chatbot inicial de tipo entero
     * @param chatbots lista de chatbots de tipo Chatbot
     */
    public TDASistema_21149227_SepulvedaFlores(String name, int initialChatbotCodeLink, List<TDAChatbot_21149227_SepulvedaFlores> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.registerUserList = new ArrayList<>();
        this.logedUserList = new ArrayList<>();
        this.chatbots = new ArrayList<>();
        this.actualChatbotId = -1;
        this.actualFlowId = -1;

        for(TDAChatbot_21149227_SepulvedaFlores chatbot: chatbots){
            boolean existeChatbot = false;
            for(TDAChatbot_21149227_SepulvedaFlores existenChatbot: this.chatbots){
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


    /**
     * Este metodo retorna el nombre del sistema
     * @return nombre del sistema de tipo String
     */
    public String getName() {
        return name;
    }


    /**
     *  Este metodo retorna la lista de usuarios registrados
      * @return lista de usuarios registrados de tipo User
     */
    public List<TDAUser_21149227_SepulvedaFlores> getRegisterUserList() {
        return registerUserList;
    }


    /**
     * Este metodo retorna la lista de usuarios logeados
     * @return lista de usuarios logeados de tipo String
     */
    public List<String> getLogedUserList() {
        return logedUserList;
    }




    /**
     * Este metodo retorna la lista de chatbots del sistema
     * @return lista de chatbots del sistema de tipo Chatbot
     */
    public List<TDAChatbot_21149227_SepulvedaFlores> getChatbots() {
        return chatbots;
    }

    /**
     * Este metodo agrega chatbots al sistema, si se repite un chatbot, no lo agrega
     * @param chatbot chatbot de tipo Chatbot
     */
    public void systemAddChatbot(TDAChatbot_21149227_SepulvedaFlores chatbot){

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

    /**
     * Este metodo agrega usuarios al sistema, si se repite un usuario, no lo agrega
     * @param user usuario de tipo User
     */
    public void systemAddUser(TDAUser_21149227_SepulvedaFlores user){
            boolean existeUser = false;
            for(int i  = 0; i < registerUserList.size(); i++){
                if(registerUserList.get(i).getName().equals(user.getName())) {
                    existeUser = true;
                    break;
                }
            }
            if(!existeUser){
                this.registerUserList.add(user);
            }
    }

    /**
     * Este metodo logea un usuario al sistema, si no existe el usuario
     * en la lista de registrados o si ya hay un usuario logeado, no lo logea
     * @param user usuario de tipo String
     */
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

    /**
     * Este metodo retorna el chatbot por id del sistema
     * @return chatbot por id del sistema de tipo Chatbot
     */
    public TDAChatbot_21149227_SepulvedaFlores chatbotById(int id){
        for(TDAChatbot_21149227_SepulvedaFlores chatbot : chatbots){
            if(chatbot.getChatbotID() == id){
                return chatbot;
            }
        }
        return null;
    }

    /**
     * Este metodo deslogea un usuario del sistema
     * @return sistema sin el usuario logeado
     */
    public void systemLogout(){

        logedUserList = new ArrayList<>();
        actualChatbotId = -1;
        actualFlowId = -1;

    }


    /**
     * Este metodo permite conversar con los chatbots del sistema, si no hay usuarios logeados, no conversa
     * @param message mensaje de tipo String
     */
    public void systemTalk(String message){

        if(logedUserList.isEmpty()){
            System.out.println("No hay usuarios logeados");
        }
        else if(actualChatbotId == -1 && actualFlowId == -1)
        {
            TDAChatbot_21149227_SepulvedaFlores chatbot = chatbotById(initialChatbotCodeLink);
            TDAFlow_21149227_SepulvedaFlores flow = chatbot.flowById(chatbot.getStartFlowId());
            Date fecha = new Date();
            String conversation = fecha + " " + logedUserList.get(0)+ ":" + message + "\n" + fecha + " " + chatbot.getName() + " "+ flow.getNamemsg() +"\n" + flow.messageOptions();
            for (TDAUser_21149227_SepulvedaFlores user: registerUserList){
                if(user.getName().equals(logedUserList.get(0))){
                    user.addChatHistory(conversation);
                }
            }
            actualChatbotId = chatbot.getChatbotID();
            actualFlowId = flow.getId();
        }
        else{
            TDAChatbot_21149227_SepulvedaFlores chatbot = chatbotById(actualChatbotId);
            TDAFlow_21149227_SepulvedaFlores flow = chatbot.flowById(actualFlowId);
            for (TDAOption_21149227_SepulvedaFlores option: flow.getOptions()){
                if(option.getKeywords().contains(message) || option.getMessage().contains(message)){
                    actualFlowId = option.getInitialFlowCodeLink();
                    actualChatbotId = option.getChatbotCodeLink();


                    }

                }
            chatbot = chatbotById(actualChatbotId);
            flow = chatbot.flowById(actualFlowId);
            Date fecha = new Date();
            String conversation = fecha + " " + logedUserList.get(0)+ ":" + message + "\n" + fecha + " " + chatbot.getName() + " "+ flow.getNamemsg() +"\n" + flow.messageOptions();
            for (TDAUser_21149227_SepulvedaFlores user: registerUserList){
                if(user.getName().equals(logedUserList.get(0))){
                    user.addChatHistory(conversation);
                }
            }
            }
        }

    /**
     * Metodo que retorna la conversacion de un usuario
      * @param user usuario de tipo String
     * @return conversacion de un usuario de tipo String
     */
    public String systemSynthesis(String user){
        String conversation = "";
        for(TDAUser_21149227_SepulvedaFlores user1 : registerUserList){

            if(user1.getName().equals(user)){
                for (String chatHistory: user1.getChatHistory()){
                    conversation += chatHistory + "\n";
            }
            }
        }
        return conversation;

    }

    /**
     * Metodo que retorna la lista de usuarios registrados
     * @return lista de usuarios registrados de tipo String
     */
    public List<String> getRegisterUserNameList(){
        List<String> registerUserNameList = new ArrayList<>();
        for(TDAUser_21149227_SepulvedaFlores user : registerUserList){
            registerUserNameList.add(user.getName());
        }
        return registerUserNameList;
    }







    /**
     * Este metodo retorna el sistema en un string
     * @return sistema en un string
     */
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

