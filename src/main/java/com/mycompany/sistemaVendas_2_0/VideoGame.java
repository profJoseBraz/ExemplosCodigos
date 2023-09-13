/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0;

/**
 *
 * @author 10156
 */
public class VideoGame extends Produto{
    private String plataforma; //Se é Playstation, XBox, Nintendo Switch etc.

    public VideoGame() {
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
