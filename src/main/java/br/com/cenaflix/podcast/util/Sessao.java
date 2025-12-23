package br.com.cenaflix.podcast.util;

import br.com.cenaflix.podcast.view.TelaLogin;
import javax.swing.JFrame;

public class Sessao {

    public static void logout(JFrame telaAtual) {
        telaAtual.setVisible(false);
        telaAtual.dispose();        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }
}
