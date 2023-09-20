package Ticket_Peajes;

public class Ticket implements ITicket
{
	private int kilometrosEntrada;
	private int kilometrosSalida;
	private double precioPorKilometro;

	public Ticket(int kilometrosEntrada, double precioPorKilometro)
		{
			this.kilometrosEntrada = kilometrosEntrada;
			this.precioPorKilometro = precioPorKilometro;
		}

	public int getKilometrosEntrada()
		{
			return kilometrosEntrada;
		}

	public int getKilometrosSalida()
		{
			return kilometrosSalida;
		}

	public double getPrecioPorKilometro()
		{
			return precioPorKilometro;
		}

	public double calcularTarifa()
		{
			return (kilometrosSalida - kilometrosEntrada) * precioPorKilometro;
		}

	@Override
	public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("Ticket [kilometrosEntrada=");
			builder.append(this.kilometrosEntrada);
			builder.append(", kilometrosSalida=");
			builder.append(this.kilometrosSalida);
			builder.append(", precioPorKilometro=");
			builder.append(this.precioPorKilometro);
			builder.append("]");
			return builder.toString();
		}

	@Override
	public boolean equals(Object obj)
		{
			if (this == obj)
				{
					return true;
				}
			if (obj == null || getClass() != obj.getClass())
				{
					return false;
				}
			Ticket other = (Ticket) obj;
			return kilometrosEntrada == other.kilometrosEntrada && kilometrosSalida == other.kilometrosSalida
					&& Double.compare(other.precioPorKilometro, precioPorKilometro) == 0;
		}

	@Override
	public void registrarSalida(int KmSalida)
		{
			this.kilometrosSalida = KmSalida;
		}
}