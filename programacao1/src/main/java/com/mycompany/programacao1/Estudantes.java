/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

import java.util.Date;

/**
 *
 * @author aluno
 */
 class Estudantes {
          
    private static String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
   
    public Estudantes(){
        nome = "Nobody";
    }
    
    private int obterIdade(Date hoje){
        int idade = 0;
        //logica de calculo de idade
        return idade;
    }
    
    public static String getNome(){
        return nome;
    }
    
    public static void setNome(String nome){
        nome =nome;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        dataNascimento = dataNascimento;  
    }
    public String getCpf (){
        return cpf;
    }
    public void setCpf (){
        cpf = cpf;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(){
        genero = genero;
    }
    public String getMatricula(){
       return matricula; 
}
    public void setMatricula(){
        matricula = matricula;
    }
    public String getEmail (){
        return email;
}
    public void setEmail (){
        email = email;
    }
 }