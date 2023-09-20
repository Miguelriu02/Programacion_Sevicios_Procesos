package Prueba;

import java.util.Objects;

public class Coche
{
	String matricula;
	String modelo;
	
	public Coche(String matricula, String modelo)
		{
			this.matricula = matricula;
			this.modelo = modelo;
		}

	public String getMatricula()
		{
			return matricula;
		}

	public void setMatricula(String matricula)
		{
			this.matricula = matricula;
		}

	public String getModelo()
		{
			return modelo;
		}

	public void setModelo(String modelo)
		{
			this.modelo = modelo;
		}
	
	@Override
	public boolean equals(Object obj)
		{
			if (this == obj)
				{
					return true;
				}
			if (!(obj instanceof Coche))
				{
					return false;
				}
			Coche other = (Coche) obj;
			return Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
		}

	@Override
	public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("Coche [matricula=");
			builder.append(matricula);
			builder.append(", modelo=");
			builder.append(modelo);
			builder.append("]");
			return builder.toString();
		}
}