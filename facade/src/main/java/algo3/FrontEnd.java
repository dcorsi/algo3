package algo3;

import java.io.*;
import java.util.*;

public class FrontEnd {

    private BackEnd backEnd;

    public FrontEnd(BackEnd backEnd) {
        this.backEnd = backEnd;
    }

    public void arrancar() throws FileNotFoundException, IOException {
        Collection<CarreraDTO> carreras = backEnd.obtenerCarreras();
        for (CarreraDTO elem : carreras) {
            System.out.println(elem.getCodigo() + " - " + elem.getNombre());
        }
        System.out.println("Elija una carrera: ");
        int codCarrera = new Scanner(System.in).nextInt();
        Collection<AlumnoDTO> alumnos = backEnd.obtenerAlumnos(codCarrera);
        for (AlumnoDTO elem : alumnos) {
            System.out.println(elem.getLegajo() + " - " + elem.getApellido() + ", " + elem.getNombres());
        }
    }
}
