/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoBancario c1 = new ContoEsteso("1a0F");
        ContoBancario c2 = new ContoEsteso("1a0F", 9000);
        ContoBancario c3 = new ContoEsteso("1a0F", 1000);
        c2.deposito(1000);
        c2.prelievo(2000);
        System.out.println(c2);
    }

}
