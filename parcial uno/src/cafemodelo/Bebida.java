package cafemodelo;

public class Bebida extends ProductoFabricado {
    private boolean caliente;

    public Bebida(){

    }


    public boolean isCaliente(){
        return caliente;
    }


    public void setCaliente(boolean caliente) {
        this.caliente = caliente;
    }


    
}
