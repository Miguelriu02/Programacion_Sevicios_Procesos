package EuroVision_MRG_Utils;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Pais
{
	private String nombre;
    private Map<String, Integer> votos;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.votos = new TreeMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void votar(String pais, int puntos) {
        votos.put(pais, puntos);
    }

    public int getPuntosTotales() {
        return votos.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int getMaxPuntos() {
        return Collections.max(votos.values());
    }

    public int getMinPuntos() {
        return Collections.min(votos.values());
    }
}
