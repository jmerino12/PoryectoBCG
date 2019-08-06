/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import javafx.scene.image.Image;

/**
 *
 * @author JMB
 */
public class nevegacion {

    private final String home = "/view/inicio.fxml";
    private final String dashboard = "/view/cuadro.fxml";
    private final String chart = "/view/grafico.fxml";

    public Image applicationIcon = new Image(getClass().getResourceAsStream("/img/icons8_Source_Code_104px_2.png"));

    public String getHome() {
        return home;
    }

    public String getinicio() {
        return dashboard;
    }

    public String getchart() {
        return chart;
    }
}
