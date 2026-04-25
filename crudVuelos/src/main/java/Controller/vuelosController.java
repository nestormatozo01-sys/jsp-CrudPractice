package Controller;

import Models.vuelosModel;
import Services.vueloServicesImpl;
import Services.vuelosServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/Vuelos")
public class vuelosController extends HttpServlet
{


    vuelosServices vueloServices = new vueloServicesImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<vuelosModel> vuelosData = vueloServices.listarVuelos();
    request.setAttribute("vuelosData", vuelosData);
    request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
        String numeroVuelo = request.getParameter("numeroVuelo");
        vueloServices.eliminarVuelo(numeroVuelo);
        response.sendRedirect(request.getContextPath() + "/Vuelos");
        return;
        }
        if ("edit".equals(action)) {
          String numeroVuelo = request.getParameter("numeroVuelo");
          vuelosModel vuelo = vueloServices.buscarVuelo(numeroVuelo);
          request.setAttribute("vuelo", vuelo);
          request.getRequestDispatcher("/WEB-INF/Views/edit.jsp").forward(request, response);
          return;
        }
        if ("update".equals(action)) {
    vuelosModel vueloActualizado = new vuelosModel();
    vueloActualizado.setNumeroVuelo(request.getParameter("numeroVuelo"));
    vueloActualizado.setAerolinea(request.getParameter("aerol"));
    vueloActualizado.setOrigen(request.getParameter("origen"));
    vueloActualizado.setDestino(request.getParameter("destino"));
    vueloActualizado.setFechaSalida(request.getParameter("fechaS"));
    vueloActualizado.setHoraSalida(request.getParameter("horaS"));
    vueloActualizado.setFechaEntrada(request.getParameter("fechaLL"));
    vueloActualizado.setHoraEntrada(request.getParameter("horaLL"));
    vueloActualizado.setDuracionVuelo(request.getParameter("duracion"));

    vueloServices.actualizarVuelo(vueloActualizado);
    response.sendRedirect(request.getContextPath() + "/Vuelos");
    return;
}
        String numeroVuelos = request.getParameter("numeroVuelo");
        String Aerolinea = request.getParameter("aerol");
        String Origen = request.getParameter("origen");
        String Destino = request.getParameter("destino");
        String fechaSalida  = request.getParameter("fechaS");
        String horaSalida = request.getParameter("horaS");
        String fechaLlegada  = request.getParameter("fechaLL");
        String horaLlegada = request.getParameter("horaLL");
        String duracionVuelo = request.getParameter("duracion");

        vuelosModel vuelos = new vuelosModel();
        vuelos.setNumeroVuelo(numeroVuelos);
        vuelos.setAerolinea(Aerolinea);
        vuelos.setOrigen(Origen);
        vuelos.setDestino(Destino);
        vuelos.setFechaSalida(fechaSalida);
        vuelos.setHoraSalida(horaSalida);
        vuelos.setFechaEntrada(fechaLlegada);
        vuelos.setHoraEntrada(horaLlegada);
        vuelos.setDuracionVuelo(duracionVuelo);
        try{
            vueloServices.agregarVuelos(vuelos);
            
            System.out.println("=== Lista de vuelos acumulados ===");
            for (vuelosModel v : vueloServices.listarVuelos()) {
            System.out.println(v);
             }
            request.setAttribute("vuelosData", vueloServices.listarVuelos());
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }catch (Exception e){
            request.setAttribute("error", e.getMessage());
            doGet(request, response);
        }


    }
}
