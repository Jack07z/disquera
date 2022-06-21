package model.Genero;

public class GeneroVo 
{
    private int IdGenero;
    private String NombreGenero;
    private boolean EstadoGenero;

    public GeneroVo(){}

    public GeneroVo(int IdGenero,String NombreGenero,Boolean EstadoGenero)
    {
        this.NombreGenero=NombreGenero;
        this.EstadoGenero=EstadoGenero;
        this.IdGenero=IdGenero;
    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int idGenero) {
        this.IdGenero = idGenero;
    }

    public String getNombreGenero() {
        return NombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.NombreGenero = nombreGenero;
    }

    public boolean getEstadoGenero() {
        return EstadoGenero;
    }

    public void setEstadoGenero(boolean estadoGenero) {
        this.EstadoGenero = estadoGenero;
    }

    public Object isEstadoGenero() {
        return null;
    }
    
}
