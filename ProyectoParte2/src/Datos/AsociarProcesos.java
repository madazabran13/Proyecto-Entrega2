
package Datos;

import Dominio.*;
import Excepciones.Excepciones_Datos;
import java.util.List;

public interface AsociarProcesos {
    void insertaProcesos(Proceso p) throws Excepciones_Datos;
    List<Proceso> leerProcesos() throws Excepciones_Datos;
    Proceso buscarnumRadicado(Proceso po) throws Excepciones_Datos;
    Proceso buscarDemandado(Parte_Procesal pp) throws Excepciones_Datos;
    Proceso buscarDemandante(Parte_Procesal pp) throws Excepciones_Datos; 
}
