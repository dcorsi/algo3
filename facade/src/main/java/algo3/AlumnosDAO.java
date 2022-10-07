package algo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class AlumnosDAO {
    
    public Collection<AlumnoDTO> cargarAlumnos(int codCarrera) throws FileNotFoundException, IOException {
        Collection<AlumnoDTO> alumnos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/alumnos.txt"));
        String renglon;
        while ((renglon = br.readLine()) != null) {
            if (Integer.parseInt(renglon) == codCarrera) {
                AlumnoDTO alu = new AlumnoDTO();
                renglon = br.readLine();
                alu.setLegajo(Integer.parseInt(renglon));
                renglon = br.readLine();
                alu.setApellido(renglon);
                renglon = br.readLine();
                alu.setNombres(renglon);
                renglon = br.readLine();
                alumnos.add(alu);
            } else {
                renglon = br.readLine();
                renglon = br.readLine();
                renglon = br.readLine();
                renglon = br.readLine();
            }
        }
        return alumnos;
    }
}
