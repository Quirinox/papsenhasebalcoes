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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ragsf
 */
public class Balcões extends javax.swing.JFrame {

    void b1() {
        File arqc = new File("arqc.txt");
        File c = new File("senhas.txt");
        try {

            if (!arqc.exists()) {
                arqc.createNewFile();

                FileWriter fw = new FileWriter(arqc, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));

                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqc);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while (br.ready()) {
                linha = br.readLine();

            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);
            a++;

            if (a == 100) {
                a = 0;
            }
            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();
            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);
            if (a <= l) {
                Info.jLabel7.setText("P" + linha);

                Info.jLabel10.setText(jLabel1.getText());
                FileWriter fw = new FileWriter(arqc, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(linha);
                bw.newLine();
                bw.close();
                fw.close();
            }

        } catch (IOException ex) {

        }

    }

    void b2() {
        File arqe = new File("arqe.txt");
        File c = new File("Exames.txt");
        try {

            if (!arqe.exists()) {
                arqe.createNewFile();

                FileWriter fw = new FileWriter(arqe, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));
                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqe);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while (br.ready()) {
                linha = br.readLine();
            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);
            a++;

            if (a == 100) {
                a = 0;
            }

            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();
            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);
            if (a <= l) {
                Info.jLabel8.setText("E" + linha);

                Info.jLabel11.setText(jLabel1.getText());
                FileWriter fw = new FileWriter(arqe, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(linha);
                bw.newLine();
                bw.close();
                fw.close();

            }

        } catch (IOException ex) {

        }

    }

    void b3() {
        File arqi = new File("arqi.txt");
        File c = new File("Informação.txt");

        try {

            if (!arqi.exists()) {
                arqi.createNewFile();

                FileWriter fw = new FileWriter(arqi, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));

                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqi);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(arqi, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String linha = "";
            while (br.ready()) {
                linha = br.readLine();

            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);
            a++;

            if (a == 100) {
                a = 0;
            }

            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();
            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);
            if (a <= l) {
                Info.jLabel9.setText("I" + linha);

                Info.jLabel12.setText(jLabel1.getText());

                bw.write(linha);

                bw.newLine();
                bw.close();
                fw.close();

            }

        } catch (IOException ex) {

        }

    }

    void p() {
        File arqc = new File("arqc.txt");
        File c = new File("senhas.txt");
        try {

            if (!arqc.exists()) {
                arqc.createNewFile();

                FileWriter fw = new FileWriter(arqc, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));

                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqc);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while (br.ready()) {
                linha = br.readLine();

            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);

            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();

            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);
            if (a < l) {
                b1();
            }

            if (a == l) {
                b3();
            }

        } catch (IOException ex) {

        }
    }

    void p2() {
        File arqe = new File("arqe.txt");
        File c = new File("Exames.txt");
        try {

            if (!arqe.exists()) {
                arqe.createNewFile();

                FileWriter fw = new FileWriter(arqe, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));
                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqe);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while (br.ready()) {
                linha = br.readLine();
            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);

            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();

            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);
            if (a < l) {
                b2();
            }

            if (a == l) {
                p3();
            }

        } catch (IOException ex) {

        }
    }

    void p3() {
        File arqc = new File("arqc.txt");
        File c = new File("senhas.txt");
        try {

            if (!arqc.exists()) {
                arqc.createNewFile();

                FileWriter fw = new FileWriter(arqc, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int a = 0;
                bw.write(String.valueOf(a));

                bw.newLine();
                bw.close();
                fw.close();

            }

            FileReader fr = new FileReader(arqc);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while (br.ready()) {
                linha = br.readLine();

            }
            br.close();
            fr.close();

            int a = Integer.parseInt(linha);

            FileReader fc = new FileReader(c);
            BufferedReader bc = new BufferedReader(fc);
            String t = "";
            while (bc.ready()) {  //enquanto houver mais linhas continua a ler
                //lê a proxima linha 
                t = bc.readLine();

            }
            bc.close();
            fc.close();

            int l;
            l = Integer.parseInt(t);
            linha = String.valueOf(a);

            b3();

        } catch (IOException ex) {

        }
    }

    public Balcões() {

        initComponents();
    }

    Scanner ler = new Scanner(System.in);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Balcão 1");

        jButton1.setText("Próximo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 0, 0));
        jCheckBox1.setText("Particular");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox2.setText("Empresas");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 255));
        jCheckBox3.setText("Outros");
        jCheckBox3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addContainerGap(14, Short.MAX_VALUE))
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

        //C&E&IS
        if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
            p2();
        }

        //C&ES
        if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && !jCheckBox3.isSelected()) {
            p2();
        }

        //E&IS
        if (!jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
            p2();
        }

        //C&IS
        if (jCheckBox1.isSelected() && !jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
            p();
        }

        //CS
        if (jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected()) {
            b1();
        }

        //ES
        if (!jCheckBox1.isSelected() && jCheckBox2.isSelected() && !jCheckBox3.isSelected()) {
            b2();
        }

        //IS
        if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
            b3();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Balcões.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balcões.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balcões.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balcões.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balcões().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
