package scr;

//Classe que representa um funcionário Salariado junto com o bônus de um valor fixo de R$ 5.000,00.
public class FuncionarioSalariado implements Funcionario {
    private static final double BONUS_FIXO = 5000.00;
//Calcula o bônus do funcionário Salariado

    @Override //valor fixo do bônus.
    public double calcularBonus() {
        return BONUS_FIXO;
    }
}
