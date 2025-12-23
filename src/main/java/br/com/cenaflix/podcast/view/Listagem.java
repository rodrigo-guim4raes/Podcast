package br.com.cenaflix.podcast.view;

import br.com.cenaflix.podcast.dao.PodcastDAO;
import br.com.cenaflix.podcast.model.Podcast;
import br.com.cenaflix.podcast.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Listagem extends javax.swing.JFrame {
    
    private Usuario usuarioLogado;

    public Listagem(Usuario usuarioLogado) {
        initComponents();
        this.usuarioLogado = usuarioLogado; 
        aplicarPermissaoExclusao();
        setLocationRelativeTo(null);
        aplicarVoltar();
    }

    private void aplicarPermissaoExclusao() { 
        if (!usuarioLogado.getTipo().equals("Administrador")) { 
            btExcluir.setEnabled(false); 
            btExcluir.setVisible(false);
        } 
    }
    
    private void aplicarVoltar(){
        if (!usuarioLogado.getTipo().equals("Administrador") || 
                !usuarioLogado.getTipo().equals("Operador"))
            btVoltar.setEnabled(false);
            btVoltar.setVisible(false);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTAGEM DE EPISÓDIOS");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Filtro por produtor:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CENAFLIX - LISTAGEM");

        btFiltrar.setText("Filtrar");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        table.setModel(tabela());
        jScrollPane1.setViewportView(table);

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFiltrar)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            String produtor = txtFiltro.getText();
                filtrarPorProdutor(produtor);
            }
        });
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (!usuarioLogado.getTipo().equals("Administrador")) { 
            JOptionPane.showMessageDialog(this, "Você não tem permissão para excluir.");
            return;
        }
     
        int linhaSelecionada = table.getSelectedRow();
        if (linhaSelecionada != -1) {         
            Long id = (Long) table.getValueAt(linhaSelecionada, 0);
            PodcastDAO dao = new PodcastDAO();
            dao.excluir(id);
            JOptionPane.showMessageDialog(this, "Podcast excluído com sucesso!");        
            atualizarTabela();
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um podcast para excluir.");
    }


    }//GEN-LAST:event_btExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        TelaPrincipal tela = new TelaPrincipal(usuarioLogado); tela.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    
    public DefaultTableModel tabela(){
        DefaultTableModel modelo = new DefaultTableModel(
            new Object[]{"ID", "Produtor", "Nome Episodio", "N° Episodio", "Duração", "URL"}, 0
        );
        
         PodcastDAO dao = new PodcastDAO();
        List<Podcast> lista = dao.listarTodos();

        for (Podcast p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getProdutor(),
                p.getNomeEpisodio(),
                p.getNumeroEpisodio(),
                p.getDuracao(),
                p.getUrlRepositorio()
            });
        }

        return modelo;
    }
    
    private void filtrarPorProdutor(String produtor) {
        DefaultTableModel modelo = new DefaultTableModel(
            new Object[]{"ID", "Produtor", "Nome Episodio", "N° Episodio", "Duração", "URL"}, 0
        );

        PodcastDAO dao = new PodcastDAO();
        List<Podcast> lista = dao.listarPorProdutor(produtor);

        for (Podcast p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getProdutor(),
                p.getNomeEpisodio(),
                p.getNumeroEpisodio(),
                p.getDuracao(),
                p.getUrlRepositorio()
            });
        }

        table.setModel(modelo);
    }
    
    private void atualizarTabela() {
    PodcastDAO dao = new PodcastDAO();
    List<Podcast> lista = dao.listarTodos();

    DefaultTableModel modelo = (DefaultTableModel) table.getModel();
    modelo.setRowCount(0); // limpa a tabela

    for (Podcast p : lista) {
        modelo.addRow(new Object[]{
            p.getId(),
            p.getProdutor(),
            p.getNomeEpisodio(),
            p.getNumeroEpisodio(),
            p.getDuracao(),
            p.getUrlRepositorio()
        });
    }
}


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
