package com.mballem.pattern.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by http://www.mballem.com
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }
}
