package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    final int OPCIONES_NOADMIN = 2;
    final int OPCIONES_ADMIN = 7;


    public Menu(){}

    public void menuPrincipal(Sistema sistema, List<Sistema> sistemas){
        System.out.println("Bienvenido al simulador de comunicacion con Chatbots, que desea hacer?");
        System.out.println("Si desea interactuar con el sistema ya creado, ingrese 1 y luego 1");
        System.out.println("1) Ver sistema ya creado");
        System.out.println("2) Crear nuevo sistema");
        System.out.println("3) Registrar Usuario al sistema ya existente");
        System.out.println("4) Elegir sistema");
        System.out.println("5) Terminar programa");
        System.out.println("Ingrese su opcion: ");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                menuVerSistema(sistema, sistemas);
                break;
            case 2:
                crearSistemaVacio(sistema, sistemas);
                menuPrincipal(sistema, sistemas);
                break;
            case 3:
                registrarUsuario(sistema, sistemas);
                menuPrincipal(sistema, sistemas);
                break;
            case 4:
                eleccionSistemas(sistemas);
                break;
            case 5:
                System.out.println("Gracias por usar el programa");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }




    }


    public void anadirSistemaALista(Sistema sistema, List<Sistema> sistemas){
        sistemas.add(sistema);
    }



    public void menuVerSistema(Sistema sistema, List<Sistema> sistemas){
        System.out.println("Sistemas creados: ");
        System.out.println(sistemas);
        System.out.println("¿Qué desea hacer?: ");
        System.out.println("1) Interactuar con el chatbot");
        System.out.println("2) Volver al menu principal");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:

                menuInteractuarChatbot(sistema, sistemas);
                break;
            case 2:
                menuPrincipal(sistema, sistemas);
                break;
            default:
                System.out.println(choice + " is not a valid option! Please select correct option.");
        }
    }

    public void menuAdmin(Sistema sistema, String userChoice, List<Sistema> sistemas){

        System.out.println("Bienvenido " + userChoice + " al sistema de chatbots\n");

        System.out.println("Usted puede acceder a:");
        System.out.println("1) Crear nuevo chatbot y añadir directamente a sistema");
        System.out.println("2) Crear nuevo flujo y añadir directamente a chatbot");
        System.out.println("3) Crear nueva opcion y añadir directamente a flujo");
        System.out.println("4) systemTalk");
        System.out.println("5) systemSynthesis");
        System.out.println("6) SystemLogout");
        System.out.println("7) Salir");
        Scanner input = new Scanner(System.in);


        int choice4 = input.nextInt();

        do {
            switch (choice4) {
                case 1:

                    anadirChatbotASistema(sistema, sistemas);
                    System.out.println("\nSistema actualizado:\n ");
                    System.out.println(sistema);
                    System.out.println("\n");
                    menuAdmin(sistema, userChoice, sistemas);
                    break;
                case 2:
                    anadirFlujoAChatbot(sistema);
                    System.out.println("\nSistema actualizado:\n ");
                    System.out.println(sistema);
                    System.out.println("\n");
                    menuAdmin(sistema, userChoice,sistemas);
                    break;

                case 3:
                    anadirOpcionAFlujo(sistema);
                    System.out.println("\nSistema actualizado:\n ");
                    System.out.println(sistema);
                    System.out.println("\n");
                    menuAdmin(sistema, userChoice, sistemas);
                    break;

                case 4:
                    menuTalk(sistema, userChoice, sistemas);
                    break;
                case 5:
                    System.out.println("Sintesis de la conversación: ");
                    System.out.println(sistema.systemSynthesis(userChoice));
                    menuAdmin(sistema, userChoice, sistemas);
                    break;

                case 6:
                    sistema.systemLogout();
                    menuPrincipal(sistema,sistemas);
                    break;
                case 7:
                    menuPrincipal(sistema,sistemas);
                default:
                    System.out.println(choice4 + " is not a valid option! Please select correct option.");

            }
        }while (choice4 != OPCIONES_ADMIN);
    }



