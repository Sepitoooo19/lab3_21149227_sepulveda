package org.example;

import java.util.List;

public class TDAOption_21149227_SepulvedaFlores implements TDAIOption_21149227_SepulvedaFlores {

    private int code;

    private String message;

    private int chatbotCodeLink;

    private int initialFlowCodeLink;

    private List<String> keywords;


    //CONSTRUCTOR

    /**
     * Este constructor es para crear una opcion
     * @param code este es el codigo de la opcion de tipo entero
     * @param message este es el mensaje de la opcion de tipo entero
     * @param chatbotCodeLink este es el chatbotCodeLink de tipo entero
     * @param initialFlowCodeLink este es el initialFlowCodeLink de tipo entero
     * @param keywords esto es una lista de keywords de tipo String
     */
    public TDAOption_21149227_SepulvedaFlores(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }
    //CAPA SELECTORA

    /**
     * Este metodo retorna el codigo de la opcion
     * @return codigo de la opcion
     */
    public int getCode() {
        return code;
    }


    /**
     * Este metodo retorna el mensaje de la opcion
     * @return mensaje de la opcion
     */
    public String getMessage() {
        return message;
    }

    /**
     * Este metodo retorna el chatbotCodeLink de la opcion
     * @return chatbotCodeLink de la opcion
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Este metodo retorna el initialFlowCodeLink de la opcion
     * @return initialFlowCodeLink de la opcion
     */

    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }


    /**
     * Este metodo retorna la lista de keywords de la opcion
     * @return lista de keywords de la opcion
     */
    public List<String> getKeywords() {
        return keywords;
    }


    /**
     * Este metodo retorna la opcion en un string
     * @return opcion en un string
     */
    @Override
    public String toString() {
        return "[" +
                code +
                "," + message + "," +
                chatbotCodeLink +
                "," + initialFlowCodeLink +
                "," + keywords +
                "]";

    }
}


