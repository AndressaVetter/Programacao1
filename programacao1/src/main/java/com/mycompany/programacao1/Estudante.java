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
 class Estudante {
          
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String email;
    private String situacaoAcademica;
    private int telefone;
    private int anoIngresso;
    private int semestreIngresso;
    private String nivelEnsino;
    private String digito;
    private int semestre;
   
    
    public Estudante(){
        nome = "Nobody";
    }
    
    private int obterIdade(Date hoje){
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
    public void setMatricula(String digito){
    digito =digito;
    }
    public String getMatricula(){
        return String.valueOf(anoIngresso)+String.valueOf(semestre)+digito;
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
    public String getEmail (){
        return email;
}
    public void setEmail (){
        email = email;
    }
    public int setTelefone(){
        return telefone;
 }
    public void getTelefone (){
        telefone = telefone;
    }
    public String setSituacaoAcademica(){
        return situacaoAcademica;
    }
    public void getSituacaoAcademica(){
        situacaoAcademica = situacaoAcademica;
    }
    public int setAnosIngresso (){
        return anoIngresso;
    }
    public void getAnosIngresso(){
      anoIngresso = anoIngresso;   
    }
    public int setSementreIngresso(){
        return semestreIngresso;
    }
    public void getSementreIngresso(){
        semestreIngresso = semestreIngresso;
 }
    
 }
