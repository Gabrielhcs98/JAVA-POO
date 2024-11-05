public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta() {
        this.status = true;
        getTipo();
        switch (this.tipo) {
            case "CP":
                this.setSaldo(saldo + 50);
                break;
            case "CC":
                this.setSaldo(saldo + 150);
                break;
            default:
                System.out.println("Erro! Digite apenas CC ou CP no campo Tipo");
                break;
        }
    }

    public ContaBanco(int numConta, String tipo, String dono) {
        this.setSaldo(0);
        this.status = false;
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
    }

    public void fecharConta() {
        if (getSaldo() == 0f) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        } else if(getSaldo() <= 0){
            System.out.println("Impossível fechar a conta.\nHá débitos em aberto!");
        } else if(getSaldo() >= 0){
            System.out.println("Impossível fechar a conta.\nSaque o saldo restante na conta.");
        }
    }

    public void depositar(float valor_depositado) {
        if (isStatus() == true) {
            setSaldo(saldo + valor_depositado);
        } else {
            System.out.println("ERRO! Conta fechada/inexistente!");
        }
    }

    public void sacar(float valor_saque) {
        if ((isStatus() == true) && (getSaldo() >= valor_saque)) {
            setSaldo(saldo - valor_saque);
        } else {
            System.out.println("ERRO! Conta fechada/inexistente ou saldo insuficiente!");
        }
    }

    public void pagarMensal() {
        final int mensal_CC = 12;
        final int mensal_CP = 20;
        if ((isStatus() == true) && (getTipo() == "CC")) {
            setSaldo(saldo - mensal_CC);
        } 
        else if ((isStatus() == true) && (getTipo() == "CP")) {
            setSaldo(saldo - mensal_CP);
        } else {
            System.out.println("ERRO! Conta fechada/inexistente!");
        }
    }

    public void extrato() {
        System.out.println("EXTRATO BANCÁRIO:\n");
        System.out.println("Nome: " + getDono());
        System.out.println("Status: " + isStatus());
        System.out.println("Conta: " + getTipo() + "-" + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

}
