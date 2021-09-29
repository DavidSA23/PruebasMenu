package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prueba Menu");
        MenuBar menuBar = new MenuBar();
        HBox hBox = new HBox(menuBar);
        Scene scene = new Scene(hBox, 300, 300);
        //Menus Principales
        Menu menu1 = new Menu("Menu 1");
        Menu menu2 = new Menu("Menu 2");
        Menu menu3 = new Menu("Menu 3");
        Menu menu4 = new Menu("Menu 4");
        //SubMenu
        Menu subMenu = new Menu("SubMenu 1.1");
        //Menu Items
        MenuItem item1 = new MenuItem("Opción 1");
        item1.setGraphic(new ImageView("file:C:\\2 DAM David Sanchez\\1º Proyectos\\Eclipse\\PruebaMenu\\src\\application\\chi.png"));
        MenuItem item2 = new MenuItem("Opción 2");
        item2.setGraphic(new ImageView("file:C:\\2 DAM David Sanchez\\1º Proyectos\\Eclipse\\PruebaMenu\\src\\application\\lal.jpg"));
        MenuItem item3 = new MenuItem("Opción 3");
        MenuItem item4 = new MenuItem("Opción 4");
        //SubMenu Item
        MenuItem item11 = new MenuItem("Opción 1.1");
        SeparatorMenuItem separator = new SeparatorMenuItem();
        
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.getMenus().add(menu3);
        menuBar.getMenus().add(menu4);
      
        menu1.getItems().add(item1);
        menu1.getItems().add(separator);
        menu1.getItems().add(subMenu);
        subMenu.getItems().add(item11);
        menu1.getItems().add(item2);
        /*menu2.getItems().add(item3);
        menu2.getItems().add(item4);*/        
        Menu menu = new Menu("Menu 1");
        RadioMenuItem choice1Item = new RadioMenuItem("Elige 1");
        RadioMenuItem choice2Item = new RadioMenuItem("Elige 2");
        RadioMenuItem choice3Item = new RadioMenuItem("Elige 3");
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().add(choice1Item);
        toggleGroup.getToggles().add(choice2Item);
        toggleGroup.getToggles().add(choice3Item);
        menu2.getItems().add(choice1Item);
        menu2.getItems().add(choice2Item);
        menu2.getItems().add(choice3Item);       
        menuBar.getMenus().add(menu);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}