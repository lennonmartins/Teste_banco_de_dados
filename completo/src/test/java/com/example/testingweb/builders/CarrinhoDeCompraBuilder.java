package com.example.testingweb.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.testingweb.carrinho.CarrinhoDeCompra;
import com.example.testingweb.carrinho.ItemDoCarrinho;
import com.example.testingweb.produto.Produto;
import com.example.testingweb.produto.ValorInvalido;

public class CarrinhoDeCompraBuilder {

    
    private static final int UMA_UNIDADE = 1;
    private Produto liquidificador;
    private Produto pratos;
    private Produto geladeira; 
    private List<ItemDoCarrinho> itens = new ArrayList<>();
    

    public CarrinhoDeCompraBuilder () throws ValorInvalido{
        geladeira = new Produto("Geladeira", 450.0);
        liquidificador = new Produto("Liquidificador", 250.0);
        pratos = new Produto("Jogo de pratos", 70.0);
    }

    public CarrinhoDeCompraBuilder emOrdemCrescente(){
       itens.add( new ItemDoCarrinho(geladeira, UMA_UNIDADE));
       itens.add(new ItemDoCarrinho(liquidificador, UMA_UNIDADE));
       itens.add( new ItemDoCarrinho(pratos, UMA_UNIDADE));
       return this;
    }

    public CarrinhoDeCompraBuilder comItemDoCarrinho(ItemDoCarrinho itemDoCarrinho){
        itens.add(itemDoCarrinho);
        return this;
    }

    public  CarrinhoDeCompra construir() {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        for (ItemDoCarrinho itenDoCarrinho: itens) {
            carrinhoDeCompra.adicionar(itenDoCarrinho);
        }
        return carrinhoDeCompra;
    }
}

