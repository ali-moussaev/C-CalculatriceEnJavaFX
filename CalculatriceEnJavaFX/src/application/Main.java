package application;

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {

public static void main(String[] args) {
        
        launch(args);
}

        @Override
    
        public void start(Stage fenetrePrincipale) {
        
        // Création de mon GridPane (panneau de grille) et ma Scene (vu de la fenêtre).
        // Intégration de l'image.
        	
        GridPane grid = new GridPane();	
        Scene vuFenetre = new Scene(grid, 500, 500, Color.WHITE);
        Image monImage = new Image("https://www.pays-basque-digital.fr/wp-content/uploads/2021/04/logo_simplon-2048x2048.png");
        ImageView imageView = new ImageView(monImage);
        imageView.setFitWidth(225);
        imageView.setFitHeight(225); 
        GridPane.setConstraints(imageView, 2, 0);
        GridPane.setHalignment(imageView, HPos.CENTER);
        grid.getChildren().add(imageView);
        
        // Intégration de l'icone.
        // Titre de mon programme.
        // Verrouillage de la taille de la fenêtre.
        // Execution de la fenêtre.
        
        fenetrePrincipale.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/564/564429.png"));
        fenetrePrincipale.setTitle("Ma calculatrice pour Simplon");
        fenetrePrincipale.setResizable(false);
        fenetrePrincipale.setScene(vuFenetre);
        fenetrePrincipale.show();
    
        
        // Création de mon TextField (champ d'entrée de texte).
        
        TextField text_emplacement = new TextField("");

        // Création de tous les boutons.
        
        Button bouton1 = new Button("1");
        Button bouton2 = new Button("2");
        Button bouton3 = new Button("3");
        Button bouton4 = new Button("4");
        Button bouton5 = new Button("5");
        Button bouton6 = new Button("6");
        Button bouton7 = new Button("7");
        Button bouton8 = new Button("8");
        Button bouton9 = new Button("9");
        Button bouton0 = new Button("0");
        Button boutonPlus = new Button("+");
        Button boutonMoins = new Button("-");
        Button boutonEgale = new Button("=");
        Button boutonCorriger = new Button("Corriger");
        Button boutonEffacer = new Button("Effacer");
        
        
        // Positionnement et espacement de mes boutons.
        
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        
        grid.add(text_emplacement, 02, 7);
        grid.add(bouton1, 0, 1);
        grid.add(bouton2, 1, 1);
        grid.add(bouton3, 2, 1);
        grid.add(bouton4, 0, 2);
        grid.add(bouton5, 1, 2);
        grid.add(bouton6, 2, 2);
        grid.add(boutonCorriger, 3, 1);
        
        grid.add(bouton7, 0, 3);
        grid.add(bouton8, 1, 3);
        grid.add(bouton9, 2, 3);
        grid.add(boutonEffacer, 3, 2);
        
        grid.add(bouton0, 0, 4);
        grid.add(boutonPlus, 1, 4);
        grid.add(boutonMoins, 2, 4);
        grid.add(boutonEgale, 3, 4);
        grid.setBackground(null);

        // Paramétrage de la taille des boutons de 0 à 9 ainsi que des opérateurs "+" et "-".
        
        Button[] buttons = { bouton1, bouton2, bouton3, bouton4, bouton5, bouton6, bouton7, bouton8, bouton9, bouton0, boutonPlus, boutonMoins };
        int boutonLargeur = 50;
        int boutonHauteur = 50;

        for (Button button : buttons) {
            button.setPrefWidth(boutonLargeur);
            button.setPrefHeight(boutonHauteur); }
        
        // Paramétrage de la taille des boutons spéciales, "=", "Corriger" et "Effacer".

        
        Button[] bouton_speciales = {boutonEgale, boutonCorriger, boutonEffacer}; 
        int boutonLargeur1 = 100;
        int boutonHauteur1 = 50;

        for (Button button : bouton_speciales) {
            button.setPrefWidth(boutonLargeur1);
            button.setPrefHeight(boutonHauteur1); }
        
        // Les boutons numérotés de 0 à 9.
        
        bouton0.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "0");
        });
        
        bouton1.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "1");
        });
        
        bouton2.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "2");
        });
        
        bouton3.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "3");
        });
        
        bouton4.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "4");
        });
        
        bouton5.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "5");
        });
        
        bouton6.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "6");
        });
        
        bouton7.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "7");
        });
        
        bouton8.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "8");
        });
        
        bouton9.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            text_emplacement.setText(currentText + "9");
        });
        
        // Le bouton Plus.
        
        boutonPlus.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            char lastChar = currentText.charAt(currentText.length() - 1);
            if (!currentText.isEmpty() && (lastChar == '+' || lastChar == '-')) {
                return;
            }
            text_emplacement.setText(currentText + "+");
        });

        // Le bouton Moins.
       
        boutonMoins.setOnAction(e -> {
            String currentText = text_emplacement.getText();
            char lastChar = currentText.charAt(currentText.length() - 1);
            if (!currentText.isEmpty() && (lastChar == '+' || lastChar == '-')) {
                return;
            }
            text_emplacement.setText(currentText + "-");
        });
        
        // Le bouton Egale.
        
        boutonEgale.setOnAction(e -> {
            String currentText = text_emplacement.getText();

            if (!currentText.isEmpty()) {
                String[] nombre  = currentText.split("\\+|\\-");
                if (nombre.length != 2) {
                    text_emplacement.setText("Entrez deux nombres valides !");
                    return;
                }
                try {
                    int num1 = Integer.parseInt(nombre[0]);
                    int num2 = Integer.parseInt(nombre[1]);
                    int result = 0;
                    if (currentText.contains("+")) {
                        result = num1 + num2;
                       } 
                    else if (currentText.contains("-")) {
                        result = num1 - num2;
                       }
                    text_emplacement.setText(Integer.toString(result));
                       } 
                 catch (NumberFormatException ex) {
                    text_emplacement.setText("Entrez deux nombres valides !");
                }
                }
                });
        
            // Le bouton Corriger.

            boutonCorriger.setOnAction(event -> {
            String currentInput = text_emplacement.getText();
            if (!currentInput.isEmpty()) {
                currentInput = currentInput.substring(0, currentInput.length() - 1);
                text_emplacement.setText(currentInput);
            }
            });
            
            // Le bouton Effacer.
            
            boutonEffacer.setOnAction(new EventHandler <ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text_emplacement.clear();
            }
            });
        
    }
}