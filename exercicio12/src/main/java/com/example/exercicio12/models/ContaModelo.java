package com.example.exercicio12.models;

public class ContaModelo {
    private String codigo;
    private String cliente;

    public ContaModelo(String codigo, String cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


}
