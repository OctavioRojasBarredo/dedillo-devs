public class Una
{
    private boolean esLijada;
    
    private int longitudUna;
    
    public Una()
    {
        esLijada = false;
        longitudUna = 1;
    }
    
    public int getLongitudUna(){
        return longitudUna;
    }
    
    public boolean getLijado(){
        return esLijada;
    }
    public void setLongitudUna(int nuevaLongitudUna){
        longitudUna = nuevaLongitudUna;
    }
    
    public void setLijado(){
        esLijada = !esLijada;
    }
    
}
