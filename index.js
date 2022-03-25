import index from './index';

public class Carro {
    
    //Atributos ou Propriedades
    String modelo;
    String marca;
    String cor;
    int km;
    double preco;
    
    //Método (Função ou Operação)
    double calcularDesconto(){
        return preco * 0.05;
    }
    double calcularPrecoPago(){
        return preco - calcularDesconto();
    }
    
}

export default index: