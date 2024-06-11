import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class C
{
    V view;
    Stage stage;
    M modulo;
    
    public TextField textFieldQtd1;
    public TextField textFieldQtd2;
    public Label labelResultado;
    
    public C()
    {
        this.stage = new Stage();
        this.view = new V();
        this.view.setController(this);
    }
    
    /**
     * Cata Erros
     */
    public void iniciar() throws Exception {
        this.view.start(this.stage);
        this.stage.show();
    }
    
    public void buttonCalcularClicado(Event e) {
        try {
            int qtd_1 = Integer.parseInt(textFieldQtd1.getText());
            int qtd_2 = Integer.parseInt(textFieldQtd2.getText());
            M module = new M(qtd_1, qtd_2);
            this.labelResultado.setText(module.resultar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
}
