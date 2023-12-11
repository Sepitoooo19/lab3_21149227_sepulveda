package org.example;

import java.util.ArrayList;
import java.util.List;

public class TDAUser_21149227_SepulvedaFlores implements TDAIUser_21149227_SepulvedaFlores{

    private String name;

    private List<String> chatHistory = new ArrayList<>();

    private String tipoUsuario;

    /**
     * Constructor que crea un usuario con un nombre y un tipo de usuario
     * @param name nombre del usuario
     * @param tipoUsuario tipo de usuario
     */
    public TDAUser_21149227_SepulvedaFlores(String name, String tipoUsuario) {
        this.name = name;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Este metodo retorna el nombre del usuario
     * @return nombre del usuario
     */
    public String getName() {
        return name;
    }


    /**
     * Este metodo retorna el historial de chat del usuario
     * @return historial de chat del usuario
     */
    public List<String> getChatHistory() {
        return chatHistory;
    }

    /**
     * Este metodo agrega un mensaje al historial de chat del usuario
     * @param chatHistory mensaje a agregar al historial de chat del usuario
     */

    public void addChatHistory(String chatHistory) {
        this.chatHistory.add(chatHistory);
    }

    /**
     * Este metodo retorna el tipo de usuario
     * @return tipo de usuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }






    @Override
    public String toString() {
        return name + " " + chatHistory;
    }
}
