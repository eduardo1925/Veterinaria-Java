package Clases;

import java.io.Serializable;

/**
 *
 * @author  ROLANDO_GUADALUPE
 */
public class Cliente implements Serializable{
    private String nombreCliente;
    private String genero;
    private int codigo;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}    