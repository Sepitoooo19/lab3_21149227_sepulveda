package org.example;

import java.util.List;

import java.util.ArrayList;


public class Flow implements IFlow{

    int id;

    String namemsg;

    List<Option> options;



    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNamemsg() {

        return namemsg;
    }

    public void setNamemsg(String namemsg) {

        this.namemsg = namemsg;
    }

    public List<Option> getOptions() {

        return options;
    }

    public void setOptions(List<Option> options) {

        this.options = options;
    }

    public Flow(int id, String namemsg, List<Option> options) {
        this.id = id;
        this.namemsg = namemsg;
        this.options = new ArrayList<>();

        for (Option option : options) {
            boolean existeOpcion = false;
            for (Option existenOpciones : this.options) {
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


    public void flowAddOption(Option option){

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


    @Override
    public String toString() {
        return "[" + id + "," +
                namemsg + "," +
                options + "\n" +
                "]";

    }

}
