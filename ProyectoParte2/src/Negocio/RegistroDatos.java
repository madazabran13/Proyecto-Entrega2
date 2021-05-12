
package Negocio;

import Datos.*;
import Dominio.*;
import Excepciones.Excepciones_Datos;
import java.util.List;

public class RegistroDatos {
    private ListAccesoDatos datos;

    public RegistroDatos() {
        this.datos = new ListAccesoDatos();
    }

    public void addExpedientes(Proceso p) throws Excepciones_Datos {
       this.datos.insertaProcesos(p);
    }

    public List<Proceso> leerExpedientes() throws Excepciones_Datos {
        return this.datos.leerProcesos();
    }

    public Proceso buscarnumRadicado(Proceso po) throws Excepciones_Datos {
        return this.datos.buscarnumRadicado(po);
    }

    public Proceso buscarDemandado(Parte_Procesal pp) throws Excepciones_Datos {
        return this.datos.buscarDemandado(pp);
    }

    public Proceso buscarDemandante(Parte_Procesal pp) throws Excepciones_Datos {
        return this.datos.buscarDemandante(pp);
    }

}
