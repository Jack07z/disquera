package model.Cancion;

public class CancionVo 
{
    private int IdCancion;
    private String NombreCancion;
    private int FechaGrabacion;
    private int DuracionCancion;
    private boolean EstadoCancion;

    public CancionVo(){}

    public CancionVo(int IdCancion,String NombreCancion,int FechaGrabacion, int DuracionCancion, boolean EstadoCancion)
    {
        this.IdCancion=IdCancion;
        this.NombreCancion=NombreCancion;
        this.FechaGrabacion=FechaGrabacion;
        this.DuracionCancion=DuracionCancion;
        this.EstadoCancion=EstadoCancion;
    }

    public int getIdCancion() {
        return IdCancion;
    }

    public void setIdCancion(int idCancion) {
        this.IdCancion = idCancion;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.NombreCancion = nombreCancion;
    }

    public int getFechaGrabacion() {
        return FechaGrabacion;
    }

    public void setFechaGrabacion(int fechaGrabacion) {
        this.FechaGrabacion = fechaGrabacion;
    }

    public int getDuracionCancion() {
        return DuracionCancion;
    }

    public void setDuracionCancion(int duracionCancion) {
        this.DuracionCancion = duracionCancion;
    }

    public boolean isEstadoCancion() {
        return EstadoCancion;
    }

    public void setEstadoCancion(boolean estadoCancion) {
        this.EstadoCancion = estadoCancion;
    } 
       
}
