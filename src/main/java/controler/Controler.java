package controler;

import model.Model;
import view.View;

public class Controler {
    public Controler() {
    }

    public void userMethod(){
        Model model = new Model();
        View.showMap(model.countNumber(model.createList(model.inputSize())));
    }
}
