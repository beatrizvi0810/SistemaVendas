/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author beatriz.07928
 */
public class Televisao extends Produto{
    private Double polegadas;
    private String smarttv;

    public Televisao() {
    }

    public Double polegadas() {
        return polegadas;
    }

    public void setPolegadas(Double polegadas) {
        this.polegadas = polegadas;
    }

    public String getSmartTv() {
        return smarttv;
    }

    public void setSmartTv(String smarttv) {
        this.smarttv = smarttv;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               " | Preço: " + super.getPreço() +
               " | Polegadas: " + this.polegadas +
               " | Smart?: " + this.smarttv;
    }
}