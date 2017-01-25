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
public class PersistenciaMascota {
    public static void Savedata(ArrayList<Mascotas> mas){
        try {
            FileOutputStream file = new FileOutputStream("mascota.ma");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(mas);
            stream.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
   
    }
    public static ArrayList<Mascotas> LoadData(){
        ArrayList<Mascotas> mas = null;
        try {
            FileInputStream file = new FileInputStream("mascota.ma");
            ObjectInputStream stream = new ObjectInputStream(file);
            mas = (ArrayList<Mascotas>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            //e.printStackTrace();
            mas = null;
        }
        return (mas != null)? mas:new ArrayList<Mascotas>();
    }
}
