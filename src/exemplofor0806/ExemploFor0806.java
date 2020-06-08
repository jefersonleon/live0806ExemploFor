/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplofor0806;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ExemploFor0806 {

    public static void main(String[] args) {
        int cont, quant, numDoa, tipo, acCao, acGato;
        acCao = 0;
        acGato = 0;
        numDoa = Integer.parseInt(JOptionPane.showInputDialog("Quantas doações hoje?"));
        for (cont = 1; cont <= numDoa; cont++) {
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n (1)Gato"
                    + "\n(2)Cão"));
            if (tipo == 1) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Gatos?"));
                acGato = acGato + quant;
            } else if (tipo == 2) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Cães?"));
                acCao = acCao + quant;
            } else if (tipo < 1 || tipo > 2) {
                JOptionPane.showMessageDialog(null, "Tipo inválido apenas 1 ou 2");
                cont--;
            }
            JOptionPane.showMessageDialog(null, "Números de doações restantes " + (numDoa - cont));
        }//fim do loop
        JOptionPane.showMessageDialog(null, "Hoje foram doados " + acGato + " Gato(s)e " 
                + acCao + " Cão(ães)");

    }

}
