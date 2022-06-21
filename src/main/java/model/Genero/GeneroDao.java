package model.Genero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class GeneroDao 
{
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int Gene; //cantidad de filas que devuelve

//-------------------REGISTRAR---------------------//
    public int registrar(GeneroVo vo) throws SQLException
    {
        sql = "INSERT INTO genero (nombreGenero, estadoGenero) values (?,?)" ;

        try
        {
            con=Conexion.conectar(); //Iniciar conexión
            ps=con.prepareStatement(sql); //sentencia

            ps.setString(1, vo.getNombreGenero());
            ps.setBoolean(2, vo.getEstadoGenero());
            System.out.println(ps);

            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //Fin sentencia
            System.out.println("Se registró el Genero correctamente");

        }
        catch(Exception e)
        {
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally
        {
            con.close();//Fin conexión
        }
        return Gene;
    }

//-----------------GENEROLIST-------------------//
    public List<GeneroVo> GeneroList() throws SQLException
    {
        List<GeneroVo> genero =new ArrayList<>();
        sql = "SELECT * FROM genero";

        try 
        {
            con=Conexion.conectar();
            System.out.println(ps);
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                GeneroVo Gene=new GeneroVo();

                Gene.setIdGenero(rs.getInt("IdGenero"));
                Gene.setNombreGenero(rs.getString("NombreGenero"));
                Gene.setEstadoGenero(rs.getBoolean("EstadoGenero"));
                genero.add(Gene);
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
        return genero;
    }

//--------------------LISTAR---------------------//
    public List <GeneroVo> listar(int idGenero) throws SQLException 
    {
        List<GeneroVo> genero=new ArrayList<>();
        sql="SELECT *FROM genero WHERE idGenero="+idGenero;//variable para la BD
        try 
        {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                GeneroVo Genero=new GeneroVo();

                //Escribir  en el setter con peticion de atributos
                Genero.setIdGenero(rs.getInt("idGenero"));
                Genero.setNombreGenero(rs.getString("nombreGenero"));
                Genero.setEstadoGenero(rs.getBoolean("estadoGenero"));
                genero.add(Genero);
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

        return genero;//retorna array con los datos de la tabla
    }

//-------------------ESTADO---------------------//
    public void estado(Boolean estado,int idGenero) throws SQLException
    {
        sql = "UPDATE genero SET estadoGenero="+estado+" WHERE idGenero="+idGenero;
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
    public int Actualizar(GeneroVo Genero)throws SQLException
    {
        sql="UPDATE genero SET nombreGenero=?, estadoGenero=? WHERE idGenero=?";
        try
        {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            System.out.println(ps);

            ps.setString(1,Genero.getNombreGenero());
            ps.setBoolean(2,Genero.getEstadoGenero());
            ps.setInt(3, Genero.getIdGenero());

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Se edito correctamente el genero");
        }
        catch(Exception e)
        {
            System.out.println("Error al editar "+e.getMessage().toString());
        }
        finally
        {
            con.close();
        }
        return Gene;
    }

//-------------------ELIMINAR---------------------//
    public void Eliminar(int idGenero) throws SQLException 
    {
    sql="DELETE FROM genero WHERE idGenero="+idGenero;//variable para el sql
    
    try
    {
        con=Conexion.conectar(); //iniciar conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Se elimino correctamente el genero");  
    }
    catch(Exception e)
    {
        System.out.println("Error al realizar la eliminacion del genero "+e.getMessage().toString());
    }
    finally
    {
        con.close();//cerrando conexión
    }
    }

}

   
