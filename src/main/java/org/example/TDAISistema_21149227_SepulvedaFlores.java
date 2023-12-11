package org.example;

import java.util.List;

public interface TDAISistema_21149227_SepulvedaFlores {

    String getName();

    List<String> getLogedUserList();

    List<TDAUser_21149227_SepulvedaFlores> getRegisterUserList();


    List<TDAChatbot_21149227_SepulvedaFlores> getChatbots();


    void systemAddChatbot(TDAChatbot_21149227_SepulvedaFlores chatbot);
    void systemAddUser(TDAUser_21149227_SepulvedaFlores user);

    void systemLoginUser(String user);

    void systemLogout();

    void systemTalk(String message);

    String systemSynthesis(String user);

    List<String> getRegisterUserNameList();


}
