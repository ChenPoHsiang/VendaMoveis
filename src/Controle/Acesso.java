package Controle;
// Generated 07/10/2016 23:11:34 by Hibernate Tools 4.3.1



/**
 * Acesso generated by hbm2java
 */
public class Acesso  implements java.io.Serializable {


     private String login;
     private Funcionario funcionario;
     private String senha;

    public Acesso() {
    }

    public Acesso(String login, Funcionario funcionario, String senha) {
       this.login = login;
       this.funcionario = funcionario;
       this.senha = senha;
    }
   
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}

