package br.com.cenaflix.podcast.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "podcasts")
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "produtor")
    private String produtor;

    @Column(name = "nome_episodio")
    private String nomeEpisodio;

    @Column(name = "numero_episodio")
    private int numeroEpisodio;

    @Column(name = "duracao")
    private String duracao;

    @Column(name = "url_repositorio")
    private String urlRepositorio;

    public Podcast() {
    }

    public Podcast(Long id, String produtor, String nomeEpisodio, int numeroEpisodio, String duracao, String urlRepositorio) {
        this.id = id;
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.numeroEpisodio = numeroEpisodio;
        this.duracao = duracao;
        this.urlRepositorio = urlRepositorio;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrlRepositorio() {
        return urlRepositorio;
    }

    public void setUrlRepositorio(String urlRepositorio) {
        this.urlRepositorio = urlRepositorio;
    }
    
    
}
