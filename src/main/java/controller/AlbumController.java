package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Album.AlbumDao;
import model.Album.AlbumVo;

public class AlbumController extends HttpServlet 
{
    AlbumVo Vo=new AlbumVo();//R//
    AlbumDao Da=new AlbumDao();//RD//

//-------------------DoGet---------------------//
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    System.out.println("Entró al DoGet");
    String a=req.getParameter("accion");
    System.out.println(a);
        switch(a)
        {
            case "Ingresar":
                abrirForm(req,resp);
            break;

            case "estado":
                estado(req, resp);
            break;

            case "Listar":
            AlbumList(req,resp);
            break;

            case "eliminar":
                eliminar(req,resp);
            break;

            case "editar":
                Edit(req,resp);
            break;
        }
    }

//-------------------DoPost---------------------//
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    System.out.println("Entró al DoPost");
    String a=req.getParameter("accion");
    System.out.println(a);
        switch(a)
        {
            case "Add":
            Add(req,resp);
            break;

            case "Editar":
            Editar(req, resp);
            break;
        }
    }

//-------------------Ingresar---------------------//
       private void abrirForm(HttpServletRequest req, HttpServletResponse resp) 
       {
        try
        {
            req.getRequestDispatcher("views/Album/addalbum.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
        catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }

//-------------------listar---------------------// 
    private void AlbumList(HttpServletRequest req, HttpServletResponse resp) 
    {
        try 
        {
            List AlbumL = Da.AlbumList();
            req.setAttribute ("AlbumList", AlbumL);
            req.getRequestDispatcher ("views/Album/listalbum.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } 
        catch (Exception e) 
        {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

//-------------------add=Agregar---------------------//
    private void Add (HttpServletRequest req, HttpServletResponse resp) 
    {

        if (req.getParameter("nombreAlbum") != null) {
            Vo.setNombreAlbum(req.getParameter("nombreAlbum"));
        }
        if (req.getParameter("publicacionAlbum") != null) {
            Vo.setPublicacionAlbum(req.getParameter("publicacionAlbum"));
        }
        if (req.getParameter("estadoAlbum") != null) 
        {
            Vo.setEstadoAlbum(true);
        }
        else
        {
            Vo.setEstadoAlbum(false);
        }
        try 
        {
            Da.registrar(Vo);
            System.out.println("Registro ingresado correctamente");
            AlbumList(req, resp);
        } 
        catch (Exception e) 
        {
            System.out.println("Error al ingresar el registro "+e.getMessage().toString());
        }
    }

//-------------------Estado---------------------//
    private void estado(HttpServletRequest req, HttpServletResponse resp)
    {
        if(req.getParameter("idAlbum")!=null)
        {
            Vo.setIdAlbum(Integer.parseInt(req.getParameter("idAlbum")));
        }
        if(req.getParameter("estado")!=null)
        {
            Vo.setEstadoAlbum(Boolean.parseBoolean(req.getParameter("estado")));
        }
        try
        {
            Da.estado((Boolean) Vo.getEstadoAlbum(), Vo.getIdAlbum());
            AlbumList(req, resp);
            
            System.out.println("El estado se cambio correctamente");            
        }
        catch(Exception e)
        {
            System.out.println("Error en el cambio de estado"+e.getMessage().toString());
        }
    }

//-------------------Eliminar---------------------//
    private void eliminar(HttpServletRequest req, HttpServletResponse resp) 
    {
        if(req.getParameter("idAlbum")!=null)
        {
            Vo.setIdAlbum(Integer.parseInt(req.getParameter("idAlbum")));
        }
        try 
        {
            Da.Eliminar(Vo.getIdAlbum());
            System.out.println("El estado se elimino correctamente");
            AlbumList(req, resp);
        } 
        catch (Exception e) 
        {
            System.out.println("Error al realizar el cambio de estado "+e.getMessage().toString());
        }
    }
//-------------------Edit---------------------//
    private void Edit(HttpServletRequest req, HttpServletResponse resp) 
    {
        System.out.println("entro al metodo edit");
        if(req.getParameter("idAlbum")!=null)
        {
            Vo.setIdAlbum(Integer.parseInt(req.getParameter("idAlbum")));
        }
        try 
        {
            List <AlbumVo> AlbumEdit = Da.listar(Vo.getIdAlbum());
            req.setAttribute("albumList", AlbumEdit);
            req.getRequestDispatcher ("views/Album/editalbum.jsp").forward(req, resp);
            System.out.println("Datos capturados para la edicion");
        } 
        catch (Exception e) 
        {
            System.out.println("error al editar los datos "+e.getMessage().toString());
        }
    }

//-------------------Editar---------------------//
    private void Editar (HttpServletRequest req, HttpServletResponse resp) 
    {
        System.out.println("entro al metodo editar");

        if(req.getParameter("idAlbum")!=null)
        {
            Vo.setIdAlbum(Integer.parseInt(req.getParameter("idAlbum")));
        }
        if(req.getParameter("nombreAlbum")!=null)
        {
            Vo.setNombreAlbum(req.getParameter("nombreAlbum"));
        }
        if(req.getParameter("publicacionAlbum")!=null){
            Vo.setPublicacionAlbum(req.getParameter("publicacionAlbum"));
        }
        if(req.getParameter("estadoAlbum")!=null)
        {
            Vo.setEstadoAlbum(true);
        }   
        else
        {
            Vo.setEstadoAlbum(false);
        }
        try
        {
            Da.Actualizar(Vo);
            System.out.println("Editar el registro de Album");
            AlbumList(req, resp);  
        }
        catch (Exception e)
        {
        System.out.println("Error al realizar la edicion del registro de Album"+e.getMessage().toString());
        }
    }
}   