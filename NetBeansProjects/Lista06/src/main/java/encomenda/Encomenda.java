/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomenda;

public class Encomenda {
    Double altura, largura, distancia, taxaDistancia,taxaTamanho, valorEncomenda, valorFrete;
    String enderecoRemetente, enderecoDestinatario;
    
    public void calcularFrete(){
      if (altura <= 6 && largura <= 16){
          taxaTamanho = valorEncomenda * 0.01;
   
      } else if (altura <= 15 && largura < 50){
        taxaTamanho = valorEncomenda * 0.03;
    
      } else {
          taxaTamanho = valorEncomenda * 0.05;
      }
    
      if (distancia <50) {
          taxaDistancia = 3.00;
   
      } else if (distancia < 200) {
          taxaDistancia = 5.00;
      
      } else {
          taxaDistancia = 7.00;
      }
     
      valorFrete = taxaTamanho + taxaDistancia;
    }  
    
    //Fazer com auxilio da professora
    // public void emitirEtiqueta(){
    // }
    
}
