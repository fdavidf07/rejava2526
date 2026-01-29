package petshopDavidFernandez;

public class TiendaDavidFernandezTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PerroDavidFernandez perro1 = new PerroDavidFernandez("Thor","Pitbul",4);
	System.out.print("Perro: "+perro1);
	ClienteDavidFernandez cliente1= new ClienteDavidFernandez(perro1, "David","Tolosa");
	System.out.print("\nCliente: "+cliente1);
	TiendaDavidFernandez tienda1 = new TiendaDavidFernandez (cliente1,"TiendaAnimal","Antonio Lopez");
	System.out.print("\nTienda: "+tienda1);
	}

}
