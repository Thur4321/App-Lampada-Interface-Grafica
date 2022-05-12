
package view;

import classes.EstadoLampada;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {
    
    private EstadoLampada lampada;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        lampada = new EstadoLampada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLLampada = new javax.swing.JLabel();
        jTBotao = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lampada_desligada.jpg"))); // NOI18N

        jTBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/off.JPG"))); // NOI18N
        jTBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLLampada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jTBotao)
                .addGap(93, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLLampada, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jTBotao)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBotaoActionPerformed
        if(lampada.getEstadoLampada()){
            lampada.apaga();
            jLLampada.setIcon(new ImageIcon(getClass().getResource("/icones/lampada_desligada.jpg")));
            jTBotao.setIcon(new ImageIcon(getClass().getResource("/icones/off.JPG")));
        }
        else{
            lampada.acende();
            jLLampada.setIcon(new ImageIcon(getClass().getResource("/icones/lampada_ligada.png")));
            jTBotao.setIcon(new ImageIcon(getClass().getResource("/icones/on.jpg")));
        }
    }//GEN-LAST:event_jTBotaoActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLLampada;
    private javax.swing.JToggleButton jTBotao;
    // End of variables declaration//GEN-END:variables
}
