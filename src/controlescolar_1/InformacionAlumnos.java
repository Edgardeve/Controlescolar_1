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
public class InformacionAlumnos 
{ 
   //Variables__________________________________________________________________
   static String nombrecom;     //Nombre Completo
   static String date;          //Fecha de nacimiento 
   static int mes,año,dia;      //Variables para fecha de nacimiento 
   static int tel;              //Telefono
   static String address;        //Direccion
   static int noc;              //Numero de cuenta
   static int semes;            //Semetre
   static String[] arramat = {"Calculo","Circuitos","Programacion","Teoria de sistemas"
          ,"Teoria de algoritmos","Inles V"};      //Arreglo de materia
   static int hora,horamin;                    //Variables para hora 
   static String[] horari = new String[6];          //Arreglo para horario
   static String[] arradia = new String[6];        //Arreglo de dia
   //___________________________________________________________________________
   //Metodos
   public void InformacionPersonal()
   {
       nombrecom = JOptionPane.showInputDialog("Nombre completo: ");
       System.out.print("Fecha de nacimiento (En numero)"+'\t'+'\t'+"***");
       dia = Integer.parseInt(JOptionPane.showInputDialog("Fecha de nacimiento"
               + " (En numero)"+'\t'+'\t'+"***"+'\n'+"Dia: "));
       mes = Integer.parseInt(JOptionPane.showInputDialog('\n'+"mes: "));
       año = Integer.parseInt(JOptionPane.showInputDialog('\n'+"anno: "));
       date = (dia+"/"+mes+"/"+año);
       address = JOptionPane.showInputDialog('\n'+"Direccion: ");
       tel = Integer.parseInt(JOptionPane.showInputDialog('\n'+"Numero de telefono: "));
   }
   
   public void InformacionAcaemica()
   {
       noc = Integer.parseInt(JOptionPane.showInputDialog('\n'+"No. Cuenta UAEMEX: "));
       semes = Integer.parseInt(JOptionPane.showInputDialog('\n'+"Semestre en curso: "));
       
   }
   
   public void Horarios()
   {
       for (int i = 0;i < 6;i++)
       {      
           arradia[i] = JOptionPane.showInputDialog("Horarios"+'\t'+'\t'+'\t'+"***"+
                   '\n'+"Materia "+arramat[i]+'\n'+"Dia :");
           hora = Integer.parseInt(JOptionPane.showInputDialog("Hora de inicio "+'\t'));
           System.out.print("Minuto de inicio"+'\t');
           horamin = Integer.parseInt(JOptionPane.showInputDialog("Minuto de inicio"+'\t'));
           hora = Integer.parseInt(JOptionPane.showInputDialog('\n'+"Hora de finalizacion "+'\t'));
           horamin = Integer.parseInt(JOptionPane.showInputDialog("Minuto de finalizacion"));
           horari[i] = horari[i]+("a"+'\t'+hora+":"+horamin);
       }
   }
}
