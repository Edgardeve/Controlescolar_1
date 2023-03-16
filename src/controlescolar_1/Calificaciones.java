/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlescolar_1;
import javax.swing.JOptionPane;
/**
 *
 * @author edgar
 */
public class Calificaciones 
{
    
    static int[] par1,par2,prom = new int[6];
    static int promgen = 0;
    
    public void Materias(String[] mat)
    {
        for (int i = 0;i < 6;i++)
        {
            par1[i] = Integer.parseInt(JOptionPane.showInputDialog('\n'+"calificacion de la materia "+mat[i]
                             +"1°P: "));
            par2[i] = Integer.parseInt(JOptionPane.showInputDialog('\n'+"calificacion de la materia "+mat[i]
                             +"1°P: "));
        }
    }
    
    public void Promedio(int[] par1,int[] par2)
    {
        for (int i = 0;i < 6;i++)
        {
            prom[i] = (par1[i]+par2[i])/2;
            promgen = promgen + prom[i];
        }
        promgen = promgen/6;
        JOptionPane.showMessageDialog(null,"Promedio General________"+promgen);
    }
    
}
