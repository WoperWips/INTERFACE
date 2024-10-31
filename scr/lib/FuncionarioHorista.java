package scr.lib;

//Classe que representa um funcionário horista junto com o bônus é calculado como 10% do total anual recebido pelo funcionário.
public class FuncionarioHorista implements Funcionario {
    private double salarioPorHora;
    private int horasTrabalhadas;

   //salarioPorHora o salário recebido por hora, horasTrabalhadas o total de horas trabalhadas no mês.
    public FuncionarioHorista(double salarioPorHora, int horasTrabalhadas) {
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override //10% do total anual recebido.
    public double calcularBonus() {
        double salarioAnual = salarioPorHora * horasTrabalhadas * 12; // considerando 12 meses
        return salarioAnual * 0.10; // 10% do total anual
    }
}
