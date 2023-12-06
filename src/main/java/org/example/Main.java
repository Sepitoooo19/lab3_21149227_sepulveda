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

        Option a1 = new Option(1, "1) Ayudantias",1, 1, keywords);
        Option a2 = new Option(2, "2) Flojear",2, 1, keywords2);
        Option a3 = new Option(3,"3) Jugar",3, 1, keywords3);

        List<Option> options = new ArrayList<>();
        options.add(a1);
        options.add(a2);
        options.add(a3);

        Flow flow = new Flow(1, "Flujo Principal Chatbot 1\nBienvenido ¿Qué te gustaría hacer?", options);
        List<Flow> flows = new ArrayList<>();
        flows.add(flow);
        flows.add(flow);

        flow.flowAddOption(a1);
        flow.flowAddOption(a2);
        flow.flowAddOption(a3);

        Chatbot chatbot0 = new Chatbot(0, "Inicial", "Inicial Bienvenido\n¿Qué te gustaría hacer?", 1, flows);


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

        Option b1 = new Option(1,"1) Primer Nivel", 1, 1, keywords4);
        Option b2 = new Option(2,"2) Segundo Nivel" ,1, 1, keywords5);
        Option b3 = new Option(3,"3) Tercer Nivel", 1, 1, keywords6);
        Option b4 = new Option(4,"4) Volver", 1, 1, keywords7);

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

        Option c1 = new Option(1,"1) Calculo 1", 1, 2, keywords8);
        Option c2 = new Option(2,"2) Algebra 1", 1, 2, keywords9);
        Option c3 = new Option(3,"3) Fisica 1", 1, 2, keywords10);
        Option c4 = new Option(4,"4) Cambiar Nivel", 1, 1, keywords11);

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


        Option d1 = new Option(1,"1) Ayudantias completas", 1, 3, keywords12);
        Option d2 = new Option(2,"2) Capsulas", 1, 3, keywords13);
        Option d3 = new Option(3,"3) Papeo", 1, 3, keywords14);
        Option d4 = new Option(4,"4) Agregar más ramos", 1, 2, keywords15);
        Option d5 = new Option(5,"5) Otro Nivel", 1, 1, keywords16);

        List<Option> options2 = new ArrayList<>();
        options2.add(b1);
        options2.add(b2);
        options2.add(b3);
        options2.add(b4);

        List<Option> options3 = new ArrayList<>();
        options3.add(c1);
        options3.add(c2);
        options3.add(c3);
        options3.add(c4);

        List<Option> options4 = new ArrayList<>();
        options4.add(d1);
        options4.add(d2);
        options4.add(d3);
        options4.add(d4);
        options4.add(d5);

        Flow flow2 = new Flow(1, "Flujo 1 Chatbot1\n¿De que nivel te gustaría consultar el material?", options2);
        Flow flow3 = new Flow(2, "Flujo 2 Chatbot1\n¿Que ramo quieres ver?", options3);
        Flow flow4 = new Flow(3, "Flujo 3 Chatbot1\n¿Que tipo de material quieres ver?", options4);

        List<Flow> flows2 = new ArrayList<>();
        flows2.add(flow2);
        flows2.add(flow3);
        flows2.add(flow4);


        flow2.flowAddOption(b1);
        flow2.flowAddOption(b2);

        flow3.flowAddOption(c1);
        flow3.flowAddOption(c2);

        flow4.flowAddOption(d1);
        flow4.flowAddOption(d2);

        Chatbot chatbot1 = new Chatbot(1, "Usach Premium", "Chatbot 1 Bienvenido\n¿Qué te gustaría hacer?", 1, flows2);

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


        Option e1 = new Option(1,"1) Echarse en la cama", 2, 1, keywords17);
        Option e2 = new Option(2,"2) No hacer nada", 2, 1, keywords18);
        Option e3 = new Option(3,"3) Volver", 0, 1, keywords19);

        List<Option> options5 = new ArrayList<>();
        options5.add(e1);
        options5.add(e2);
        options5.add(e3);

        Flow flow5 = new Flow(1, "Flujo 1 Chatbot2\n¿Cómo te gustaría procrastinar?", options5);

        List<Flow> flows3 = new ArrayList<>();
        flows3.add(flow5);

        flow5.flowAddOption(e1);
        flow5.flowAddOption(e2);
        flow5.flowAddOption(e3);

        Chatbot chatbot2 = new Chatbot(2, "Procastinacion", "Chatbot 2 Bienvenido\n¿Qué te gustaría hacer?", 1, flows3);

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

        Option f1 = new Option(1,"1) Computador", 3, 1, keywords20);
        Option f2 = new Option(2,"2) Consola", 3, 1, keywords21);
        Option f3 = new Option(3,"3) Celular", 3, 1, keywords22);

        List<Option> options6 = new ArrayList<>();
        options6.add(f1);
        options6.add(f2);
        options6.add(f3);

        Flow flow6 = new Flow(1, "Flujo 1 Chatbot3\n¿En dónde te gustaría jugar?", options6);

        List<Flow> flows4 = new ArrayList<>();
        flows4.add(flow6);

        flow6.flowAddOption(f1);
        flow6.flowAddOption(f2);
        flow6.flowAddOption(f3);

        Chatbot chatbot3 = new Chatbot(3, "Jugar", "Chatbot 3 Bienvenido\n¿Qué te gustaría hacer?", 1, flows4);
        chatbot3.chatbotAddFlow(flow6);


        List<Chatbot> chatbots = new ArrayList<>();

        chatbots.add(chatbot0);
        chatbots.add(chatbot1);
        chatbots.add(chatbot2);
        chatbots.add(chatbot3);

        //usuarios

        User user = new User("Juan");
        User user2 = new User("Juan");
        User user3 = new User("Benja");
        User user4 = new User("Jaime");

        Sistema sistema = new Sistema("Sistema", 1, chatbots);
        sistema.systemAddUser(user);
        sistema.systemAddUser(user2);
        sistema.systemAddUser(user3);
        sistema.systemAddUser(user4);
        sistema.systemLoginUser(user);
        sistema.systemLoginUser(user2);
        sistema.systemLoginUser(user3);
        sistema.systemLoginUser(user4);
        sistema.systemLogout();
        sistema.systemLoginUser(user);
        System.out.println(sistema);

    }

}