package scr.lib;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioSalariado = new FuncionarioSalariado();
        Funcionario funcionarioHorista = new FuncionarioHorista(20.00, 160); // Salário por hora e horas trabalhadas

        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioSalariado.calcularBonus());
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}
