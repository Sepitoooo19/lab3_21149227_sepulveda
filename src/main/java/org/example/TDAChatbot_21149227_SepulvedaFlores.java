package org.example;

import java.util.ArrayList;
import java.util.List;

public class TDAChatbot_21149227_SepulvedaFlores implements TDAIChatbot_21149227_SepulvedaFlores {

    private int chatbotID;

    private String name;
    private String welcomeMessage;

    private int startFlowId;


    private List<TDAFlow_21149227_SepulvedaFlores> flows;

    /**
     * Este es el constructor del Chatbot, crea un chatbot con sus flujos, si se repite un flujo, no lo agrega
     * @param chatbotID chatbotID de tipo entero
     * @param name nombre del chatbot de tipo String
     * @param welcomeMessage mensaje de bienvenida del chatbot de tipo String
     * @param startFlowId id del flujo inicial de tipo entero
     * @param flows lista de flujos de tipo Flow
     */
    public TDAChatbot_21149227_SepulvedaFlores(int chatbotID, String name, String welcomeMessage, int startFlowId, List<TDAFlow_21149227_SepulvedaFlores> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = new ArrayList<>();

        for(TDAFlow_21149227_SepulvedaFlores flow: flows){
            boolean existeFlow = false;
            for(TDAFlow_21149227_SepulvedaFlores existenFlows: this.flows){
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

    /**
     * Este metodo retorna el chatbotID
     * @return chatbotID de tipo entero
     */
    public int getChatbotID() {
        return chatbotID;
    }

    /**
     * Este metodo retorna el nombre del chatbot
     * @return nombre del chatbot de tipo String
     */
    public String getName() {

        return name;
    }

    /**
     * Este metodo retorna el startFlowId del chatbot
     * @return startFlowId del chatbot de tipo entero
     */
    public int getStartFlowId() {

        return startFlowId;
    }

    /**
     * Este metodo retorna la lista de flujos del chatbot
     * @return lista de flujos del chatbot de tipo Flow
     */

    public List<TDAFlow_21149227_SepulvedaFlores> getFlows() {

        return flows;
    }

    /**
     * Este metodo agrega un flujo a la lista de flujos del chatbot, si se repite un flujo, no lo agrega
     * @return lista de flujos del chatbot de tipo Flow
     */
    public void chatbotAddFlow(TDAFlow_21149227_SepulvedaFlores flow){

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

    /**
     * Este metodo retorna el flujo con el id dado
     * @param id id del flujo de tipo entero
     * @return flujo con el id dado de tipo Flow
     */
    public TDAFlow_21149227_SepulvedaFlores flowById(int id){
        for(TDAFlow_21149227_SepulvedaFlores flow : flows){
            if(flow.getId() == id){
                return flow;
            }
        }
        return null;
    }



    /**
     * Este metodo retorna el mensaje de bienvenida del chatbot
     * @return mensaje de bienvenida del chatbot de tipo String
     */
    @Override
    public String toString() {
        return "[" +
                chatbotID +
                "," + name+
                "," + welcomeMessage +
                "," + startFlowId + "\n"+
                flows +
                "]";
    }


}
