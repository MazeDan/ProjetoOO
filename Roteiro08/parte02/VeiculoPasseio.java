package Roteiro08.parte02;

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

    @Override //PASSAR POR CIMA DO PAI
    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio * this.qtdeMaxPassageiros;
    }

}
