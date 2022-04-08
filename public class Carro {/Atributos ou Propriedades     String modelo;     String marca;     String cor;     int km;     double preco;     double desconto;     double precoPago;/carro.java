public class Carro {
    
    //Atributos ou Propriedades
    String modelo;
    String marca;
    String cor;
    int km;
    double preco;
    double desconto;
    double precoPago;
    
    //Método (Função ou Operação)
    double calcularDesconto(double percentualDesconto){
        return preco * (percentualDesconto / 100);
    }
    double calcularPrecoPago(){
        return preco - calcularDesconto();
    }
    
}
