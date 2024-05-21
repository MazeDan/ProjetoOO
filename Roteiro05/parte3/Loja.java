package Roteiro05.parte3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double área;
    private String nomeProprietario;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;

        if (razaoSocial.equals("")){
            this.razaoSocial = nomeFantasia;
            }
            else {
            this.razaoSocial = razaoSocial;
            }
        this.cnpj = cnpj;
    }       

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return this.valorFat;
    }

    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getáRea() {
        return this.área;
    }

    public void setáRea(double área) {
        this.área = área;
    }

    public String getNomeProprietario() {
        return this.nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public static void compararFat_static(Loja lojaA, Loja lojaB ){
 
        if (lojaA.getValorFat() > lojaB.getValorFat()){
        System.out.println("Loja de Maior Fat : " + lojaA.nomeFantasia);
        }
        else {
        System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
            }
        }

    public static Loja compararFat_static_Return(Loja lojaA, Loja lojaB ){
            Loja lojaC;
 
            if (lojaA.getValorFat() > lojaB.getValorFat()){
                lojaC = lojaA;
            }
            else {
                lojaC = lojaB;
                            }
                
                return lojaC;
            }
            
    public void compararFat_naoStatic(Loja lojaB ){
        
        if (this.getValorFat() > lojaB.getValorFat()){
        System.out.println("Loja de Maior Fat : " + this.nomeFantasia);
        }
        else {
        System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
        }
    }

}
