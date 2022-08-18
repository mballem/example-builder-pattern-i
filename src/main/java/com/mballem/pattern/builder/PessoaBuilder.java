package com.mballem.pattern.builder;

import com.mballem.pattern.domain.Endereco;
import com.mballem.pattern.domain.Pessoa;
import com.mballem.pattern.domain.Telefone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by http://www.mballem.com
 */
public class PessoaBuilder {

    private Pessoa pessoa;
    private Endereco endereco;
    private List<Telefone> telefones;

    /**
     * Cria uma instancia para o objeto Pessoa e Endereco.
     */
    public PessoaBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
        this.telefones = new ArrayList<Telefone>();
    }

    /**
     * Cria uma instancia para PessoaBuilder
     * @return uma instancia de PessoaBuilder
     */
    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    /**
     * Adiciona no objeto pessoa o valor para nome e sobrenome.
     * @param nome
     * @param sobrenome
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addNome(String nome, String sobrenome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }

    /**
     * Adiciona no objeto pessoa os valores para dia, mes e ano.
     * @param dia
     * @param mes
     * @param ano
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addDtNascimento(int dia, int mes, int ano) {
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para logradouro.
     * @param logradouro
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addLogradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para numero.
     * @param numero
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addNumero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para complemento.
     * @param complemento
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addComplemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para bairro.
     * @param bairro
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addBairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para cidade.
     * @param cidade
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addCidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa o valor para país
     * @param pais
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addPais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }

    /**
     * Adiciona ao objeto pessoa uma lista de telefones.
     * @param ddd
     * @param numero
     * @param tipoFone
     * @return retorna a instancia atual da classe PessoaBuilder.
     */
    public PessoaBuilder addFone(int ddd, int numero, Telefone.TipoFone tipoFone) {
        this.telefones.add(new Telefone(ddd, numero, tipoFone));
        return this;
    }

    /**
     * Para recuperar a instancia de Pessoa.
     * @return retorna o objeto Pessoa atual.
     */
    public Pessoa get() {
        this.pessoa.setEndereco(this.endereco);
        this.pessoa.setTelefones(this.telefones);
        return this.pessoa;
    }
}
