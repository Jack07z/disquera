package model.Artista;

public class ArtistaVo 
{
    private int IdArtista;
    private int NoDocumento;
    private String TipoDocumento;
    private String ApellidoArtista;
    private String NombreArtistico;
    private int FechaNacimiento;
    private String EmailArtista;
    private boolean EstadoArtista;

    public ArtistaVo(){}

    public ArtistaVo(int IdArtista,int NoDocumento,String TipoDocumento,String ApellidoArtista,String NombreArtistico,int FechaNacimiento,String EmailArtista,boolean EstadoArtista)
    {
        this.IdArtista=IdArtista;
        this.NoDocumento=NoDocumento;
        this.TipoDocumento=TipoDocumento;
        this.ApellidoArtista=ApellidoArtista;
        this.NombreArtistico=NombreArtistico;
        this.FechaNacimiento=FechaNacimiento;
        this.EmailArtista=EmailArtista;
        this.EstadoArtista=EstadoArtista;
    }

    public int getIdArtista() {
        return IdArtista;
    }

    public void setIdArtista(int idArtista) {
        this.IdArtista = idArtista;
    }

    public int getNoDocumento() {
        return NoDocumento;
    }

    public void setNoDocumento(int noDocumento) {
        this. NoDocumento = noDocumento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.TipoDocumento = tipoDocumento;
    }

    public String getApellidoArtista() {
        return ApellidoArtista;
    }

    public void setApellidoArtista(String apellidoArtista) {
        this.ApellidoArtista = apellidoArtista;
    }

    public String getNombreArtistico() {
        return NombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.NombreArtistico = nombreArtistico;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }

    public String getEmailArtista() {
        return EmailArtista;
    }

    public void setEmailArtista(String emailArtista) {
        this.EmailArtista = emailArtista;
    }

    public boolean isEstadoArtista() {
        return EstadoArtista;
    }

    public void setEstadoArtista(boolean estadoArtista) {
        this.EstadoArtista = estadoArtista;
    }
    
}
