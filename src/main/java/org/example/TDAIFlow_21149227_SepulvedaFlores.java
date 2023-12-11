package org.example;

import java.util.List;

public interface TDAIFlow_21149227_SepulvedaFlores {

    int getId();

    String getNamemsg();

    List<TDAOption_21149227_SepulvedaFlores> getOptions();


    void flowAddOption(TDAOption_21149227_SepulvedaFlores option);

    String messageOptions();

    String toString();



}
