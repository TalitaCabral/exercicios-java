/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talita.cabral.c2;

/**
 *
 * @author talita
 */

public class Paciente {
   
    private Integer idPaciente;
    private String nome;
    private String doenca;
    private Boolean estaInternado;
    private Double valorCirurgia = 0.0;
    private Double valorDiaria = 0.0;
    private Integer qtdDias = 0;
    private Boolean foiOperado;
    private String status;
    
    public void calcularValorTotal(){
        Double valorTotal = (valorDiaria * qtdDias) + valorCirurgia;
    }
     
    public void situacaoStatus(){
        if (estaInternado == true && foiOperado == true){
            status = "Paciente internado e operado";
        } else if (estaInternado == true){
            status = "Paciente esta internado!";
        } else {
            status = "Paciente não está internado!";
        }    
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nome=" + nome + ", doenca=" + doenca + ", estaInternado=" + estaInternado + ", valorCirurgia=" + valorCirurgia + ", valorDiaria=" + valorDiaria + ", qtdDias=" + qtdDias + ", foiOperado=" + foiOperado + ", status=" + status + '}';
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public Boolean getEstaInternado() {
        return estaInternado;
    }

    public void setEstaInternado(Boolean estaInternado) {
        this.estaInternado = estaInternado;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Integer getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Boolean getFoiOperado() {
        return foiOperado;
    }

    public void setFoiOperado(Boolean foiOperado) {
        this.foiOperado = foiOperado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
    
    

