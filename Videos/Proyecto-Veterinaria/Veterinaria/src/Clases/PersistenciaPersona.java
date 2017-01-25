/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author reydi
 */
public class PersistenciaPersona {
    public static void Savedata(ArrayList<Persona> per){
        try {
            FileOutputStream file = new FileOutputStream("persona.per");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(per);
            stream.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
   
    }
    public static ArrayList<Persona> LoadData(){
        ArrayList<Persona> per = null;
        try {
            FileInputStream file = new FileInputStream("persona.per");
            ObjectInputStream stream = new ObjectInputStream(file);
            per = (ArrayList<Persona>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            //e.printStackTrace();
            per = null;
        }
        return (per != null)? per:new ArrayList<Persona>();
    }
}
