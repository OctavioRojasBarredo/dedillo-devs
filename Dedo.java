public class Dedo
{
    private String tipoDeDedo;
    private int longitudDedo;
    private Una una;

    public Dedo()
    {
        tipoDeDedo = "Normal";
        longitudDedo = 5;
        una = new Una();
    }

    public String getTipoDeDedo(){
        return tipoDeDedo;
    }

    public int getLongitudDedo(){
        return longitudDedo;
    }

    public boolean getUna(){
        return una.getLijado();
    }

    public void setTipoDeDedo(String nuevoTipoDeDedo) {
        tipoDeDedo = nuevoTipoDeDedo;
    }

    public void setLongitudDeDedo(int nuevaLongitud) {
        longitudDedo = nuevaLongitud;
    }

    public void setLongitudDeUna(int nuevaLongitud) {
        una.setLongitudUna(nuevaLongitud);
    }

    public void imprimirDetalles(){
        System.out.println("Tipo de dedo" + tipoDeDedo + "Longitud de dedo: " + longitudDedo + "¿Tiene uña? " + una);
    }

}

