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
public class Banco {
      public static void main(String[] args) {
        //Primero creamos una tarjeta credito
       TarjetaCredito tcredito=new TarjetaCredito();
       tcredito.setNumero(1234);
       tcredito.setNombre("Banamex");
       tcredito.setTipo("credito");
       tcredito.setSaldo(100);
       
       
       TarjetaAhorro tahorro=new TarjetaAhorro();
       tahorro.setNumero(4321);
       tahorro.setNombre("Bancomer");
       tahorro.setTipo("ahorro");
       tahorro.setSaldo(100);

               
        
       TarjetaNomina tnomina=new TarjetaNomina();
       tnomina.setNumero(6789);
       tnomina.setNombre("hsbc");
       tnomina.setTipo("nomina");
       tnomina.setSaldo(100);
     
       /* generar el codigo del deposito 
       Forma basica 
       TJ Nomina */
       //tnomina.pagar(150);
       //TJ Ahorro
       //tahorro.pagar(150);      
      //Tc 
      //tcredito.pagar(150);
      
      //generar un arreglo de tarjetas
      Tarjeta tarjetas[]=new Tarjeta[3];
      tarjetas[0]=tnomina;
      tarjetas[1]=tcredito;
      tarjetas[2]=tahorro;
      
      //iteramos el arreglo "recorrer el arreglo "
      for(Tarjeta t: tarjetas){
          t.pagar(150);
          System.out.println("saldo es: "+ t.getSaldo()+ "  tipo "+t.getTipo());
      }
      
    }
    
}
