package Controle;
// Generated 07/10/2016 22:36:47 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Faltas generated by hbm2java
 */
public class Faltas  implements java.io.Serializable {


     private String idFaltas;
     private Funcionario funcionario;
     private Integer justificativaFlag;
     private String justificativatextual;
     private Date datafalta;

    public Faltas() {
    }

	
    public Faltas(String idFaltas) {
        this.idFaltas = idFaltas;
    }
    public Faltas(String idFaltas, Funcionario funcionario, Integer justificativaFlag, String justificativatextual, Date datafalta) {
       this.idFaltas = idFaltas;
       this.funcionario = funcionario;
       this.justificativaFlag = justificativaFlag;
       this.justificativatextual = justificativatextual;
       this.datafalta = datafalta;
    }
   
    public String getIdFaltas() {
        return this.idFaltas;
    }
    
    public void setIdFaltas(String idFaltas) {
        this.idFaltas = idFaltas;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Integer getJustificativaFlag() {
        return this.justificativaFlag;
    }
    
    public void setJustificativaFlag(Integer justificativaFlag) {
        this.justificativaFlag = justificativaFlag;
    }
    public String getJustificativatextual() {
        return this.justificativatextual;
    }
    
    public void setJustificativatextual(String justificativatextual) {
        this.justificativatextual = justificativatextual;
    }
    public Date getDatafalta() {
        return this.datafalta;
    }
    
    public void setDatafalta(Date datafalta) {
        this.datafalta = datafalta;
    }




}


