/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

public class ContoBancario {

    protected String numConto;
    protected int bilancio;

    public ContoBancario(String numConto) {
        this.numConto = numConto;
        this.bilancio = 0;
    }

    public ContoBancario(String numConto, int bilancio) {
        this.numConto = numConto;
        this.bilancio = bilancio;
    }

    public String getNumConto() {
        return numConto;
    }

    public int getBilancio() {
        return bilancio;
    }

    public void deposito(int deposito) {
        bilancio += deposito;
    }

    public void prelievo(int prelievo) {

        if (bilancio < prelievo) {
            throw new IllegalArgumentException("non puoi");
        }

        if (bilancio > 0) {
            bilancio -= prelievo;

        }
    }

    @Override
    public String toString() {
        return "ContoBancario:" + "\n numConto=" + numConto + "\n bilancio=" + bilancio;
    }

}
