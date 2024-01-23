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
    
}
