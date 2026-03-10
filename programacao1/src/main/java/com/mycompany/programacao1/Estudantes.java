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
public class Estudantes {
          
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
   
    public Estudantes(){
        nome = "Nobody";
    }
    
    public int obterIdade(Date hoje){
        int idade = 0;
        //logica de calculo de idade
        return idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
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
}
