
/**
 * Ideia basica do Projeto Final
 * 
 * @author GP1 
 * @version GC
 */
public class M
{
    int qtd_1; int qtd_2;
    double vTotal;
    double prç_1; double prç_2;
    
    public M() 
    {
        this.qtd_1 = 0; this.qtd_2 = 0;
        this.prç_1 = 0; this.prç_2 = 0;
        this.vTotal = 0;
    }
    
    public M(int qtd_1, int qtd_2) 
    {
        this.qtd_1 = qtd_1; this.qtd_2 = qtd_2;
    }
    
    /**
     * Auto explicativo, [metodo usado: (argumento booleano)? <se true esse campo> : < se false esse>]
     */
    public double calcular() 
    {
        return this.qtd_1 != 0 || this.qtd_2 != 0? this.prç_1 * this.qtd_1 + this.prç_2 * this.qtd_2 : 0.00;
    }
    
    /**
     * Manda o "valor total" da compra na forma de texto, pa alterar a label do SB
     */
    public String resultar() 
    {
        String resultado = "";
        double vTotal = this.calcular();
        resultado += String.format("R$%.2f",vTotal);
        return resultado;
    }
}
