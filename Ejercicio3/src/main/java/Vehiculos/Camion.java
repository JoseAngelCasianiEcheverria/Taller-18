/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Gercray
 */
public class Camion implements Vehiculo {

    @Override
    public void conducir() {
        System.out.println("Conduciendo el camion");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camion");
    }
}