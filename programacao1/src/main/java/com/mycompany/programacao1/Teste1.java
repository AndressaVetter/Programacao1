/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

/**
 *
 * @author aluno
 */
public class Teste1 {
    public static void main(String[] args) {
        Estudantes camada = new Estudantes();
        Estudantes leonardo = new Estudantes();
        Estudantes jefferson = new Estudantes();
        
        camada.setNome("Marcos");
        leonardo.setNome("leonardo");
        jefferson.setNome("Jefferson");
        
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(jefferson.getNome());
    }
}
