package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Disquera.DisqueraDao;
import model.Disquera.DisqueraVo;

public class DisqueraController extends HttpServlet 
{
    DisqueraVo Vo=new DisqueraVo();//R//
    DisqueraDao Da=new DisqueraDao();//RD//

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
            DisqueraList(req,resp);
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
            req.getRequestDispatcher("views/Disquera/adddisquera.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
        catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }

//-------------------listar---------------------// 
    private void DisqueraList(HttpServletRequest req, HttpServletResponse resp) 
    {
        try 
        {
            List DisqueraL = Da.DisqueraList();
            req.setAttribute ("DisqueraList", DisqueraL);
            req.getRequestDispatcher ("views/Disquera/listdisquera.jsp").forward(req, resp);
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
        if (req.getParameter("nitDisquera") != null) {
            Vo.setNitDisquera(req.getParameter("nitDisquera"));
        }
        if (req.getParameter("nombreDisquera") != null) {
            Vo.setNombreDisquera(req.getParameter("nombreDisquera"));
        }
        if (req.getParameter("telefonoDisquera") != null) {
           Vo.setTelefonoDisquera(req.getParameter("telefonoDisquera"));
        }
        if (req.getParameter("direccionDisquera") != null) {
            Vo.setDireccionDisquera(req.getParameter("direccionDisquera"));
        }
        if (req.getParameter("estadoDisquera") != null) 
        {
            Vo.setEstadoDisquera(true);
        }
        else
        {
            Vo.setEstadoDisquera(false);
        }
        try 
        {
            Da.registrar(Vo);
            System.out.println("Registro ingresado correctamente");
            DisqueraList(req, resp);
        } 
        catch (Exception e) 
        {
            System.out.println("Error al ingresar el registro "+e.getMessage().toString());
        }
    }

//-------------------Estado---------------------//
    private void estado(HttpServletRequest req, HttpServletResponse resp)
    {
        if(req.getParameter("idDisquera")!=null)
        {
            Vo.setIdDisquera(Integer.parseInt(req.getParameter("idDisquera")));
        }
        if(req.getParameter("estado")!=null)
        {
            Vo.setEstadoDisquera(Boolean.parseBoolean(req.getParameter("estado")));
        }
        try
        {
            Da.estado((Boolean) Vo.getEstadoDisquera(), Vo.getIdDisquera());
            DisqueraList(req, resp);
            
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
        if(req.getParameter("idDisquera")!=null)
        {
            Vo.setIdDisquera(Integer.parseInt(req.getParameter("idDisquera")));
        }
        try 
        {
            Da.Eliminar(Vo.getIdDisquera());
            System.out.println("El estado se elimino correctamente");
            DisqueraList(req, resp);
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
        if(req.getParameter("idDisquera")!=null)
        {
            Vo.setIdDisquera(Integer.parseInt(req.getParameter("idDisquera")));
        }
        try 
        {
            List <DisqueraVo> DisqueraEdit = Da.listar(Vo.getIdDisquera());
            req.setAttribute("disqueraList", DisqueraEdit);
            req.getRequestDispatcher ("views/Disquera/editdisquera.jsp").forward(req, resp);
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

        if(req.getParameter("idDisquera")!=null)
        {
            Vo.setIdDisquera(Integer.parseInt(req.getParameter("idDisquera")));
        }
        if(req.getParameter("nitDisquera")!=null)
        {
            Vo.setNitDisquera(req.getParameter("nitDisquera"));
        }
        if(req.getParameter("nombreDisquera")!=null)
        {
            Vo.setNombreDisquera(req.getParameter("nombreDisquera"));
        }
        if(req.getParameter("telefonoDisquera")!=null)
        {
            Vo.setTelefonoDisquera(req.getParameter("telefonoDisquera"));
        }
        if(req.getParameter("direccionDisquera")!=null)
        {
            Vo.setDireccionDisquera(req.getParameter("direccionDisquera"));
        }
        if(req.getParameter("estadoDisquera")!=null)
        {
            Vo.setEstadoDisquera(true);
        }   
        else
        {
            Vo.setEstadoDisquera(false);
        }
        try
        {
            Da.Actualizar(Vo);
            System.out.println("Editar el registro de Disquera");
            DisqueraList(req, resp);  
        }
        catch (Exception e)
        {
        System.out.println("Error al realizar la edicion del registro de Disquera"+e.getMessage().toString());
        }
    }
}   