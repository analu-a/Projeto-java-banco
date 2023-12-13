package br.senai.sp.jandira.model;

import java.util.Scanner;

abstract class Produtos {

  private String nome;
   private String fabricante;
   private String classificacao;
   private String cor;
   private String descricao;

   private String fornecedor;
   private Double preco, quantidadeEstoque, id_produto, codigo_produto;

   Scanner scanner = new Scanner(System.in);

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getFabricante() {
      return fabricante;
   }

   public void setFabricante(String fabricante) {
      this.fabricante = fabricante;
   }

   public String getClassificacao() {
      return classificacao;
   }

   public void setClassificacao(String classificacao) {
      this.classificacao = classificacao;
   }

   public String getCor() {
      return cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getFornecedor() {
      return fornecedor;
   }

   public void setFornecedor(String fornecedor) {
      this.fornecedor = fornecedor;
   }

   public Double getPreco() {
      return preco;
   }

   public void setPreco(Double preco) {
      this.preco = preco;
   }

   public Double getQuantidadeEstoque() {
      return quantidadeEstoque;
   }

   public void setQuantidadeEstoque(Double quantidadeEstoque) {
      this.quantidadeEstoque = quantidadeEstoque;
   }

   public Double getId_produto() {
      return id_produto;
   }

   public void setId_produto(Double id_produto) {
      this.id_produto = id_produto;
   }

   public Double getCodigo_produto() {
      return codigo_produto;
   }

   public void setCodigo_produto(Double codigo_produto) {
      this.codigo_produto = codigo_produto;
   }

   public void cadastrarProduto(){

       System.out.println("Qual o nome do produto");

   }



}
