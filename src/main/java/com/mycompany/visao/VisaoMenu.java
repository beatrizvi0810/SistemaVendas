/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author beatriz.07928
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        System.out.println("======SISTEMAS DE VENDAS 2.0======");
        System.out.println("1 - Cadastrar Produtos");
        System.out.println("2 - Alterar Produtos");
        System.out.println("3 - Remover Produtos");
        System.out.println("4 - Listar Produtos");
        System.out.println("==================================");
        int opcaoMenu = new Scanner(System.in).nextInt();
       
        return opcaoMenu;
    }

    public static int menuEscolhaProduto(){
        System.out.println("======CADASTRAR PRODUTO======");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - VideoGame");
        System.out.println("2 - Computador");
        System.out.println("3 - Televisão");
        System.out.println("===================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
       
        return opcaoProduto;
    }
   
    public static int menuAlteracaoProduto(){
        System.out.println("=======ALTERAR PRODUTO=======");
        System.out.println("Qual produto deseja alterar?");
       
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " +  ControleSistema.produtos.get(i));
        }
   
        System.out.println("===================================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
       
        return produtoAlterar;
    }
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof Computador computador){
            System.out.println("Novo nome: ");
            computador.setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            computador.setPreço(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memória Ram: ");
            computador.setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo processador: ");
            computador.setProcessador(new Scanner(System.in).nextLine());
        }
   
    return object;
   
    }
   
        public static int menuRemocaoProduto(){
        System.out.println("=======REMOVER PRODUTO=======");
        System.out.println("Qual produto deseja remover?");
       
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " +  ControleSistema.produtos.get(i));
        }
   
        System.out.println("===================================================");
        int produtoRemover = new Scanner(System.in).nextInt();
       
        return produtoRemover;
    }
        public static int menuComprarProduto(){
        System.out.println("=======COMPRAR PRODUTO=======");
        System.out.println("Qual produto deseja comprar? ");
       
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " +  ControleSistema.produtos.get(i));
        }
   
        System.out.println("===================================================");
        int produtoComprar = new Scanner(System.in).nextInt();
       
        return produtoComprar;
        }
}