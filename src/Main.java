import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Oscar");
        pessoa.setIdade(30);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println("----------------------------------------------------------------------");

        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setPreco(999.99);
        produto.setDescricao("Smartphone de última geração");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Descrição: " + produto.getDescricao());

        System.out.println("----------------------------------------------------------------------");

        Circulo circulo = new Circulo();
        circulo.setRaio(5.0);
        circulo.setCor("Azul");
        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.println("Cor do círculo: " + circulo.getCor());

        System.out.println("----------------------------------------------------------------------");

        Estudante estudante = new Estudante("Maria", 20, "123456789", "Rua das Flores, 123");
        System.out.println("Estudante: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("CPF: " + estudante.getCpf());
        System.out.println("Endereço: " + estudante.getEndereco());

        System.out.println("----------------------------------------------------------------------");

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Carlos");
        conta.setNumero(12345);
        conta.setSaldo(1000.0);
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("----------------------------------------------------------------------");

        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("City");
        carro.setAno(2013);
        carro.setVelocidade(200);
        System.out.println("A marca do veículo: " + carro.getMarca());
        System.out.println("O modelo do veículo é: " + carro.getModelo());
        System.out.println("O ano do veículo é: " + carro.getAno());
        System.out.println("A velocidade do veículo é: " + carro.getVelocidade());

        carro.acelerar(150);

        carro.frear(50);
        carro.exibirInformacoes();

        System.out.println("----------------------------------------------------------------------");


        BanheiroCompartilhado banheiro = new BanheiroCompartilhado();

        banheiro.getOcupante();
        banheiro.usarBanheiro("Ivan");
        System.out.println("Banheiro ocupado por: " + banheiro.getOcupante());
        banheiro.usarBanheiro("");
        System.out.println("Banheiro está ocupado? " + banheiro.isOcupado());
        }
}