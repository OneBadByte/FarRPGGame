package ToyMaker;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;


/**
 * Created by blackdartq on 10/26/16.
 */
public class Entity {

    private String name = null;
    private int health = 0;
    private int stamina = 0;
    private int money = 0;
    private int mana = 0;

    private int strength = 0;
    private int willPower = 0;
    private int agility = 0;
    private int luck = 0;
    private int intelligence = 0;
    private int endurance = 0;
    private int personality = 0;

    private int multiBy = 1;

    public enum Attributes {

        STRENGTH,
        WILLPOWER,
        AGILITY,
        LUCK,
        INTELLIGENCE,
        ENDURANCE,
        PERSONALITY


    }

    public enum Classes {

        STRENGTH,
        MAGIC,
        SNEAK


    }

    private Classes entityClass;


    //setters--------------------------------------------------------------

    public void setName(String entityName) {

        this.name = entityName;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    public void setMultiplyBy(int number) {

        this.multiBy = number;


    }

    public void setAttribute(Attributes attribute, int number) {

        switch (attribute) {
            case STRENGTH:
                this.strength = number;
                break;

            case WILLPOWER:
                this.willPower = number;
                break;

            case AGILITY:
                this.agility = number;
                break;

            case LUCK:
                this.luck = number;
                break;

            case INTELLIGENCE:
                this.intelligence = number;
                break;

            case ENDURANCE:
                this.endurance = number;
                break;

            case PERSONALITY:
                this.personality = number;
                break;

            default:
                System.out.println(number);
                break;
        }


    }

    public void setEntityClass(Classes entityClass) {

        this.entityClass = entityClass;


    }

    public void setAllAttributes(int strength, int willPower, int agility, int endurance, int luck, int intelligence, int personality) {

        setAttribute(Attributes.STRENGTH, strength);
        setAttribute(Attributes.WILLPOWER, willPower);
        setAttribute(Attributes.AGILITY, agility);
        setAttribute(Attributes.ENDURANCE, endurance);
        setAttribute(Attributes.LUCK, luck);
        setAttribute(Attributes.INTELLIGENCE, intelligence);
        setAttribute(Attributes.PERSONALITY, personality);


    }

    public void setAllAttributesAndClass(Classes entityClass, int strength, int willPower, int agility, int endurance, int luck, int intelligence, int personality) {

        setEntityClass(entityClass);
        setAttribute(Attributes.STRENGTH, strength);
        setAttribute(Attributes.WILLPOWER, willPower);
        setAttribute(Attributes.AGILITY, agility);
        setAttribute(Attributes.ENDURANCE, endurance);
        setAttribute(Attributes.LUCK, luck);
        setAttribute(Attributes.INTELLIGENCE, intelligence);
        setAttribute(Attributes.PERSONALITY, personality);


    }

    //getters--------------------------------------------------------------

    public String getName() {

        return this.name;


    }

    public int getHealth() {

        return this.health;


    }

    public int getMultiBy() {

        return this.multiBy;

    }

    public int getAttribute(Attributes attribute) {

        switch (attribute) {
            case STRENGTH:
                return this.strength;

            case WILLPOWER:
                return this.willPower;

            case AGILITY:
                return this.agility;

            case LUCK:
                return this.luck;

            case INTELLIGENCE:
                return this.intelligence;

            case ENDURANCE:
                return this.endurance;

            case PERSONALITY:
                return this.personality;

            default:
                return 3;
        }

    }

    public Classes getEntityClass() {


        return entityClass;

    }

    public int getStrengthAttackPower() {

        int total;
        total = (this.strength + this.luck + this.agility) * multiBy;
        return total;

    }

    public int getMagicPower() {

        int total;
        total = (this.willPower + this.intelligence + this.luck) * multiBy;
        return total;

    }

    public int getDefense() {

        int total;
        total = (this.endurance + this.agility) * multiBy;
        return total;


    }

    public int getSneakAttackPower() {

        int total;
        total = (this.strength + this.luck + this.agility) * 3;
        return total;

    }

    public int getHealingPower() {

        int total;
        total = (this.endurance + this.luck + this.intelligence) * multiBy;
        return total;
    }


    public void attack(Classes entityClass, Entity enemy) {

        switch (entityClass) {

            case STRENGTH:
                //System.out.println("The Enemies health is: " + enemy.getHealth());
                enemy.setHealth(enemy.getHealth() - (this.getStrengthAttackPower() - enemy.getDefense()));
                //System.out.println("The Enemies health is after attack: " + enemy.getHealth());
                System.out.println();
                System.out.println();
                break;

            case MAGIC:
                enemy.setHealth(enemy.getHealth() - (this.getMagicPower() - enemy.getDefense()));
                break;

            case SNEAK:
                enemy.setHealth(enemy.getHealth() - (this.getSneakAttackPower() - enemy.getDefense()));
                break;
        }


    }


    public void createMainCharacter() {

        String characterName;
        int Health;



        System.out.print("What is the characters name: ");
        Scanner scanner = new Scanner(System.in);
        characterName = scanner.nextLine();
        int pointsLeft = 20;


        while(pointsLeft > 0) {
            int Strength = 0;
            int WillPower = 0;
            int Agility = 0;
            int Luck = 0;
            int Intelligence = 0;
            int Endurance = 0;
            int Personality = 0;


            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Strength: ");
            Strength = scanner.nextInt();
            pointsLeft = pointsLeft - Strength;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("WillPower: ");
            WillPower = scanner.nextInt();
            pointsLeft = pointsLeft - WillPower;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Agility: ");
            Agility = scanner.nextInt();
            pointsLeft = pointsLeft - Agility;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Luck: ");
            Luck = scanner.nextInt();
            pointsLeft = pointsLeft - Luck;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Intelligence: ");
            Intelligence = scanner.nextInt();
            pointsLeft = pointsLeft - Intelligence;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Endurance: ");
            Endurance = scanner.nextInt();
            pointsLeft = pointsLeft - Endurance;

            System.out.println();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Personality: ");
            Personality = scanner.nextInt();
            pointsLeft = pointsLeft - Personality;

            String checkAnswer;
            System.out.println(" ");
            System.out.println("Points left: " + pointsLeft);
            System.out.println("Strength: " + Strength);
            System.out.println("WILLPOWER: " + WillPower);
            System.out.println("AGILITY: " + Agility);
            System.out.println("ENDURANCE: " + Endurance);
            System.out.println("LUCK: " + Luck);
            System.out.println("INTELLIGENCE: " + Intelligence);
            System.out.println("PERSONALITY: " + Personality);
            System.out.println("Is this correct( Y/N )");

            boolean loopRunning = true;
            while (loopRunning) {
                checkAnswer = scanner.nextLine();
                System.out.println(checkAnswer);
                if (checkAnswer == "y") {

                    System.out.println("this ran");
                    this.setAllAttributes(Strength, WillPower, Agility, Endurance, Luck, Intelligence, Personality);
                    loopRunning = false;


                } else if (checkAnswer == "n") {

                    System.out.println();
                    pointsLeft = 20;



                } else {
                    System.out.println("try again!");

                }


            }

        }

        this.setName(characterName);
        System.out.println(this.getName());





    }




/*
    public void createCharacter(Stage stage, Entity character){

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Create Character");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(event -> {
            character.setName("brody");
            btn.setText(character.getName());

        });
        grid.add(btn, 3, 3);



        Scene scene = new Scene(grid, 300, 500);
        scene.getStylesheets().add(Entity.class.getResource("CharacterCreator.css").toExternalForm());
        stage.setScene(scene);
        stage.show();



    }


*/

}
