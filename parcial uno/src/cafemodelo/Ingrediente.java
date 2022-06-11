package cafemodelo;
public class Ingrediente {
    private Unidad unidad;
    private Float cantidad;
    private Insumo insumo;
    


    public Ingrediente(){

    }



    public Unidad getUnidad() {
        return unidad;
    }



    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }



    public Float getCantidad() {
        return cantidad;
    }



    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }



    public Insumo getInsumo() {
        return insumo;
    }



    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    
    public boolean equals(Object o){
        try {
            Ingrediente ingre = (Ingrediente) o;
            Insumo insu = ingre.getInsumo();
            return this.insumo.equals(insu);
        } catch (ClassCastException e) {
            return false;
        }
    }

    


    
}
