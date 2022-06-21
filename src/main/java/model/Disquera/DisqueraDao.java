
package model.Disquera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class DisqueraDao 
{
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int Disque; //cantidad de filas que devuelve

//-------------------REGISTRAR---------------------//
    public int registrar(DisqueraVo vo) throws SQLException
    {
        sql="INSERT INTO disquera (nitDisquera, nombreDisquera, telefonoDisquera, direccionDisquera, estadoDisquera) values(?,?,?,?,?)";
        
        try
        {
            con=Conexion.conectar(); //Iniciar conexión
            ps=con.prepareStatement(sql); //sentencia

            ps.setString(1, vo.getNitDisquera());
            ps.setString(2, vo.getNombreDisquera());
            ps.setString(3, vo.getTelefonoDisquera());
            ps.setString(4, vo.getDireccionDisquera());
            ps.setBoolean(5, vo.getEstadoDisquera());
            System.out.println(ps);

            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //Fin sentencia
            System.out.println("Se registró el Disquera correctamente");

        }
        catch(Exception e)
        {
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally
        {
            con.close();//Fin conexión
        }
        return Disque;
    }

//-----------------DisqueraLIST-------------------//
    public List<DisqueraVo> DisqueraList() throws SQLException
    {
        List<DisqueraVo> disquera =new ArrayList<>();
        sql = "SELECT * FROM disquera ";

        try 
        {
            con=Conexion.conectar();
            System.out.println(ps);
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                DisqueraVo Disque=new DisqueraVo();

                Disque.setIdDisquera(rs.getInt("IdDisquera"));
                Disque.setNitDisquera(rs.getString("NitDisquera"));
                Disque.setNombreDisquera(rs.getString("NombreDisquera"));
                Disque.setTelefonoDisquera(rs.getString("TelefonoDisquera"));
                Disque.setDireccionDisquera(rs.getString("DireccionDisquera"));
                Disque.setEstadoDisquera(rs.getBoolean("EstadoDisquera"));

                disquera.add(Disque);
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
        return disquera;
    }

//--------------------LISTAR---------------------//
    public List <DisqueraVo> listar(int idDisquera) throws SQLException 
    {
        List<DisqueraVo> disquera=new ArrayList<>();
        sql="SELECT *FROM disquera WHERE idDisquera="+idDisquera;//variable para la BD
        try 
        {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);

            while(rs.next())
            {
                DisqueraVo Dis=new DisqueraVo();

                //Escribir  en el setter cada valor
                Dis.setIdDisquera(rs.getInt("idDisquera"));
                Dis.setNitDisquera(rs.getString("nitDisquera"));
                Dis.setNombreDisquera(rs.getString("nombreDisquera"));
                Dis.setTelefonoDisquera(rs.getString("telefonoDisquera"));
                Dis.setDireccionDisquera(rs.getString("direccionDisquera"));
                Dis.setEstadoDisquera(rs.getBoolean("estadoDisquera"));
                disquera.add(Dis);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } 
        catch (Exception e) 
        {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
        }
        finally
        {
            con.close();
        }

        return disquera;//retorna array con los datos de la tabla
    }

//-------------------ESTADO---------------------//
    public void estado(Boolean estado,int idDisquera) throws SQLException
    {
        sql = "UPDATE disquera SET estadoDisquera="+estado+" WHERE idDisquera="+idDisquera;
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
    public int Actualizar(DisqueraVo Disquera)throws SQLException
    {
        sql="UPDATE disquera SET nitDisquera=?, nombreDisquera=?, telefonoDisquera=?, direccionDisquera=?, estadoDisquera=? WHERE idDisquera=?";
        try
        {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);

            System.out.println(ps);

            ps.setString(1,Disquera.getNitDisquera());
            ps.setString(2,Disquera.getNombreDisquera());
            ps.setString(3,Disquera.getTelefonoDisquera());
            ps.setString(4,Disquera.getDireccionDisquera());
            ps.setBoolean(5,Disquera.getEstadoDisquera());
            ps.setInt(6,Disquera.getIdDisquera());

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Se edito correctamente el disquera");
        }
        catch(Exception e)
        {
            System.out.println("Error al editar "+e.getMessage().toString());
        }
        finally
        {
            con.close();
        }
        return Disque;
    }

//-------------------ELIMINAR---------------------//
    public void Eliminar(int idDisquera) throws SQLException 
    {
    sql="DELETE FROM disquera WHERE idDisquera="+idDisquera;//variable para el sql
    
    try
    {
        con=Conexion.conectar(); //iniciar conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Se elimino correctamente el duera");  
    }
    catch(Exception e)
    {
        System.out.println("Error al realizar la eliminacion del disquera "+e.getMessage().toString());
    }
    finally
    {
        con.close();//cerrando conexión
    }
    }

}

   

   