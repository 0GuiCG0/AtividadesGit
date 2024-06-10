/**
 * Escreva uma descrição da classe TCC aqui.
 * 
 * @author  Guilherme Caetano Gea Martins 
 * @version 09/05
 */
public class TC
{
    double temp;
    boolean is_Fahr;
    
    public TC()
        {
            this.temp = 0;
            this.is_Fahr = false;
        }
    
    public TC(double temp, boolean is_Fahr) 
        {
            this.temp = temp;
            this.is_Fahr = is_Fahr;
        }
    
    /**
     * Converte a Temperatura p/ Outra
     *      C° -> F°
     *      F° -> C°
     * 
     * @return temperatura convertida, dada por: 
     *  ou (celsius * 9 / 5) + 32    p/ Fahrenheit
     *  ou (fahrenheit - 32) * 5 / 9 p/ Celsius
     */
        
    public double cvrt() 
        {
            if (this.temp == 0)
                return 0;
            return this.is_Fahr? (this.temp * 9 / 5) + 32 : (this.temp - 32) * (5 / 9);  
        }
    
    public String alternar()
        {
            String resultado = "";
            double tc = this.cvrt();
            if (is_Fahr) 
                return String.format("%.2f°C ==> %.2f°F", this.temp, tc);
            else
                return String.format("%.2f°F ==> %.2f°C", this.temp, tc);
        }
}
