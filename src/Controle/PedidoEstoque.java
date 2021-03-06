package Controle;
// Generated 16/10/2016 21:31:24 by Hibernate Tools 4.3.1

import ControleProduto.Produto;




/**
 * PedidoEstoque generated by hbm2java
 */
public class PedidoEstoque  implements java.io.Serializable {


     private String idPedEst;
     private Produto produto;
     private Integer quantidade;
     private Integer estatus;
     private Integer quantidadePed;

    public PedidoEstoque() {
    }

	
    public PedidoEstoque(String idPedEst) {
        this.idPedEst = idPedEst;
    }
    public PedidoEstoque(String idPedEst, Produto produto, Integer quantidade, Integer estatus, Integer quantidadePed) {
       this.idPedEst = idPedEst;
       this.produto = produto;
       this.quantidade = quantidade;
       this.estatus = estatus;
       this.quantidadePed = quantidadePed;
    }
   
    public String getIdPedEst() {
        return this.idPedEst;
    }
    
    public void setIdPedEst(String idPedEst) {
        this.idPedEst = idPedEst;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Integer getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    public Integer getQuantidadePed() {
        return this.quantidadePed;
    }
    
    public void setQuantidadePed(Integer quantidadePed) {
        this.quantidadePed = quantidadePed;
    }




}


