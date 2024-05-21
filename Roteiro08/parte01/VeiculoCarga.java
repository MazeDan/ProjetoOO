package Roteiro08.parte01;

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
}
