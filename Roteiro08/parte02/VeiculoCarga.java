package Roteiro08.parte02;

public class VeiculoCarga extends Veiculo {
    private int pesoMax;

    VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
    }
    
    public int getPesoMax() {
        return this.pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    @Override //PASSAR POR CIMA DO PAI
    public double calcPedagio() {
        super.taxaPedagio = 2.0;
        return super.taxaPedagio * this.pesoMax;
    }

}
