package model.Disquera;

public class DisqueraVo 
{
    private int IdDisquera;
    private String NitDisquera;
    private String NombreDisquera;
    private String TelefonoDisquera;
    private String DireccionDisquera;
    private boolean EstadoDisquera;

    public DisqueraVo(){}

    public DisqueraVo(int IdDisquera,String NitDisquera,String NombreDisquera,String TelefonoDisquera,String DireccionDisquera,boolean EstadoDisquera)
    {
        this.IdDisquera=IdDisquera;
        this.NitDisquera=NitDisquera;
        this.NombreDisquera=NombreDisquera;
        this.TelefonoDisquera=TelefonoDisquera;
        this.DireccionDisquera=DireccionDisquera;
        this.EstadoDisquera=EstadoDisquera;
    }

    public int getIdDisquera() {
        return IdDisquera;
    }

    public void setIdDisquera(int idDisquera) {
        this.IdDisquera = idDisquera;
    }

    public String getNitDisquera() {
        return NitDisquera;
    }

    public void setNitDisquera(String nitDisquera) {
        this.NitDisquera = nitDisquera;
    }

    public String getNombreDisquera() {
        return NombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.NombreDisquera = nombreDisquera;
    }

    public String getTelefonoDisquera() {
        return TelefonoDisquera;
    }

    public void setTelefonoDisquera(String telefonoDisquera) {
        this.TelefonoDisquera = telefonoDisquera;
    }

    public String getDireccionDisquera() {
        return DireccionDisquera;
    }

    public void setDireccionDisquera(String direccionDisquera) {
        this.DireccionDisquera = direccionDisquera;
    }

    public boolean getEstadoDisquera() {
        return EstadoDisquera;
    }

    public void setEstadoDisquera(boolean estadoDisquera) {
        this.EstadoDisquera = estadoDisquera;
    }
    
}
