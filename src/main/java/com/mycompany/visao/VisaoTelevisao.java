/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author beatriz.07928
 */
public class VisaoTelevisao {
    public static Televisao menuCadastroTelevisao(){
        Televisao televisao = new Televisao();
       
        System.out.println("Nome: ");
        televisao.setNome(new Scanner(System.in).nextLine());
        System.out.println("Quantas polegadas? ");
        televisao.setSmartTv(new Scanner(System.in).nextLine());
        System.out.println("Smart Tv? ");
        televisao.setSmartTv(new Scanner(System.in).nextLine());
        System.out.println("Valor: ");
        televisao.setPreço(new Scanner(System.in).nextDouble());
        System.out.println("===============================================================");
       
        return televisao;
    }
}