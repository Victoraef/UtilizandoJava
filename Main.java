public class Main
{
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.marca = "VW";
		carro1.modelo = "Fox";
		carro1.cor = "Branco";
		carro1.km = 15000;
		carro1.preco = 45000;
		carro1.desconto =carro1.calcularDesconto(10);
		carro1.precoPago =carro1.calcularPrecoPago();
		
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Km: " + carro1.km);
		System.out.println("Preço: " + carro1.preco);
		System.out.println("Desconto: " + carro1.desconto);
		System.out.println("Preçoo Pago" + carro1.precoPago);
		
	}
	
}