package org.example;

import java.io.*;
public class Teclado {
    private static String s;
    private static InputStreamReader i = new InputStreamReader(System.in);
    private static BufferedReader d = new BufferedReader(i);

    /**
     * Lê um inteiro.
     *
     * @return int
     */
    public static int leInt() {
        int a = 0;
        try {
            s = d.readLine();
            a = Integer.parseInt(s);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser inteiro: " + e);
        }
        return a;
    }

    /**
     * Lê um inteiro, com mensagem.
     *
     * @param msg Mensagem a ser exibida ao usuário.
     * @return int
     */
    public static int leInt(String msg) {
        int a = 0;
        System.out.println(msg);
        try {
            s = d.readLine();
            a = Integer.parseInt(s);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser inteiro: " + e);
        }
        return a;
    }

    /**
     * Lê um double.
     *
     * @return double
     */
    public static double leDouble() {
        double a = 0;
        try {
            s = d.readLine();
            a = Double.parseDouble(s);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser número: " + e);
        }
        return a;
    }

    /**
     * Lê um double, com mensagem.
     *
     * @param msg Mensagem a ser exibida ao usuário.
     * @return double
     */
    public static double leDouble(String msg) {
        double a = 0;
        System.out.println(msg);
        try {
            s = d.readLine();
            a = Double.parseDouble(s);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser número: " + e);
        }
        return a;
    }

    /**
     * Lê um string.
     *
     * @return String
     */
    public static String leString() {
        s = "";
        try {
            s = d.readLine();
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        }
        return s;
    }

    /**
     * Lê um string, com mensagem.
     *
     * @param msg Mensagem a ser exibida ao usuário.
     * @return String
     */
    public static String leString(String msg) {
        s = "";
        System.out.println(msg);
        try {
            s = d.readLine();
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        }
        return s;
    }

    /**
     * Lê um char.
     *
     * @return char
     */
    public static char leChar() {
        char a = ' ';
        try {
            s = d.readLine();
            a = s.charAt(0);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser char: " + e);
        }
        return a;
    }

    /**
     * Lê um char, com mensagem.
     *
     * @param msg Mensagem a ser exibida ao usuário.
     * @return char
     */
    public static char leChar(String msg) {
        char a = ' ';
        System.out.println(msg);
        try {
            s = d.readLine();
            a = s.charAt(0);
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e);
        } catch (NumberFormatException e) {
            System.out.println("O valor digitado deve ser um char: " + e);
        }
        return a;
    }
}
