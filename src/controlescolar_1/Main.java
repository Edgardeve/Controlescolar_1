/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlescolar_1;

import static controlescolar_1.InformacionAlumnos.arramat;
import static controlescolar_1.Calificaciones.par1;
import static controlescolar_1.Calificaciones.par2;
/**
 *
 * @author edgar
 */
public class Main 
{
    
    public static void main(String[] args)
    {
        Calificaciones Calif = new Calificaciones();
        InformacionAlumnos Info = new InformacionAlumnos();
        Info.InformacionPersonal();
        Info.InformacionAcaemica();
        Info.Horarios();
        Calif.Materias(arramat);
        Calif.Promedio(par1, par2);
    }
}
