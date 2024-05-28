import controller.ControllerCalculator;
import model.ModelCalculator;
import view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ModelCalculator model = new ModelCalculator();
        ViewCalculator view = new ViewCalculator();
        ControllerCalculator controller = new ControllerCalculator(view,model);
        controller.startScreen();
        }
    }
