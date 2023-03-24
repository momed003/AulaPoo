
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaOperacao;

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public ContaCorrente(){
   this.setTaxaOperacao(10);
}
    
    
  @Override
    public boolean sacar(double valor) {
        
        if (valor>0 && super.getSaldo()-valor-this.getTaxaOperacao()>0) {
          super.setSaldo(super.getSaldo()-valor);//desconta o valor
          super.getHistorico().add("levantamento de valor: "+valor);
          super.setSaldo(super.getSaldo()-taxaOperacao);
          super.getHistorico().add("taxa de operacao levantamento de valor: "+this.getTaxaOperacao());
          return true;
      }
        
        return false;
        }

    @Override
    public boolean depositar(double valor) {
        if (valor>this.getTaxaOperacao())   {
            
          super.setSaldo(super.getSaldo()+ valor);
          super.getHistorico().add("deposito de valor: "+valor);
          super.setSaldo(super.getSaldo()-taxaOperacao);
          super.getHistorico().add("taxa de operacao deposito de valor: "+this.getTaxaOperacao());
          return true;
        }
        return false;
        }

    @Override
    public void mostrarDados() {
   
    }
    
    

  
    
}
