package ba.unsa.etf.rpr.tutorijal05;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;


public class Controller {

private SimpleStringProperty rezultat;
private boolean unesenprvi=false, unesendrugi=false, unesenaoperacija=false;
private boolean tacka=false;
private List<Integer> decimaleprvog = new ArrayList<Integer>();
private List<Integer> decimaledrugog = new ArrayList<Integer>();
private double prvi, drugi;


    private enum operacija {sabiranje, oduzimanje, mnozenje, dijeljenje, postotak} ;
operacija op;

public Controller() {
    rezultat=new SimpleStringProperty("");
}

public String getRezultat() {
    return rezultat.get();
}

public SimpleStringProperty rezultatProperty() {
    return rezultat;
}


    public void Click1(ActionEvent actionEvent) {

    }

    public void Click2(ActionEvent actionEvent) {
    }

    public void Click3(ActionEvent actionEvent) {
    }

    public void Click0(ActionEvent actionEvent) {
    }

    public void Clickdot(ActionEvent actionEvent) {
    }

    public void Clickequals(ActionEvent actionEvent) {
    }

    public void Click5(ActionEvent actionEvent) {
    }

    public void Click4(ActionEvent actionEvent) {
    }

    public void Click9(ActionEvent actionEvent) {
    }

    public void Click8(ActionEvent actionEvent) {
    }

    public void Click7(ActionEvent actionEvent) {
    }


    public void ClickMinus(ActionEvent actionEvent) {
    }
    public void ClickMnozenje(ActionEvent actionEvent) {
    }

    public void ClickDijeljenje(ActionEvent actionEvent) {
    }

    public void ClickPostotak(ActionEvent actionEvent) {
    }

    public void Clickplus(ActionEvent actionEvent) {

    }


}
