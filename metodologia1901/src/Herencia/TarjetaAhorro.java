/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
//extends palabara reservada (es hija de tarjeta)
public class TarjetaAhorro  extends Tarjeta{

    @Override
    public void pagar(float deposito) {
        setSaldo((getSaldo()+deposito)+deposito*0.05f);
        
    }
    
    
}
