package EuroVision_MRG_Launcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import EuroVision_MRG_Utils.Pais;

public class Launcher
{

	public static void main(String[] args)
	{
		List<String> paisesFinalistas = new ArrayList<>();
		paisesFinalistas.add("Serbia");
		paisesFinalistas.add("Moldavia");

		List<Pais> paises = new ArrayList<>();
		
		for (String paisNombre : paisesFinalistas)
		{
			paises.add(new Pais(paisNombre));
		}
		
		Random rand = new Random();
		for (Pais pais : paises)
		{
			List<String> paisesVotados = new ArrayList<>(paisesFinalistas);
			Collections.shuffle(paisesVotados);

			for (String paisVotado : paisesVotados)
			{
				if (!paisVotado.equals(pais.getNombre()))
				{
					int puntos = rand.nextInt(8) + 1; // Entre 1 y 8 puntos
					pais.votar(paisVotado, puntos);
				}
			}
		}

		for (Pais pais : paises)
		{
			System.out.println(pais.getNombre() + ": " + pais.getPuntosTotales() + " puntos");
		}

		int maxPuntos = -1;
		int minPuntos = Integer.MAX_VALUE;
		List<Pais> paisesMax = new ArrayList<>();
		List<Pais> paisesMin = new ArrayList<>();

		for (Pais pais : paises)
		{
			int puntos = pais.getPuntosTotales();
			if (puntos > maxPuntos)
			{
				maxPuntos = puntos;
				paisesMax.clear();
				paisesMax.add(pais);
			} else if (puntos == maxPuntos)
			{
				paisesMax.add(pais);
			}

			if (puntos < minPuntos)
			{
				minPuntos = puntos;
				paisesMin.clear();
				paisesMin.add(pais);
			} else if (puntos == minPuntos)
			{
				paisesMin.add(pais);
			}
		}

		System.out.println("\nPaíses con la puntuación más alta:");
		for (Pais pais : paisesMax)
		{
			System.out.println(pais.getNombre() + ": " + pais.getMaxPuntos() + " puntos");
		}

		System.out.println("\nPaíses con la puntuación más baja:");
		for (Pais pais : paisesMin)
		{
			System.out.println(pais.getNombre() + ": " + pais.getMinPuntos() + " puntos");
		}
	}
}