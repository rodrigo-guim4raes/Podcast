package br.com.cenaflix.podcast.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "senha")
    private String senha;
    
    @Column(name = "tipo")
    private String tipo;
    
    public Usuario(){
        
    }

    public Usuario(String nome, String senha, String tipo) {
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
}
