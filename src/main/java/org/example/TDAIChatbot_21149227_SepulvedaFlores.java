package org.example;

import java.util.List;

public interface TDAIChatbot_21149227_SepulvedaFlores {

    int getChatbotID();

    String getName();

    int getStartFlowId();

    List<TDAFlow_21149227_SepulvedaFlores> getFlows();

    void chatbotAddFlow(TDAFlow_21149227_SepulvedaFlores flow);

    TDAFlow_21149227_SepulvedaFlores flowById(int id);

    String toString();



}
