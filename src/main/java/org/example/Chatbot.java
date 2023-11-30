package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chatbot {

    int chatbotID;

    String name;
    String welcomeMessage;

    int startFlowId;


    List<Flow> flows;

    public Chatbot(int chatbotID, String name, String welcomeMessage, int startFlowId, List<Flow> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = new ArrayList<>();

        for(Flow flow: flows){
            boolean existeFlow = false;
            for(Flow existenFlows: this.flows){
                if(existenFlows.getId() == flow.getId()){
                    existeFlow = true;
                    break;
                }
            }
            if(!existeFlow){
                this.flows.add(flow);
            }

        }

    }

    public int getChatbotID() {
        return chatbotID;
    }

    public void setChatbotID(int chatbotID) {

        this.chatbotID = chatbotID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getWelcomeMessage() {

        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {

        this.welcomeMessage = welcomeMessage;
    }

    public int getStartFlowId() {

        return startFlowId;
    }

    public void setStartFlowId(int startFlowId) {

        this.startFlowId = startFlowId;
    }

    public List<Flow> getFlows() {

        return flows;
    }

    public void setFlows(List<Flow> flows) {

        this.flows = flows;
    }

    @Override
    public String toString() {
        return "Chatbot{" +
                "chatbotID=" + chatbotID +
                ", name='" + name + '\'' +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                ", startFlowId=" + startFlowId +
                ", flows=" + flows +
                '}';
    }

    public void chatbotAddFlow(Flow flow){

        boolean existeFlow = false;
        for(int i  = 0; i < flows.size(); i++){
            if(flows.get(i).getId() == flow.getId()) {
                existeFlow = true;
                break;
            }
        }
        if(!existeFlow){
            this.flows.add(flow);
        }

    }
}