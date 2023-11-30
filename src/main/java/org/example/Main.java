package org.example;

import java.util.ArrayList;
import java.util.List;

//a
public class Main {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("hola");
        keywords.add("hi");
        Option op1 = new Option(1, 1, 1, keywords);
        Option op2 = new Option(2, 1, 1, keywords);
        Option op3 = new Option(3, 1, 1, keywords);
        List<Option> options = new ArrayList<>();
        options.add(op1);
        options.add(op2);
        options.add(op3);
        options.add(op3);


        Flow flow = new Flow(1, "Hola", options);


        flow.flowAddOption(op1);
        flow.flowAddOption(op2);
        flow.flowAddOption(op3);


        Flow flow2 = new Flow(2, "Hola", options);
        Flow flow3 = new Flow(3, "Hola", options);
        List<Flow> flows = new ArrayList<>();
        flows.add(flow);
        flows.add(flow2);
        flows.add(flow3);
        flows.add(flow3);


        Chatbot chatbot = new Chatbot(1, "Chatbot", "Hola", 1, flows);
        chatbot.chatbotAddFlow(flow);
        chatbot.chatbotAddFlow(flow2);
        chatbot.chatbotAddFlow(flow3);
        chatbot.chatbotAddFlow(flow3);



        Chatbot chatbot2 = new Chatbot(2, "Chatbot", "Hola", 1, flows);
        Chatbot chatbot3 = new Chatbot(3, "Chatbot", "Hola", 1, flows);

        List<Chatbot> chatbots = new ArrayList<>();

        chatbots.add(chatbot);
        chatbots.add(chatbot2);
        chatbots.add(chatbot3);

        Sistema sistema = new Sistema("Sistema", 1, chatbots);
        System.out.println(sistema);


    }
}