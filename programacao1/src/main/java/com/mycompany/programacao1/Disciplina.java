/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

/**
 *
 * @author aluno
 */
public class Disciplina {
    
    private int CogidoDisciplina;
    private String NomeDisciplina;
    private int CargaHoraria;
    private String ementa;
    private String ObjetivoAprendizagem;
    private String conteudosProgramaticos;
    private String ReferenciasBibliograficas;
    
    public int getCodigoDisciplina(){
        return CogidoDisciplina;
    }
    public void setCodigoDisciplina(int _CogidoDisciplina){
        CogidoDisciplina = _CogidoDisciplina;
    }
    public String getNomeDisciplina(){
        return NomeDisciplina;
    }
    public void setNomeDisciplina(String _NomeDisciplina){
     NomeDisciplina = _NomeDisciplina;   
    }
    public int getCargaHoraria(){
        return CargaHoraria;
    }
    public void setCargaHoraria(int _CargaHoraria){
        CargaHoraria = _CargaHoraria;
    }
    public String getEmenta (){
        return ementa;
    }
    public void setEmenta(String _ementa){
        ementa = _ementa;
    }
    public String getObjetivoAprendizagem(){
        return ObjetivoAprendizagem;
    }
    public void setObjetivoAprendizagem(String _ObjetivoAprendizagem){
        ObjetivoAprendizagem = _ObjetivoAprendizagem;
    }
    public String getConteudosProgramaticos(){
        return conteudosProgramaticos;
    }
    public void setConteudosProgramaticos(String _conteudosProgramaticos){
        conteudosProgramaticos = _conteudosProgramaticos;
    }
    public String getReferenciasBibliograficas (){
        return ReferenciasBibliograficas;
    }
    public void setReferenciasBibliograficas(String _ReferenciasBibliograficas){
        ReferenciasBibliograficas = _ReferenciasBibliograficas;
    }
}
