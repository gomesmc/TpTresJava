/*
Classe: Serve como molde para criarmos um objeto. Além disso contém os atributos e métodos
Ex: Caneta - classe
Objeto: É o que surge quando instancio uma classe

Atribtuos: São os dados/características do objeto os quais definem o estado do mesmo

Métodos: São ações que o objeto pode realizar
 */

package Exercicios;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;


class Caneta {
    String marca = "BIC";
    int ponta = 1;
    boolean canetaTampada = false;


    public void TampaCaneta() {
        canetaTampada = true;
        System.out.println("A caneta está com tampa tampada!");
    }

    public void DestamparCaneta() {
        canetaTampada = false;
        System.out.println("A caneta foi destampada!");
    }

    public static void main(String[] args) {
        Caneta exemploCaneta=new Caneta();
        exemploCaneta.TampaCaneta();
        exemploCaneta.DestamparCaneta();
    }
}
