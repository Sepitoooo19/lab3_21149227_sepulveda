package org.example;

import java.util.List;

import java.util.ArrayList;


public class TDAFlow_21149227_SepulvedaFlores implements TDAIFlow_21149227_SepulvedaFlores {

    private int id;

    private String namemsg;

    private List<TDAOption_21149227_SepulvedaFlores> options;


    /**
     * Este metodo retorna el id del flujo
     * @return id del flujo
     */
    public int getId() {

        return id;
    }

    /**
     * Este metodo retorna el nombre del flujo
     * @return nombre del flujo
     */
    public String getNamemsg() {

        return namemsg;
    }

    /**
     * Este metodo retorna la lista de opciones del flujo
     * @return lista de opciones del flujo
     */
    public List<TDAOption_21149227_SepulvedaFlores> getOptions() {

        return options;
    }

    /**
     * Este constructor crea un flujo con sus opciones, si se repite una opcion, no la agrega
     * @param id id del flow de tipo entero
     * @param namemsg nombre del flow de tipo String
     * @param options lista de opciones de tipo Options
     */
    public TDAFlow_21149227_SepulvedaFlores(int id, String namemsg, List<TDAOption_21149227_SepulvedaFlores> options) {
        this.id = id;
        this.namemsg = namemsg;
        this.options = new ArrayList<>();

        for (TDAOption_21149227_SepulvedaFlores option : options) {
            boolean existeOpcion = false;
            for (TDAOption_21149227_SepulvedaFlores existenOpciones : this.options) {
                if (existenOpciones.getCode() == option.getCode()) {
                    existeOpcion = true;
                    break;
                }
            }
            if (!existeOpcion) {
                this.options.add(option);
            }
        }
    }

    /**
     * Este metodo agrega una opcion al flujo, si se repite una opcion, no la agrega
     * @param option opcion de tipo Option
     */
    public void flowAddOption(TDAOption_21149227_SepulvedaFlores option){

        boolean existeOpcion = false;
        for(int i  = 0; i < options.size(); i++){
            if(options.get(i).getCode() == option.getCode()) {
                existeOpcion = true;
                break;
            }
        }
        if(!existeOpcion){
            this.options.add(option);
        }

    }

    /**
     * Este metodo retorna el mensaje de las opciones del flujo
     * @return mensaje de las opciones del flujo
     */
    public String messageOptions(){
        String message = "";
        for(TDAOption_21149227_SepulvedaFlores option : options){
            message += option.getMessage() + "\n";
        }
        return message;
    }

    /**
     * Este metodo retorna el flujo en forma de String
     * @return flujo en forma de String
     */
    @Override
    public String toString() {
        return "[" + id + "," +
                namemsg + "," +
                options + "\n" +
                "]";

    }

}
