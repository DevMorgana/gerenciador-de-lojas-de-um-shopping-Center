package org.example;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Atribuindo data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (isDataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (isDataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (isDataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasNoMes = { 31, (verificaAnoBissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return dia > 0 && dia <= diasNoMes[mes - 1];
    }
}
