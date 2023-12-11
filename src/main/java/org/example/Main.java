package org.example;

import java.util.ArrayList;
import java.util.List;


//a
public class Main {
    public static void main(String[] args) {

        //CHATBOT 0
        List<String> keywords = new ArrayList<>();
        List<String> keywords2 = new ArrayList<>();
        List<String> keywords3 = new ArrayList<>();

        keywords.add("videos");
        keywords.add("aprender");
        keywords.add("usachpremium");

        keywords2.add("procastinar");

        keywords3.add("juegos");
        keywords3.add("videojuegos");
        keywords3.add("consolas");

        TDAOption_21149227_SepulvedaFlores a1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Ayudantias", 1, 1, keywords);
        TDAOption_21149227_SepulvedaFlores a2 = new TDAOption_21149227_SepulvedaFlores(2, "2) Flojear", 2, 1, keywords2);
        TDAOption_21149227_SepulvedaFlores a3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Jugar", 3, 1, keywords3);

        List<TDAOption_21149227_SepulvedaFlores> options = new ArrayList<>();
        options.add(a1);
        options.add(a2);
        options.add(a3);

        TDAFlow_21149227_SepulvedaFlores flow = new TDAFlow_21149227_SepulvedaFlores(1, "Flujo Principal Chatbot 1\nBienvenido ¿Qué te gustaría hacer?", options);
        List<TDAFlow_21149227_SepulvedaFlores> flows = new ArrayList<>();
        flows.add(flow);
        flows.add(flow);

        flow.flowAddOption(a1);
        flow.flowAddOption(a2);
        flow.flowAddOption(a3);

        TDAChatbot_21149227_SepulvedaFlores chatbot0 = new TDAChatbot_21149227_SepulvedaFlores(0, "Inicial", "Inicial Bienvenido\n¿Qué te gustaría hacer?", 1, flows);


        //CHATBOT 1 Flujo 1

        List<String> keywords4 = new ArrayList<>();
        List<String> keywords5 = new ArrayList<>();
        List<String> keywords6 = new ArrayList<>();
        List<String> keywords7 = new ArrayList<>();


        keywords4.add("calculo1");
        keywords4.add("fisica1");
        keywords4.add("algebra1");
        keywords4.add("idi");

        keywords5.add("calculo2");
        keywords5.add("fisica2");
        keywords5.add("algebra2");
        keywords5.add("progra");

        keywords6.add("calculo3");
        keywords6.add("electro");
        keywords6.add("econo");
        keywords6.add("edo");

        keywords7.add("regresar");
        keywords7.add("volver");
        keywords7.add("salir");

        TDAOption_21149227_SepulvedaFlores b1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Primer Nivel", 1, 2, keywords4);
        TDAOption_21149227_SepulvedaFlores b2 = new TDAOption_21149227_SepulvedaFlores(2, "2) Segundo Nivel", 1, 3, keywords5);
        TDAOption_21149227_SepulvedaFlores b3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Tercer Nivel", 1, 4, keywords6);
        TDAOption_21149227_SepulvedaFlores b4 = new TDAOption_21149227_SepulvedaFlores(4, "4) Volver", 0, 1, keywords7);

        //Chatbot 1 Flujo 2

        List<String> keywords8 = new ArrayList<>();
        List<String> keywords9 = new ArrayList<>();
        List<String> keywords10 = new ArrayList<>();
        List<String> keywords11 = new ArrayList<>();

        keywords8.add("funciones");
        keywords8.add("limites");
        keywords8.add("derivadas");

        keywords9.add("polinomios");
        keywords9.add("logica");
        keywords9.add("conjuntos");

        keywords10.add("energia");
        keywords10.add("vectores");
        keywords10.add("fuerza");

        keywords11.add("volver");
        keywords11.add("cambiar");
        keywords11.add("salir");

        TDAOption_21149227_SepulvedaFlores c1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Calculo 1", 1, 2, keywords8);
        TDAOption_21149227_SepulvedaFlores c2 = new TDAOption_21149227_SepulvedaFlores(2, "2) Algebra 1", 1, 2, keywords9);
        TDAOption_21149227_SepulvedaFlores c3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Fisica 1", 1, 2, keywords10);
        TDAOption_21149227_SepulvedaFlores c4 = new TDAOption_21149227_SepulvedaFlores(4, "4) Cambiar Nivel", 1, 1, keywords11);

        //Chatbot 1 Flujo 3

        List<String> keywords12 = new ArrayList<>();
        List<String> keywords13 = new ArrayList<>();
        List<String> keywords14 = new ArrayList<>();
        List<String> keywords15 = new ArrayList<>();
        List<String> keywords16 = new ArrayList<>();

        keywords12.add("youtube");
        keywords12.add("uvirtual");

        keywords13.add("shorts");
        keywords13.add("ejercicios");

        keywords14.add("drive");
        keywords14.add("guias");
        keywords14.add("resumenes");

        keywords15.add("volver");
        keywords15.add("ramos");

        keywords16.add("nivel");


        TDAOption_21149227_SepulvedaFlores d1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Ayudantias completas", 1, 3, keywords12);
        TDAOption_21149227_SepulvedaFlores d2 = new TDAOption_21149227_SepulvedaFlores(2, "2) Capsulas", 1, 3, keywords13);
        TDAOption_21149227_SepulvedaFlores d3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Papeo", 1, 3, keywords14);
        TDAOption_21149227_SepulvedaFlores d4 = new TDAOption_21149227_SepulvedaFlores(4, "4) Agregar más ramos", 1, 2, keywords15);
        TDAOption_21149227_SepulvedaFlores d5 = new TDAOption_21149227_SepulvedaFlores(5, "5) Otro Nivel", 1, 1, keywords16);

        List<TDAOption_21149227_SepulvedaFlores> options2 = new ArrayList<>();
        options2.add(b1);
        options2.add(b2);
        options2.add(b3);
        options2.add(b4);

        List<TDAOption_21149227_SepulvedaFlores> options3 = new ArrayList<>();
        options3.add(c1);
        options3.add(c2);
        options3.add(c3);
        options3.add(c4);

        List<TDAOption_21149227_SepulvedaFlores> options4 = new ArrayList<>();
        options4.add(d1);
        options4.add(d2);
        options4.add(d3);
        options4.add(d4);
        options4.add(d5);

        TDAFlow_21149227_SepulvedaFlores flow2 = new TDAFlow_21149227_SepulvedaFlores(1, "Flujo 1 Chatbot1\n¿De que nivel te gustaría consultar el material?", options2);
        TDAFlow_21149227_SepulvedaFlores flow3 = new TDAFlow_21149227_SepulvedaFlores(2, "Flujo 2 Chatbot1\n¿Que ramo quieres ver?", options3);
        TDAFlow_21149227_SepulvedaFlores flow4 = new TDAFlow_21149227_SepulvedaFlores(3, "Flujo 3 Chatbot1\n¿Que tipo de material quieres ver?", options4);

        List<TDAFlow_21149227_SepulvedaFlores> flows2 = new ArrayList<>();
        flows2.add(flow2);
        flows2.add(flow3);
        flows2.add(flow4);


        flow2.flowAddOption(b1);
        flow2.flowAddOption(b2);

        flow3.flowAddOption(c1);
        flow3.flowAddOption(c2);

        flow4.flowAddOption(d1);
        flow4.flowAddOption(d2);

        TDAChatbot_21149227_SepulvedaFlores chatbot1 = new TDAChatbot_21149227_SepulvedaFlores(1, "Usach Premium", "Chatbot 1 Bienvenido\n¿Qué te gustaría hacer?", 1, flows2);

        chatbot1.chatbotAddFlow(flow2);
        chatbot1.chatbotAddFlow(flow3);
        chatbot1.chatbotAddFlow(flow4);


        //CHATBOT 2 Flujo 1

        List<String> keywords17 = new ArrayList<>();
        List<String> keywords18 = new ArrayList<>();
        List<String> keywords19 = new ArrayList<>();

        keywords17.add("dormir");
        keywords17.add("acostarse");

        keywords18.add("nada");

        keywords19.add("volver");
        keywords19.add("salir");


        TDAOption_21149227_SepulvedaFlores e1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Echarse en la cama", 2, 1, keywords17);
        TDAOption_21149227_SepulvedaFlores e2 = new TDAOption_21149227_SepulvedaFlores(2, "2) No hacer nada", 2, 1, keywords18);
        TDAOption_21149227_SepulvedaFlores e3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Volver", 0, 1, keywords19);

        List<TDAOption_21149227_SepulvedaFlores> options5 = new ArrayList<>();
        options5.add(e1);
        options5.add(e2);
        options5.add(e3);

        TDAFlow_21149227_SepulvedaFlores flow5 = new TDAFlow_21149227_SepulvedaFlores(1, "Flujo 1 Chatbot2\n¿Cómo te gustaría procrastinar?", options5);

        List<TDAFlow_21149227_SepulvedaFlores> flows3 = new ArrayList<>();
        flows3.add(flow5);

        flow5.flowAddOption(e1);
        flow5.flowAddOption(e2);
        flow5.flowAddOption(e3);

        TDAChatbot_21149227_SepulvedaFlores chatbot2 = new TDAChatbot_21149227_SepulvedaFlores(2, "Procastinacion", "Chatbot 2 Bienvenido\n¿Qué te gustaría hacer?", 1, flows3);

        chatbot2.chatbotAddFlow(flow5);


        //CHATBOT 3 Flujo 1

        List<String> keywords20 = new ArrayList<>();
        List<String> keywords21 = new ArrayList<>();
        List<String> keywords22 = new ArrayList<>();

        keywords20.add("pc");
        keywords20.add("torre");
        keywords20.add("ordenador");

        keywords21.add("ps5");
        keywords21.add("xbox");
        keywords21.add("switch");

        keywords22.add("smartphone");
        keywords22.add("android");
        keywords22.add("apk");

        TDAOption_21149227_SepulvedaFlores f1 = new TDAOption_21149227_SepulvedaFlores(1, "1) Computador", 3, 1, keywords20);
        TDAOption_21149227_SepulvedaFlores f2 = new TDAOption_21149227_SepulvedaFlores(2, "2) Consola", 3, 1, keywords21);
        TDAOption_21149227_SepulvedaFlores f3 = new TDAOption_21149227_SepulvedaFlores(3, "3) Celular", 3, 1, keywords22);

        List<TDAOption_21149227_SepulvedaFlores> options6 = new ArrayList<>();
        options6.add(f1);
        options6.add(f2);
        options6.add(f3);

        TDAFlow_21149227_SepulvedaFlores flow6 = new TDAFlow_21149227_SepulvedaFlores(1, "Flujo 1 Chatbot3\n¿En dónde te gustaría jugar?", options6);

        List<TDAFlow_21149227_SepulvedaFlores> flows4 = new ArrayList<>();
        flows4.add(flow6);

        flow6.flowAddOption(f1);
        flow6.flowAddOption(f2);
        flow6.flowAddOption(f3);

        TDAChatbot_21149227_SepulvedaFlores chatbot3 = new TDAChatbot_21149227_SepulvedaFlores(3, "Jugar", "Chatbot 3 Bienvenido\n¿Qué te gustaría hacer?", 1, flows4);
        chatbot3.chatbotAddFlow(flow6);


        List<TDAChatbot_21149227_SepulvedaFlores> chatbots = new ArrayList<>();

        chatbots.add(chatbot0);
        chatbots.add(chatbot1);
        chatbots.add(chatbot2);
        chatbots.add(chatbot3);


        TDAUser_21149227_SepulvedaFlores user = new TDAUserAdmin_21149227_SepulvedaFlores("Juan");
        TDAUser_21149227_SepulvedaFlores user3 = new TDACommonUser_21149227_SepulvedaFlores("Benja");
        TDAUser_21149227_SepulvedaFlores user5 = new TDACommonUser_21149227_SepulvedaFlores("Benja");
        TDAUser_21149227_SepulvedaFlores user4 = new TDACommonUser_21149227_SepulvedaFlores("Jaime");

        TDASistema_21149227_SepulvedaFlores sistema = new TDASistema_21149227_SepulvedaFlores("Sistema", 0, chatbots);
        sistema.systemAddUser(user);
        sistema.systemAddUser(user3);
        sistema.systemAddUser(user4);
        sistema.systemLogout();
        TDAMenu_21149227_SepulvedaFlores menu = new TDAMenu_21149227_SepulvedaFlores();
        List<TDASistema_21149227_SepulvedaFlores> sistemas = new ArrayList<>();
        sistemas.add(sistema);
        menu.menuPrincipal(sistema, sistemas);



    }
}