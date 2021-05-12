package Datos;

import Dominio.*;
import Excepciones.Excepciones_Datos;
import java.util.ArrayList;
import java.util.List;

public class ListAccesoDatos implements AsociarProcesos {

    private List<Proceso> procesos;

    public ListAccesoDatos() {
        this.procesos = new ArrayList<>();
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }

    @Override
    public void insertaProcesos(Proceso p) throws Excepciones_Datos {
        if (p == null) {
            throw new Excepciones_Datos("El proceso es de tipo null");
        }
        if (p.getMetadato_Expediente() == null) {
            throw new Excepciones_Datos("El metadato del expediente es de tipo null");
        }
        procesos.add(p);
    }

    @Override
    public List<Proceso> leerProcesos() throws Excepciones_Datos {
        return procesos;
    }

    @Override
    public Proceso buscarnumRadicado(Proceso po) throws Excepciones_Datos {
        for (Proceso buscar : procesos) {
            if (buscar.getMetadato_Expediente().getNumradicado() == po.getMetadato_Expediente().getNumradicado()) {
                return buscar;
            }
        }
        return null;
    }

    @Override
    public Proceso buscarDemandado(Parte_Procesal pp) throws Excepciones_Datos {
        for (Proceso buscar : procesos) {
            for (Parte_Procesal partebuscar : buscar.getMetadato_Expediente().getParteA()) {
                if (partebuscar.getNombrePersona().equals(pp.getNombrePersona())) {
                    return buscar;
                }
            }
        }
        return null;
    }

    @Override
    public Proceso buscarDemandante(Parte_Procesal pp) throws Excepciones_Datos {
        for (Proceso buscar : procesos) {
            for (Parte_Procesal partebuscar : buscar.getMetadato_Expediente().getParteB()) {
                if (partebuscar.getNombrePersona().equals(pp.getNombrePersona())) {
                    return buscar;
                }
            }
        }
        return null;
    }

}
