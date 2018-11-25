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
private boolean prviunesen=false, operacijaunesena=false;
private boolean tacka=false;
private double prvi=0, drugi=prvi;
private int brojacdecimalaprvog=1;
private int brojacdecimaladrugog=1;




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

                if(!prviunesen){
                    if(!tacka) {
                        prvi *= 10;
                        prvi += 1;
                    }
                    else {
                        prvi+=1/Math.pow(10,brojacdecimalaprvog);
                        brojacdecimalaprvog++;
                    }
                    rezultat.set(Double.toString(prvi));
                }

                else if(operacijaunesena) {
                    if(!tacka){
                        drugi*=10;
                        drugi+=1;
                    }
                    else {
                        drugi+=1/Math.pow(10,brojacdecimaladrugog);
                        brojacdecimaladrugog++;
                    }
                    rezultat.set(Double.toString(drugi));
                }

    }

    public void Click2(ActionEvent actionEvent) {

        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 2;
            }
            else {
                prvi+=2/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=2;
            }
            else {
                drugi+=2/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }

    }

    public void Click3(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 3;
            }
            else {
                prvi+=3/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=3;
            }
            else {
                drugi+=3/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click0(ActionEvent actionEvent) {
    }

    public void Clickdot(ActionEvent actionEvent) {
    tacka=true;
    }

    public void Clickequals(ActionEvent actionEvent) {
    }

    public void Click5(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 5;
            }
            else {
                prvi+=5/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=5;
            }
            else {
                drugi+=5/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click4(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 4;
            }
            else {
                prvi+=4/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=4;
            }
            else {
                drugi+=4/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click9(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 9;
            }
            else {
                prvi+=9/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=9;
            }
            else {
                drugi+=9/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click8(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 8;
            }
            else {
                prvi+=8/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=8;
            }
            else {
                drugi+=8/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click7(ActionEvent actionEvent) {
        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 7;
            }
            else {
                prvi+=7/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=7;
            }
            else {
                drugi+=7/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }
    }

    public void Click6(ActionEvent actionEvent) {

        if(!prviunesen){
            if(!tacka) {
                prvi *= 10;
                prvi += 6;
            }
            else {
                prvi+=6/Math.pow(10,brojacdecimalaprvog);
                brojacdecimalaprvog++;
            }
            rezultat.set(Double.toString(prvi));
        }

        else if(operacijaunesena) {
            if(!tacka){
                drugi*=10;
                drugi+=6;
            }
            else {
                drugi+=6/Math.pow(10,brojacdecimaladrugog);
                brojacdecimaladrugog++;
            }
            rezultat.set(Double.toString(drugi));
        }

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
if(!prviunesen) {
    prviunesen=true; op=operacija.sabiranje; operacijaunesena=true; tacka=false;
}

    }


}
