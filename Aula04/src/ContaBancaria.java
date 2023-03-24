import java.util.ArrayList;
public abstract class ContaBancaria {
    private int numeroConta;
    private double saldo;
    
    ArrayList<String> historico=new ArrayList<>();
    
    public abstract boolean sacar(double valor);
        
    
    
    public abstract boolean depositar(double valor);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }
      
    
}







