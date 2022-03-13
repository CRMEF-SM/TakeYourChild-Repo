package group1.rfid;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class HelloController implements Initializable {
    @FXML
    private ImageView dash;



    @FXML
    private ImageView dashcolor;

    @FXML
    private ImageView kids;

    @FXML
    private ImageView kids2;

    @FXML
    private ImageView menu;

    @FXML
    private Rectangle rec1;

    @FXML
    private Rectangle rec2;

    @FXML
    private Rectangle rec3;

    @FXML
    private Rectangle rec4;

    @FXML
    private ImageView menu2;

    @FXML
    private Pane panekmala;

    @FXML
    private ImageView parent;

    @FXML
    private ImageView parent2;

    @FXML
    private ImageView tv;

    @FXML
    private ImageView tv2;

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    void showtv(MouseEvent event) throws IOException {

        //Close the platform using node
        ((Node) event.getSource()).getScene().getWindow().hide();
        ///load RFID READE ::/MARK LEE
        Parent root12 = FXMLLoader.load(getClass().getResource("RFIDREADER1.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(root12, 540, 398));
        stage2.initStyle(StageStyle.UNDECORATED);
        stage2.show();

        //MOVE FORM RFID READER :
        root12.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        //move around here
        root12.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage2.setX(event.getScreenX() - xOffset);
                stage2.setY(event.getScreenY() - yOffset);
            }
        });

        ////////////////////////////////
    }

    @FXML
    void hide1(MouseEvent event) {
        rec1.setVisible(false);
    }

    @FXML
    void hide2(MouseEvent event) {
        rec2.setVisible(false);
    }

    @FXML
    void hide3(MouseEvent event) {
        rec3.setVisible(false);

    }

    @FXML
    void hide4(MouseEvent event) {
        rec4.setVisible(false);

    }

    @FXML
    void show1(MouseEvent event) {
        rec2.setVisible(true);

    }

    @FXML
    void show2(MouseEvent event) {
        rec3.setVisible(true);

    }

    @FXML
    void show3(MouseEvent event) {
        rec4.setVisible(true);

    }


    @FXML
    void slide(MouseEvent event) {

       panekmala.setVisible(true);
        menu2.setVisible(true);
        menu.setVisible(false);

    }

    @FXML
    void slide2(MouseEvent event) {
        panekmala.setVisible(false);
        menu.setVisible(true);


    }
    public static void main(String[] args) {

    }

    @FXML
    void mcha(MouseEvent event) {

    }

    @FXML
    void hada(MouseEvent event) {
        rec1.setVisible(true);
    }

    @FXML
    void over(MouseDragEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}