package classes;

public class EstadoLampada {

    private boolean estadoLampada;

    public void acende() {
        estadoLampada = true;
    }

    public void apaga() {
        estadoLampada = false;
    }

    public boolean getEstadoLampada() {
        return estadoLampada;
    }


}
