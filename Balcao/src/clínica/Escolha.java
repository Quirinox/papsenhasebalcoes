/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clínica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ragsf
 */
public class Escolha extends javax.swing.JFrame {

    /**
     * Creates new form Senha
     */
    public Escolha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha o serviço pretendido");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Particular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Empresas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Informações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File f1 = new File("senhas.txt");
        try {

            int v = 0;
            if (!f1.exists()) {
                //cria um arquivo (vazio)
                FileWriter fw = new FileWriter(f1, true);
                BufferedWriter bw = new BufferedWriter(fw);
                f1.createNewFile();
                v = 0;

                bw.write(String.valueOf(v));

                bw.newLine();
                bw.close();
                fw.close();
            }

//            
            //faz a leitura do arquivo 
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while (br.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                linha = br.readLine();

            }
            br.close();
            fr.close();
            int s_consulta = Integer.parseInt(linha);
            s_consulta++;
            linha = String.valueOf(s_consulta);
            FileWriter fw = new FileWriter(f1, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linha);
            bw.newLine();
            bw.close();
            fw.close();
            senha_consulta sn = new senha_consulta();
            sn.setVisible(true);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'às' HH:mm:ss ");
            Date date = new Date(System.currentTimeMillis());

            sn.jLabel1.setText("Senha de Particulares");
            sn.jLabel2.setText("P" + linha);

            sn.jLabel3.setText(formatter.format(date));

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File e = new File("Exames.txt");
        try {

            int v = 0;
            if (!e.exists()) {
                //cria um arquivo (vazio)
                FileWriter fw = new FileWriter(e, true);
                BufferedWriter bw = new BufferedWriter(fw);
                e.createNewFile();
                v = 0;

                bw.write(String.valueOf(v));

                bw.newLine();
                bw.close();
                fw.close();
            }

//            
            //faz a leitura do arquivo 
            FileReader fr = new FileReader(e);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while (br.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                linha = br.readLine();

            }
            br.close();
            fr.close();
            int s_consulta = Integer.parseInt(linha);
            s_consulta++;
            linha = String.valueOf(s_consulta);
            FileWriter fw = new FileWriter(e, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linha);
            bw.newLine();
            bw.close();
            fw.close();
            senha_consulta sn = new senha_consulta();
            sn.setVisible(true);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'as' HH:mm:ss ");
            Date date = new Date(System.currentTimeMillis());

            sn.jLabel1.setText("Senha de Empresas");
            sn.jLabel2.setText("E" + linha);
            sn.jLabel3.setText(formatter.format(date));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File i = new File("Informação.txt");
        try {

            int v = 0;
            if (!i.exists()) {
                //cria um arquivo (vazio)
                FileWriter fw = new FileWriter(i, true);
                BufferedWriter bw = new BufferedWriter(fw);
                i.createNewFile();
                v = 0;

                bw.write(String.valueOf(v));

                bw.newLine();
                bw.close();
                fw.close();
            }

//            
            //faz a leitura do arquivo 
            FileReader fr = new FileReader(i);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while (br.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                linha = br.readLine();

            }
            br.close();
            fr.close();
            int s_consulta = Integer.parseInt(linha);
            s_consulta++;
            linha = String.valueOf(s_consulta);
            FileWriter fw = new FileWriter(i, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linha);
            bw.newLine();
            bw.close();
            fw.close();
            senha_consulta sn = new senha_consulta();
            sn.setVisible(true);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'as' HH:mm:ss ");
            Date date = new Date(System.currentTimeMillis());

            sn.jLabel1.setText("Outros");
            sn.jLabel2.setText("I" + linha);
            sn.jLabel3.setText(formatter.format(date));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

//     * @param args the command line arguments
//     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
