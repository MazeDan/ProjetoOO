package Roteiro08.parte03;

public class VeiculoPequeno extends Veiculo{
    private String modelo;

    VeiculoPequeno(String placa, int anoFabricacao,String modelo) {
        super(placa, anoFabricacao);
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
