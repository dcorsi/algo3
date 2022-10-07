package algo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class CarrerasDAO {
    
    public Collection<CarreraDTO> cargarCarreras() throws FileNotFoundException, IOException {
        Collection<CarreraDTO> carreras = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/carreras.txt"));
        String renglon;
        while ((renglon = br.readLine()) != null) {
            CarreraDTO ca = new CarreraDTO();
            ca.setCodigo(Integer.parseInt(renglon));
            renglon = br.readLine();
            ca.setNombre(renglon);
            renglon = br.readLine();
            carreras.add(ca);
        }
        
        return carreras;
    }
}
