public class ContaConta {

    public static void main(String[] args) {
        Cliente brandon = new Cliente();
        brandon.setNome("Brandon");

        Conta cc = new ContaCorrente(brandon);
        Conta poupanca = new ContaPoupanca(brandon);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimi rExtrato();
        poupanca.imprimirExtrato();
    }
}
