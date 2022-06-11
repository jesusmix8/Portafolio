package cafemodelo;

import java.util.Date;

public class ProductoFabricado extends Producto {

    private Receta receta;
    private Date  fechadeCreacion;
    private int vigencia;


    public ProductoFabricado(){

    }


    public Receta getReceta() {
        return receta;
    }


    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Date getFechadeCreacion() {
        return fechadeCreacion;
    }


    public void setFechadeCreacion(Date fechadeCreacion) {
        this.fechadeCreacion = fechadeCreacion;
    }


    public int getVigencia() {
        return vigencia;
    }


    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    


    
}
