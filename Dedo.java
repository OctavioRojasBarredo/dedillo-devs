public class Dedo
{
    private String tipoDeDedo;
    private int longitudDedo;
    private boolean una;

    public Dedo()
    {
        tipoDeDedo = "Normal";
        longitudDedo = 5;
        una = true;
    }

    public String getTipoDeDedo(){
        return tipoDeDedo;
    }

    public int getLongitudDedo(){
        return longitudDedo;
    }

    public boolean getUna(){
        return una;
    }

    public void setTipoDeDedo(String nuevoTipoDeDedo) {
        tipoDeDedo = nuevoTipoDeDedo;
    }
    
    public void setLongitudDeDedo(int nuevaLongitud) {
        longitudDedo = nuevaLongitud;
    }

    public void setTieneUna (boolean tieneUna) {
        una = tieneUna;
    }
    
    public void imprimirDetalles(){
        System.out.println("Tipo de dedo" + tipoDeDedo + "Longitud de dedo: " + longitudDedo + "¿Tiene uña? " + una);
    }

}

