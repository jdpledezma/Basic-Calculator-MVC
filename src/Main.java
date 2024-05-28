import controller.ControllerCalculator;
import model.ModelCalculator;
import view.ViewCalculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModelCalculator model = new ModelCalculator();
        ViewCalculator view = new ViewCalculator();
        ControllerCalculator controller = new ControllerCalculator(view,model);
        controller.startScreen();
        }
    }
