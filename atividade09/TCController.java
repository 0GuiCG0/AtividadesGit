import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class TCController
{
    TCView tcView;
    Stage stage;
    TC tc;
    public TextField textFieldTemp;
    public CheckBox checkBoxIs_Fahr;
    public Label labelResultado;
    
    public TCController()
    {
        this.stage = new Stage();
        this.tcView = new TCView();
        this.tcView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.tcView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoConverterClicado(Event e) {
        try {
            double temp = Double.parseDouble(textFieldTemp.getText());
            boolean is_Fahr = checkBoxIs_Fahr.isSelected();
            TC tc = new TC(temp, is_Fahr);
            this.labelResultado.setText(tc.alternar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldTemp.setText("");
        checkBoxIs_Fahr.setSelected(false);
        labelResultado.setText("");
    }
}
