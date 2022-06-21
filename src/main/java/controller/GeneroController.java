package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genero.GeneroDao;
import model.Genero.GeneroVo;

public class GeneroController extends HttpServlet 
{
    GeneroVo Vo=new GeneroVo();//R//
    GeneroDao Da=new GeneroDao();//RD//

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
            GeneroList(req,resp);
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
            req.getRequestDispatcher("views/Genero/addgenero.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
        catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }

//-------------------listar---------------------// 
    private void GeneroList(HttpServletRequest req, HttpServletResponse resp) 
    {
        try 
        {
            List generoL = Da.GeneroList();
            req.setAttribute ("GeneroList", generoL);
            req.getRequestDispatcher ("views/Genero/listgenero.jsp").forward(req, resp);
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

        if (req.getParameter("nombreGenero") != null) {
            Vo.setNombreGenero(req.getParameter("nombreGenero"));
        }
        if (req.getParameter("estadoGenero") != null) 
        {
            Vo.setEstadoGenero(true);
        }
        else
        {
            Vo.setEstadoGenero(false);
        }
        try 
        {
            Da.registrar(Vo);
            System.out.println("Registro ingresado correctamente");
            GeneroList(req, resp);
        } 
        catch (Exception e) 
        {
            System.out.println("Error al ingresar el registro "+e.getMessage().toString());
        }
    }

//-------------------Estado---------------------//
    private void estado(HttpServletRequest req, HttpServletResponse resp)
    {
        if(req.getParameter("idGenero")!=null)
        {
            Vo.setIdGenero(Integer.parseInt(req.getParameter("idGenero")));
        }
        if(req.getParameter("estado")!=null)
        {
            Vo.setEstadoGenero(Boolean.parseBoolean(req.getParameter("estado")));
        }
        try
        {
            Da.estado((Boolean) Vo.getEstadoGenero(), Vo.getIdGenero());
            GeneroList(req, resp);
            
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
        if(req.getParameter("idGenero")!=null)
        {
            Vo.setIdGenero(Integer.parseInt(req.getParameter("idGenero")));
        }
        try 
        {
            Da.Eliminar(Vo.getIdGenero());
            System.out.println("El estado se elimino correctamente");
            GeneroList(req, resp);
        } 
        catch (Exception e) 
        {
            System.out.println("Error al realizar el cambio de estado "+e.getMessage().toString());
        }
    }
//-------------------Edit---------------------//
    private void Edit(HttpServletRequest req, HttpServletResponse resp) 
    {
        System.out.println("entro al metodo editar");
        if(req.getParameter("idGenero")!=null)
        {
            Vo.setIdGenero(Integer.parseInt(req.getParameter("idGenero")));
        }
        try 
        {
            List <GeneroVo> GeneroEdit = Da.listar(Vo.getIdGenero());
            req.setAttribute("generoList", GeneroEdit);
            req.getRequestDispatcher ("views/Genero/editgenero.jsp").forward(req, resp);
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
        System.out.println("entro al metodo edit");
        if(req.getParameter("idGenero")!=null)
        {
            Vo.setIdGenero(Integer.parseInt(req.getParameter("idGenero")));
        }
        if(req.getParameter("nombreGenero")!=null)
        {
            Vo.setNombreGenero(req.getParameter("nombreGenero"));
        }
        if(req.getParameter("estadoGenero")!=null)
        {
            Vo.setEstadoGenero(true);
        }   
        else
        {
            Vo.setEstadoGenero(false);
        }
        try
        {
            Da.Actualizar(Vo);
            System.out.println("Editar el registro de genero");
            GeneroList(req, resp);  
        }
        catch (Exception e)
        {
        System.out.println("Error al realizar la edicion del registro de genero"+e.getMessage().toString());
        }
    }
}   




