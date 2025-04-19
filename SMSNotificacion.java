/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactory;

/**
 *
 * @author Diego
 */
public class SMSNotificacion implements Notificacion {
    private String telefono;
    private String mensaje;
      @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + telefono + ": " + mensaje);
    }
}
