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
    
    public void setNome(String _nome){
        nome = _nome;
    }
    public void setMatricula(String _digito){
    digito = _digito;
    }
    public String getMatricula(){
        return String.valueOf(anoIngresso)+String.valueOf(semestre)+digito;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date _dataNascimento){
        dataNascimento = _dataNascimento;  
    }
    public String getCpf (){
        return cpf;
    }
    public void setCpf (String _cpf){
        cpf = _cpf;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char _genero){
        genero = _genero;
    }
    public String getEmail (){
        return email;
}
    public void setEmail (String _email){
        email = _email;
    }
    public int setTelefone(){
        return telefone;
 }
    public void getTelefone (int _telefone){
        telefone = _telefone;
    }
    public String setSituacaoAcademica(){
        return situacaoAcademica;
    }
    public void getSituacaoAcademica(String _situacaoAcademica){
        situacaoAcademica = _situacaoAcademica;
    }
    public int setAnosIngresso (){
        return anoIngresso;
    }
    public void getAnosIngresso(int _anosIngresso){
      anoIngresso = _anosIngresso;   
    }
    public int setSementreIngresso(){
        return semestreIngresso;
    }
    public void getSementreIngresso(int _semestreIngresso){
        semestreIngresso = _semestreIngresso;
 }
    public String getNivelEnsino (){
        return nivelEnsino;
    }
    public void setNivelEnsino (String _nivelEnsino){
        nivelEnsino = _nivelEnsino;
    }
    
 }
