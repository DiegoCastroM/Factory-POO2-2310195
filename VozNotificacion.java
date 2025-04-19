/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactory;
/**
 *
 * @author Diego
 */
public class VozNotificacion implements Notificacion{
    private String dispositivo;
    private String textoVoz; 
    public void convertirTextoVoz(){
        
    }
    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de voz a " + dispositivo + ": " + textoVoz);
    }
}
