public class Banco {
    public static void main(String[] args) {
        ContaBanco conta01 = new ContaBanco(0001, "CC", "Gabriel");
        conta01.abrirConta();
        conta01.pagarMensal();
        conta01.depositar(1000);
        conta01.sacar(250);
        conta01.sacar(333);
        conta01.sacar(555);
        conta01.pagarMensal();
        conta01.depositar(100);
        conta01.sacar(88);
        conta01.fecharConta();
        conta01.extrato();
    }
}
