package model.Album;

public class AlbumVo 
{
    private int IdAlbum;
    private String NombreAlbum;
    private String PublicacionAlbum;
    private boolean EstadoAlbum;

    public AlbumVo(){}

    public AlbumVo(int IdAlbum,String NombreAlbum,String PublicacionAlbum,boolean EstadoAlbum)
    {
        this.IdAlbum=IdAlbum;
        this.NombreAlbum=NombreAlbum;
        this.PublicacionAlbum=PublicacionAlbum;
        this.EstadoAlbum=EstadoAlbum;
    }

    public int getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.IdAlbum = idAlbum;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.NombreAlbum = nombreAlbum;
    }

    public String getPublicacionAlbum() {
        return PublicacionAlbum;
    }

    public void setPublicacionAlbum(String PublicacionAlbum) {
        this.PublicacionAlbum = PublicacionAlbum;
    }

    public boolean getEstadoAlbum() {
        return EstadoAlbum;
    }

    public void setEstadoAlbum(boolean estadoAlbum) {
        this.EstadoAlbum = estadoAlbum;
    }
    
}
