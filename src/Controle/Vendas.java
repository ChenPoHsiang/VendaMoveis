package Controle;
// Generated 07/10/2016 22:36:47 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vendas generated by hbm2java
 */
public class Vendas  implements java.io.Serializable {


     private String vendaId;
     private Cliente cliente;
     private Funcionario funcionario;
     private Date dataCompra;
     private Float valorTotal;
     private Integer numParcelas;
     private String formaPagamento;
     private Integer statusVenda;
     private Set prodVendas = new HashSet(0);
     private Set parcelas = new HashSet(0);

    public Vendas() {
    }

	
    public Vendas(String vendaId) {
        this.vendaId = vendaId;
    }
    public Vendas(String vendaId, Cliente cliente, Funcionario funcionario, Date dataCompra, Float valorTotal, Integer numParcelas, String formaPagamento, Integer statusVenda, Set prodVendas, Set parcelas) {
       this.vendaId = vendaId;
       this.cliente = cliente;
       this.funcionario = funcionario;
       this.dataCompra = dataCompra;
       this.valorTotal = valorTotal;
       this.numParcelas = numParcelas;
       this.formaPagamento = formaPagamento;
       this.statusVenda = statusVenda;
       this.prodVendas = prodVendas;
       this.parcelas = parcelas;
    }
   
    public String getVendaId() {
        return this.vendaId;
    }
    
    public void setVendaId(String vendaId) {
        this.vendaId = vendaId;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Date getDataCompra() {
        return this.dataCompra;
    }
    
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public Float getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Integer getNumParcelas() {
        return this.numParcelas;
    }
    
    public void setNumParcelas(Integer numParcelas) {
        this.numParcelas = numParcelas;
    }
    public String getFormaPagamento() {
        return this.formaPagamento;
    }
    
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Integer getStatusVenda() {
        return this.statusVenda;
    }
    
    public void setStatusVenda(Integer statusVenda) {
        this.statusVenda = statusVenda;
    }
    public Set getProdVendas() {
        return this.prodVendas;
    }
    
    public void setProdVendas(Set prodVendas) {
        this.prodVendas = prodVendas;
    }
    public Set getParcelas() {
        return this.parcelas;
    }
    
    public void setParcelas(Set parcelas) {
        this.parcelas = parcelas;
    }




}