public void menuTalk(Sistema sistema, String userChoice, List<Sistema> sistemas){
    Scanner input = new Scanner(System.in);


    System.out.println("¿Qué desea hacer?:\n1)Interactuar\n2)Hacer Sintesis\n3)Salir");
    int choice6 = input.nextInt();
    switch(choice6){

        case 1:
            System.out.println("Ingrese el mensaje que desea enviar: ");
            String message = input.next();
            sistema.systemTalk(message);
            System.out.println(sistema);
            menuTalk(sistema, userChoice, sistemas);
            break;
        case 2:
            System.out.println("Sintesis de la conversación: ");
            System.out.println(sistema.systemSynthesis(userChoice));
            menuTalk(sistema, userChoice, sistemas);
            break;
        case 3:
            for (int i = 0; i < sistema.getRegisterUserList().size(); i++) {
                if (userChoice.equals(sistema.getRegisterUserList().get(i).getName())) {
                    if (sistema.getRegisterUserList().get(i).getTipoUsuario().equals("common")) {

                        menuComun(sistema, userChoice, sistemas);
                    }
                    if (sistema.getRegisterUserList().get(i).getTipoUsuario().equals("admin")) {

                        menuAdmin(sistema, userChoice, sistemas);


                    }
                }

            }

            break;

    }






}




    public void menuComun(Sistema sistema, String userChoice, List<Sistema> sistemas){

        System.out.println("Bienvenido " + userChoice + " al sistema de chatbots\n");

        System.out.println("Usted puede acceder a:");
        System.out.println("1) systemTalk");
        System.out.println("2) systemSynthesis");
        System.out.println("3) Registrarse en el sistema");
        System.out.println("4) Logearse en el sistema");
        System.out.println("5) SystemLogout");
        System.out.println("6) Salir");
        System.out.println("¿Qué desea hacer?: ");
        Scanner input = new Scanner(System.in);


        int choice3 = input.nextInt();
        do {
            switch (choice3) {
                case 1:
                    menuTalk(sistema, userChoice, sistemas);
                    break;
                case 2:
                    System.out.println("Sintesis de la conversación: ");
                    System.out.println(sistema.systemSynthesis(userChoice));
                    break;
                case 3:
                    registrarUsuarioSistemaUnico(sistema, sistemas);
                    break;
                case 4:
                    iniciarSesionEnSistemaActual(sistema, sistemas);
                    break;
                case 5:
                    cerrarSesionActual(sistema);
                    break;
                case 6:
                    menuPrincipal(sistema, sistemas);
                    break;
                default:
                    System.out.println(choice3 + " is not a valid option! Please select correct option.");
            }
        } while (choice3 != OPCIONES_NOADMIN);


    }

    public void registrarUsuarioSistemaUnico(Sistema sistema, List<Sistema> sistemas){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String nombreUsuario = input.nextLine();
        System.out.println("Ingrese el tipo de usuario: ");
        String tipoUsuario = input.nextLine();
        if (tipoUsuario.equals("admin")) {
            User user = new UserAdmin(nombreUsuario);
            sistema.systemAddUser(user);
            System.out.println("Usuario registrado: ");
            System.out.println(user);
            menuPrincipal(sistema, sistemas);
        }
        if (tipoUsuario.equals("common")) {
            User user = new CommonUser(nombreUsuario);
            sistema.systemAddUser(user);
            System.out.println("Usuario registrado: ");
            System.out.println(user);
            menuPrincipal(sistema, sistemas);
        }
    }
    public void menuInteractuarChatbot(Sistema sistema, List<Sistema> sistemas) {
        Sistema sistemaActual = eleccionSistemas(sistemas);
        accederUsuariosRegistradosSistemaActual(sistemaActual);
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String userChoice = input.nextLine();

        for (int i = 0; i < sistema.getRegisterUserList().size(); i++) {
            if (userChoice.equals(sistema.getRegisterUserList().get(i).getName())) {
                if (sistema.getRegisterUserList().get(i).getTipoUsuario().equals("common")) {

                    menuComun(sistemaActual, userChoice, sistemas);
                }
                if (sistema.getRegisterUserList().get(i).getTipoUsuario().equals("admin")) {

                    menuAdmin(sistemaActual, userChoice, sistemas);
                }
            }
        }
        menuPrincipal(sistemaActual, sistemas);
    }

public void accederUsuariosRegistradosSistemaActual(Sistema sistema){
    for (int i = 0; i < sistema.getRegisterUserList().size(); i++) {
        System.out.println(sistema.getRegisterUserList().get(i).getName());
    }
}




    public void crearSistemaVacio(Sistema sistema, List<Sistema> sistemas){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del sistema: ");
        String name = input.nextLine();
        System.out.println("Ingrese el codigo inicial del chatbot: ");
        int initialChatbotCodeLink = input.nextInt();
        List<Chatbot> chatbots = new ArrayList<>();
        Sistema sistema2 = new Sistema(name, initialChatbotCodeLink, chatbots);
        System.out.println("Sistema creado:\n ");
        System.out.println(sistema2);
        anadirSistemaALista(sistema2, sistemas);
        menuVerSistema(sistema,sistemas);

    }

    public Sistema eleccionSistemas(List<Sistema> sistemas) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del sistema: ");
        String name = input.nextLine();
        for (int i = 0; i < sistemas.size(); i++) {
            if (name.equals(sistemas.get(i).getName())) {
                System.out.println("Sistema elegido: ");
                System.out.println(sistemas.get(i));
                return sistemas.get(i);
            }
        }
        return null;


    }


