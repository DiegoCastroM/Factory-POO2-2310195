/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactory;

/**
 *
 * @author Diego
 */
public abstract class Notificador {
    public abstract Notificacion factoryMethod();
    public void Notificador(String destinatario, String mensaje){
        Notificacion notificacion = factoryMethod();
        notificacion.enviar();
    }
}
