package Roteiro08.parte01;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;


    Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setanoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

}