public void registrarUsuario(Sistema sistema, List<Sistema> sistemas)
{
    Sistema sistemaActual = eleccionSistemas(sistemas);
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el nombre del usuario: ");
    String nombreUsuario = input.nextLine();
    System.out.println("Ingrese el tipo de usuario: ");
    String tipoUsuario = input.nextLine();
    if (sistemaActual.getRegisterUserList().contains(nombreUsuario)){
        System.out.println("El usuario ya existe");
        menuPrincipal(sistema, sistemas);
    }
    else{
        if (tipoUsuario.equals("admin")) {
            User user = new UserAdmin(nombreUsuario);
            sistemaActual.systemAddUser(user);
            System.out.println("Usuario registrado: ");
            System.out.println(user);
            menuPrincipal(sistemaActual, sistemas);
        }
        if (tipoUsuario.equals("common")) {
            User user = new CommonUser(nombreUsuario);
            sistemaActual.systemAddUser(user);
            System.out.println("Usuario registrado: ");
            System.out.println(user);
            menuPrincipal(sistemaActual, sistemas);
        }
    }
}

    public void iniciarSesionEnSistemaActual(Sistema sistema, List<Sistema> sistemas) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String userChoice = input.nextLine();

        if (sistema.getRegisterUserNameList().contains(userChoice)) {
            sistema.systemLoginUser(userChoice);
            System.out.println("Usuario logeado: ");
            System.out.println(userChoice);
            menuComun(sistema, userChoice, sistemas);
        }
        else {
            System.out.println("El usuario no existe");
            menuPrincipal(sistema, sistemas);
        }



    }


    public void cerrarSesionActual(Sistema sistema){
        sistema.systemLogout();
    }

    public void anadirChatbotASistema(Sistema sistema, List<Sistema> sistemas){
        eleccionSistemas(sistemas);
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id del chatbot: ");
        int idChatbot = input.nextInt();
        System.out.println("Ingrese el nombre del chatbot: ");
        String nombreChatbot = input.next();
        System.out.println("Ingrese el mensaje de bienvenida del chatbot: ");
        String mensajeBienvenidaChatbot = input.next();
        System.out.println("Ingrese el id del flujo inicial del chatbot: ");
        int idFlujoInicialChatbot = input.nextInt();
        List<Flow> flowsChatbot = new ArrayList<>();
        Chatbot chatbotCreado = new Chatbot(idChatbot, nombreChatbot, mensajeBienvenidaChatbot, idFlujoInicialChatbot, flowsChatbot);
        System.out.println("Chatbot creado:\n ");
        System.out.println(chatbotCreado);
        System.out.println("Ingrese el nombre del sistema al que se vincula el chatbot: ");
        String nameSistemaLink = input.next();
        for (int i = 0; i < sistemas.size(); i++) {
            if (nameSistemaLink.equals(sistemas.get(i).getName())) {
                sistemas.get(i).systemAddChatbot(chatbotCreado);
            }
        }

    }


    public void anadirFlujoAChatbot(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id del flujo: ");
        int idFlujo = input.nextInt();
        System.out.println("Ingrese el mensaje del flujo: ");
        String mensajeFlujo = input.next();
        List<Option> opcionesFlujo = new ArrayList<>();
        Flow flujoCreado = new Flow(idFlujo, mensajeFlujo, opcionesFlujo);
        System.out.println("Flujo creado:\n ");
        System.out.println(flujoCreado);
        System.out.println("Ingrese el id del chatbot al que se vincula el flujo: ");
        int chatbotCodeLink = input.nextInt();
        for (int i = 0; i < sistema.getChatbots().size(); i++) {
            if (chatbotCodeLink == sistema.getChatbots().get(i).getChatbotID()) {
                sistema.getChatbots().get(i).chatbotAddFlow(flujoCreado);
            }
        }
    }

    public void anadirOpcionAFlujo(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id de la opcion: ");
        int idOpcion = input.nextInt();
        System.out.println("Ingrese el mensaje de la opcion: ");
        String mensajeOpcion = input.next();
        System.out.println("Ingrese el id del chatbot al que se vincula la opcion: ");
        int chatbotCodeLink = input.nextInt();
        System.out.println("Ingrese el id del flujo al que se vincula la opcion: ");
        int initialFlowCodeLink = input.nextInt();
        List<String> keywordsOpcion = new ArrayList<>();
        System.out.println("Ingrese las palabras claves de la opcion: ");
        System.out.println("Ingrese la primera palabra clave: ");
        String keyword = input.next();
        keywordsOpcion.add(keyword);
        System.out.println("Ingrese la segunda palabra clave: ");
        String keyword2 = input.next();
        keywordsOpcion.add(keyword2);
        Option opcionCreada = new Option(idOpcion, mensajeOpcion, chatbotCodeLink, initialFlowCodeLink, keywordsOpcion);
        System.out.println("Opcion creada:\n ");
        System.out.println(opcionCreada);
        System.out.println("Ingrese el id del flujo al que se vincula la opcion: ");
        int idFlujo = input.nextInt();
        for (int i = 0; i < sistema.getChatbots().size(); i++) {
            for (int j = 0; j < sistema.getChatbots().get(i).getFlows().size(); j++) {
                if (idFlujo == sistema.getChatbots().get(i).getFlows().get(j).getId()) {
                    sistema.getChatbots().get(i).getFlows().get(j).flowAddOption(opcionCreada);
                }
            }
        }
    }



    }
