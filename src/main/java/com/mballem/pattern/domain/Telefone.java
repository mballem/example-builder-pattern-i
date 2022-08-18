package com.mballem.pattern.domain;

/**
 * Created by http://www.mballem.com
 */
public class Telefone {

    private int ddd;
    private int numero;
    private TipoFone tipo;

    public Telefone(int ddd, int numero, TipoFone tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numero;
    }

    public TipoFone getTipo() {
        return tipo;
    }

    public enum TipoFone {
        RESIDENCIAL, CELULAR, COMERCIAL
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero=" + numero +
                ", tipo=" + tipo +
                '}';
    }
}
