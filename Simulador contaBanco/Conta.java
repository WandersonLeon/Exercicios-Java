/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

public final class Conta{

    //Atributos
    public int conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("______________________________");
        System.out.println("Conta: " + this.getConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Titular: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    //Metodo construtor
    public Conta() {
        this.setSaldo(0.0);
        this.setStatus(false);
    }

    //Metodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equalsIgnoreCase("CC")) {
            this.setSaldo(50);
        } else if (t.equalsIgnoreCase("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0.0) {
            System.out.println("Conta não pode ser encerrada pois ainda tem saldo.");
        } else if (this.getSaldo() < 0.0) {
            System.out.println("Conta não pode ser encerrada pois esta em debito.");

        } else {
            setStatus(false);
            System.out.println("Conta encerrada com sucesso! ");
        }

    }

    public void depositar(double deposito) {
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Deposito realizado na conta" + getDono());
        } else {
            System.out.println("Conta INATIVA");
        }
    }

    public void sacar(double saque) {
        if (status == true) {
            if (getSaldo() >= saque) {
                setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Conta INATIVA");
        }
    }

    public void pagarMensal() {
        double taxa = 0;
        if (getTipo().equalsIgnoreCase("CC")) {
            taxa = 30;
        } else if (getTipo().equalsIgnoreCase("CP")) {
            taxa = 50;
        }
        if (getStatus()) {
            if (getSaldo() > taxa) {
                setSaldo(getSaldo() - taxa);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }
        } else {
            System.out.println("Conta INATIVA !");
        }

    }

    //Metodos assessores
    public int getConta() {
        return this.conta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public boolean getStatus() {
        return this.status;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setConta(int numConta) {
        this.conta = numConta;
    }

    public void setTipo(String tipoConta) {
        this.tipo = tipoConta;
    }

    public void setDono(String nomeDono) {
        this.dono = nomeDono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
