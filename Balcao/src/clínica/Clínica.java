/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clínica;

/**
 *
 * @author ragsf
 */
public class Clínica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Info e = new Info();
        e.setLocationRelativeTo(null);
        e.setVisible(true);

        Escolha s = new Escolha();
        s.setLocationRelativeTo(null);
        s.setVisible(true);

        Balcões b1 = new Balcões();
        b1.setLocationRelativeTo(null);
        b1.jLabel1.setText("Balcão 1");
        b1.setVisible(true);

        Balcões b2 = new Balcões();
        b2.setLocationRelativeTo(null);
        b2.jLabel1.setText("Balcão 2");
        b2.setVisible(true);

        Balcões b3 = new Balcões();
        b3.setLocationRelativeTo(null);
        b3.jLabel1.setText("Balcão 3");
        b3.setVisible(true);
    }

}
