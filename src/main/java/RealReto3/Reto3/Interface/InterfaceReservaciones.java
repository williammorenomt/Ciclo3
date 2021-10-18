/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealReto3.Reto3.Interface;

import RealReto3.Reto3.Modelo.Reservaciones;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer> {
    
}
