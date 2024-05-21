package Roteiro08.parte01;

public class VeiculoPasseio extends Veiculo {

    private int qtdeMaxPassageiros;

    VeiculoPasseio(String placa, int anoFabricacao,int qtdeMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public int getQtdeMaxPassageiros() {
        return this.qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) {
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }
}
