
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private double limite;
    
    public ContaPoupanca(){
        this.setLimite(1000);
        
    }
    
    
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }
    
    
    
    @Override
    public boolean sacar(double valor) {
        if (super.getSaldo()-valor>=this.getLimite()*(-1)) {
            super.setSaldo(super.getSaldo()-valor);
            super.getHistorico().add("levantamento de valor: "+valor);
            return true;
        }
    return false;
    }

    @Override
    public boolean depositar(double valor) {
   if (valor>0)   {
            
          super.setSaldo(super.getSaldo()+ valor);
          super.getHistorico().add("deposito de valor: "+valor);
            return true;
        }
   return false;
    }

    @Override
    public void mostrarDados() {
   
    }
    
}
