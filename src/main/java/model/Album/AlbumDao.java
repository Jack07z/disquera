package model.Album;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class AlbumDao 
{
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int Albu; //cantidad de filas que devuelve

//-------------------REGISTRAR---------------------//
    public int registrar(AlbumVo vo) throws SQLException
    {
        sql = "INSERT INTO album (nombreAlbum, publicacionAlbum, estadoAlbum) values (?,?,?)" ;

        try
        {
            con=Conexion.conectar(); //Iniciar conexión
            ps=con.prepareStatement(sql); //sentencia

            ps.setString(1, vo.getNombreAlbum());
            ps.setString(2, vo.getPublicacionAlbum());
            ps.setBoolean(3, vo.getEstadoAlbum());
            System.out.println(ps);

            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //Fin sentencia
            System.out.println("Se registró el Album correctamente");

        }
        catch(Exception e)
        {
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally
        {
            con.close();//Fin conexión
        }
        return Albu;
    }

//-----------------ALBUMLIST-------------------//
    public List<AlbumVo> AlbumList() throws SQLException
    {
        List<AlbumVo> Album =new ArrayList<>();
        sql = "SELECT * FROM album";

        try 
        {
            con=Conexion.conectar();
            System.out.println(ps);
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                AlbumVo Albu=new AlbumVo();

                Albu.setIdAlbum(rs.getInt("IdAlbum"));
                Albu.setNombreAlbum(rs.getString("NombreAlbum"));
                Albu.setPublicacionAlbum(rs.getString("PublicacionAlbum"));
                Albu.setEstadoAlbum(rs.getBoolean("EstadoAlbum"));
                Album.add(Albu);
            }
            ps.close();
            System.out.println("se realizo la consulta exitosamente");
        } 
        catch (Exception e) 
        {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally
        {
            con.close();
        }
        return Album;
    }

//--------------------LISTAR---------------------//
    public List <AlbumVo> listar(int idAlbum) throws SQLException 
    {
        List<AlbumVo> Album=new ArrayList<>();
        sql="SELECT *FROM album WHERE idalbum="+idAlbum;//variable para la BD
        try 
        {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                AlbumVo Albu=new AlbumVo();

                //Escribir  en el setter con peticion de atributos
                Albu.setIdAlbum(rs.getInt("idAlbum"));
                Albu.setNombreAlbum(rs.getString("nombreAlbum"));
                Albu.setPublicacionAlbum(rs.getString("publicacionAlbum"));
                Albu.setEstadoAlbum(rs.getBoolean("estadoAlbum"));
                Album.add(Albu);
            }
            ps.close();
            System.out.println("consulta exitosa ");
        } 
        catch (Exception e) 
        {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
        }
        finally
        {
            con.close();
        }

        return Album;//retorna array con los datos de la tabla
    }

//-------------------ESTADO---------------------//
    public void estado(Boolean estado,int idAlbum) throws SQLException
    {
        sql = "UPDATE album SET estadoAlbum="+estado+" WHERE idAlbum="+idAlbum;
        try
        {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Se modifico el estado a"+estado+"correctamente");

        }
        catch(Exception e)
        {
            System.out.println("Error al realizar el cambio de estado"+e.getMessage().toString());
        }
        finally
        {
            con.close();
        }
    } 

//-------------------ACTUALIZAR---------------------//
    public int Actualizar(AlbumVo Album)throws SQLException
    {
        sql="UPDATE album SET nombreAlbum=?, publicacionAlbum=?, estadoAlbum=? WHERE idAlbum=?";
        try
        {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            System.out.println(ps);

            ps.setString(1,Album.getNombreAlbum());
            ps.setString(2,Album.getPublicacionAlbum());
            ps.setBoolean(3,Album.getEstadoAlbum());
            ps.setInt(4, Album.getIdAlbum());

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Se edito correctamente el Album");
        }
        catch(Exception e)
        {
            System.out.println("Error al editar "+e.getMessage().toString());
        }
        finally
        {
            con.close();
        }
        return Albu;
    }

//-------------------ELIMINAR---------------------//
    public void Eliminar(int idAlbum) throws SQLException 
    {
    sql="DELETE FROM album WHERE idAlbum="+idAlbum;//variable para el sql
    
    try
    {
        con=Conexion.conectar(); //iniciar conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Se elimino correctamente el Album");  
    }
    catch(Exception e)
    {
        System.out.println("Error al realizar la eliminacion del Album "+e.getMessage().toString());
    }
    finally
    {
        con.close();//cerrando conexión
    }
    }
}
