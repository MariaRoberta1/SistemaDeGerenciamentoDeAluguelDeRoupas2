package Entidades;

public abstract class Pessoa {
	
	private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private String dataNascimento;
    private String email;
    private int celular;
    private String cpf;
    private int rg;
    private String redeSocial;
    private int idade;
  

    public Pessoa() {
    	
    }

    public Pessoa(String nome, String sobreNome,String dataNascimento, String email, int celular, String cpf, int rg, String redeSocial, int idade, String nomeCompleto){

          this.nome = nome;
          this.sobrenome = sobreNome;
          this.dataNascimento = dataNascimento;
          this.email = email;
          this.celular = celular;
          this.cpf = cpf;
          this.rg = rg;
          this.redeSocial = redeSocial;
          this.idade = idade;
          this.nomeCompleto = nomeCompleto;
           
         

    }

    public Pessoa(String nome, String sobrenome, String cpf, int celular){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.celular = celular;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public void SetSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
        
    }

    public String getSobrenome(){
        return sobrenome;

    }

    public void setDataNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;

    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setEmail(String email){
        this.email = email;

    }

    public String getEmail(){
        return email;

    }

    public void setCelular(int celular){
        this.celular = celular;

    }

    public int getCelular(){
        return celular;

    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;

    }

    public String getCpf(){
        return cpf;

    }

    public void setRg(int rg){
        this.rg = rg;

    }

    public int getRg(){
        return rg;
    }

    public void setRedeSocial(String redeSocial){
        this.redeSocial = redeSocial;

    }

    public String getRedeSocial(){
        return redeSocial;
    }

    public void setNomeCompleto(String nomeCompleto){
       this.nomeCompleto = this.nome + " " + this.sobrenome;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}
