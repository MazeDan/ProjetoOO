package Roteiro08.parte03;

public class Cliente {
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

  

    Cliente(String cpf_cnpj,String nome,String endereco,String email,String telefone){
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpfCpnj(){
        return this.cpf_cnpj;
    } 
    public void setCPfCpnj(String cpf_cnpj){
        this.cpf_cnpj = cpf_cnpj;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String Nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


