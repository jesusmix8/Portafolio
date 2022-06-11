package cafemodelo;
import java.sql.Date;

public class Insumo extends Producto{
 private Date fechadecaducidad;
 private String tipo;

public Insumo(){

}

public Insumo(String n){
}


public Date getFechadecaducidad() {
    return fechadecaducidad;
}


public void setFechadecaducidad(Date fechadecaducidad) {
    this.fechadecaducidad = fechadecaducidad;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
 
public boolean equals(Object o){
    return false;
}
 
}
