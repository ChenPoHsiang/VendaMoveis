package Controle;
// Generated 07/10/2016 23:11:34 by Hibernate Tools 4.3.1



/**
 * ProdVenda generated by hbm2java
 */
public class ProdVenda  implements java.io.Serializable {


     private String prodVendaId;
     private Produto produto;
     private Vendas vendas;
     private Integer quantidade;
     private Float valorUnitario;

    public ProdVenda() {
    }

	
    public ProdVenda(String prodVendaId) {
        this.prodVendaId = prodVendaId;
    }
    public ProdVenda(String prodVendaId, Produto produto, Vendas vendas, Integer quantidade, Float valorUnitario) {
       this.prodVendaId = prodVendaId;
       this.produto = produto;
       this.vendas = vendas;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
    }
   
    public String getProdVendaId() {
        return this.prodVendaId;
    }
    
    public void setProdVendaId(String prodVendaId) {
        this.prodVendaId = prodVendaId;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Vendas getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Float getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }




}


