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
public class PersistenciaCliente {
    public static void Savedata(ArrayList<Cliente> cl){
        try {
            FileOutputStream file = new FileOutputStream("clientes.cl");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(cl);
            stream.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
   
    }
    public static ArrayList<Cliente> LoadData(){
        ArrayList<Cliente> cl = null;
        try {
            FileInputStream file = new FileInputStream("clientes.cl");
            ObjectInputStream stream = new ObjectInputStream(file);
            cl = (ArrayList<Cliente>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            //e.printStackTrace();
            cl = null;
        }
        return (cl != null)? cl:new ArrayList<Cliente>();
    }
}
