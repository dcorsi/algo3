package algo3;

import java.io.*;
import java.util.Collection;

public class BackEnd {

    public Collection<CarreraDTO> obtenerCarreras() throws FileNotFoundException, IOException {
        CarrerasDAO cDAO = new CarrerasDAO();
        return cDAO.cargarCarreras();
    }

    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) throws FileNotFoundException, IOException {
        AlumnosDAO aDAO = new AlumnosDAO();
        return aDAO.cargarAlumnos(codCarrera);
    }
}
