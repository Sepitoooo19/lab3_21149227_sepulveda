package org.example;

public interface ISistema {


    void systemAddChatbot(Chatbot chatbot);
    void systemAddUser(User user);

    void systemLoginUser(String user);

    void systemLogout();



}
