/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Simone Barbosa
 */
public class Servico {
    private int id;
    private String descricao;
    private double valor;
    private String status;
    private Cliente cliente;
    private String solucao;
    private Dispositivo dispositivo;
    private ArrayList<Produto> produtosIncluidos;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }
    
   public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    

    public ArrayList<Produto> getProdutosIncluidos() {
        return produtosIncluidos;
    }

    public void setProdutosIncluidos(ArrayList<Produto> produtosIncluidos) {
        this.produtosIncluidos = produtosIncluidos;
    }

    


}


