/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactory;

/**
 *
 * @author Diego
 */
public class CreadorPushNotificacion extends Notificador{
    public Notificacion factoryMethod(){
        return new PushNotificacion();
    }
}
