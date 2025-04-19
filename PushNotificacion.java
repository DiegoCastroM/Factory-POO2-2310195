/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactory;

/**
 *
 * @author Diego
 */
public class PushNotificacion implements Notificacion {
    private String dispositivoId;
    private String mensaje;
    @Override
    public void enviar() {
        System.out.println("Enviando notificación push a " + dispositivoId + ": " + mensaje);
    }
}
