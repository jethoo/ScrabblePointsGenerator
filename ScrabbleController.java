package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ScrabbleController {

    /*
        TASKS:
        1. DECREASE THE LETTER COUNTER
        2. RUNNING POINT TOTAL SYSTEM
        3. RESTRICTIONS FOR VALID WORDS ARE :
            A. TWO LETTERS MINIMUM
            B. ONE LETTER MUST BE VOWEL
            C. 8 LETTERS MAXIMUM
            D. CAN NOT HAVE DUPLICATE WORDS
            E. TOTAL POINTS AREA WILL RUN A RUNNING TOTAL
            E. THE SUBMIT BUTTON WILL DETERMINE IF THE WORD IS VALID
            F. PREVIOUS WORDS SECTION WILL STORE PREVIOUS WORDS

            //ids created : word (textfield),,points(textfield), error(label),previousWords(Label),
            //Action: submitWord(button),
            //pressedA, pressedB,pressedC,pressedD,pressedE,pressedF,..., pressedZ)
            //leftA, leftB, leftC, leftD, leftE, ......, leftZ)

            //Controller takes care of the events only
           */

    @FXML
    Button buttonA,buttonB,buttonC,buttonD,buttonE,buttonF,buttonG,buttonH,buttonI,buttonJ,buttonK,buttonL,buttonM,buttonN,
            buttonO,buttonP,buttonQ,buttonR,buttonS,buttonT,buttonU,buttonV,buttonW,buttonX,buttonY,buttonZ;

    @FXML
    TextField word, points;
    @FXML
    Label error, previousWords;
    @FXML
    Label leftA, leftB, leftC, leftD, leftE, leftF, leftG, leftH, leftI, leftJ, leftK, leftL, leftM, leftN, leftO, leftP,
            leftQ, leftR, leftS, leftT, leftU, leftV, leftW, leftX, leftY, leftZ;

    ScrabbleModel model = new ScrabbleModel();

    @FXML
    private void pressedA(ActionEvent event) {
        word.setText(word.getText() + "a");
    }

    @FXML
    private void pressedB(ActionEvent event) {
        word.setText(word.getText() + "b");
    }

    @FXML
    private void pressedC(ActionEvent event) {
        word.setText(word.getText() + "c");
    }

    @FXML
    private void pressedD(ActionEvent event) {
        word.setText(word.getText() + "d");
    }

    @FXML
    private void pressedE(ActionEvent event) {
        word.setText(word.getText() + "e");
    }

    @FXML
    private void pressedF(ActionEvent event) {
        word.setText(word.getText() + "f");
    }

    @FXML
    private void pressedG(ActionEvent event) {
        word.setText(word.getText() + "g");
    }

    @FXML
    private void pressedH(ActionEvent event) {
        word.setText(word.getText() + "h");
    }

    @FXML
    private void pressedI(ActionEvent event) {
        word.setText(word.getText() + "i");
    }

    @FXML
    private void pressedJ(ActionEvent event) {
        word.setText(word.getText() + "j");
    }

    @FXML
    private void pressedK(ActionEvent event) {
        word.setText(word.getText() + "k");
    }

    @FXML
    private void pressedL(ActionEvent event) {
        word.setText(word.getText() + "l");
    }

    @FXML
    private void pressedM(ActionEvent event) {
        word.setText(word.getText() + "m");
    }

    @FXML
    private void pressedN(ActionEvent event) {
        word.setText(word.getText() + "n");
    }

    @FXML
    private void pressedO(ActionEvent event) {
        word.setText(word.getText() + "o");
    }

    @FXML
    private void pressedP(ActionEvent event) {
        word.setText(word.getText() + "p");
    }

    @FXML
    private void pressedQ(ActionEvent event) {
        word.setText(word.getText() + "q");
    }

    @FXML
    private void pressedR(ActionEvent event) {
        word.setText(word.getText() + "r");
    }

    @FXML
    private void pressedS(ActionEvent event) {
        word.setText(word.getText() + "s");
    }

    @FXML
    private void pressedT(ActionEvent event) {
        word.setText(word.getText() + "t");
    }

    @FXML
    private void pressedU(ActionEvent event) {
        word.setText(word.getText() + "u");
    }

    @FXML
    private void pressedV(ActionEvent event) {
        word.setText(word.getText() + "v");
    }

    @FXML
    private void pressedW(ActionEvent event) {
        word.setText(word.getText() + "w");
    }

    @FXML
    private void pressedX(ActionEvent event) {
        word.setText(word.getText() + "x");
    }

    @FXML
    private void pressedY(ActionEvent event) {
        word.setText(word.getText() + "y");
    }

    @FXML
    private void pressedZ(ActionEvent event) {
        word.setText(word.getText() + "z");
    }


    @FXML
    private void initialize() {
        error.setText("");
    }

    @FXML
    private void submitWord(ActionEvent event) {
        try {
            points.setText(model.getPoints(word.getText()));
            previousWords.setText(previousWords.getText() + model.getPreviousWords() + ",");
            word.setText("");
           
            leftA.setText(model.getLeftA());
            if(Integer.parseInt(model.getLeftA()) <= 0){
                buttonA.setVisible(false);
            }
            leftB.setText(model.getLeftB());
           if(Integer.parseInt(model.getLeftB()) <= 0){
                buttonB.setVisible(false);
            }
            leftC.setText(model.getLeftC());
            if(Integer.parseInt(model.getLeftC()) <= 0){
                buttonC.setVisible(false);
            }
            leftD.setText(model.getLeftD());
            if(Integer.parseInt(model.getLeftD()) <= 0){
                buttonD.setVisible(false);
            }
            leftE.setText(model.getLeftE());
            if(Integer.parseInt(model.getLeftE()) <= 0){
                buttonE.setVisible(false);
            }
            leftF.setText(model.getLeftF());
            if(Integer.parseInt(model.getLeftF()) <= 0){
                buttonF.setVisible(false);
            }
            leftG.setText(model.getLeftG());
            if(Integer.parseInt(model.getLeftG()) <= 0){
                buttonG.setVisible(false);
            }
            leftH.setText(model.getLeftH());
            if(Integer.parseInt(model.getLeftH()) <= 0){
                buttonH.setVisible(false);
            }
            leftI.setText(model.getLeftI());
            if(Integer.parseInt(model.getLeftI()) <= 0){
                buttonI.setVisible(false);
            }
            leftJ.setText(model.getLeftJ());
            if(Integer.parseInt(model.getLeftJ()) <= 0){
                buttonJ.setVisible(false);
            }
            leftK.setText(model.getLeftK());
            if(Integer.parseInt(model.getLeftK()) <= 0){
                buttonK.setVisible(false);
            }
            leftL.setText(model.getLeftL());
            if(Integer.parseInt(model.getLeftL()) <= 0){
                buttonL.setVisible(false);
            }
            leftM.setText(model.getLeftM());
            if(Integer.parseInt(model.getLeftM()) <= 0){
                buttonM.setVisible(false);
            }
            leftN.setText(model.getLeftN());
            if(Integer.parseInt(model.getLeftN()) <= 0){
                buttonN.setVisible(false);
            }
            leftO.setText(model.getLeftO());
            if(Integer.parseInt(model.getLeftO()) <= 0){
                buttonO.setVisible(false);
            }
            leftP.setText(model.getLeftP());
            if(Integer.parseInt(model.getLeftP()) <= 0){
                buttonP.setVisible(false);
            }
            leftQ.setText(model.getLeftQ());
            if(Integer.parseInt(model.getLeftQ()) <= 0){
                buttonQ.setVisible(false);
            }
            leftR.setText(model.getLeftR());
            if(Integer.parseInt(model.getLeftR()) <= 0){
                buttonR.setVisible(false);
            }
            leftS.setText(model.getLeftS());
            if(Integer.parseInt(model.getLeftS()) <= 0){
                buttonS.setVisible(false);
            }
            leftT.setText(model.getLeftT());
            if(Integer.parseInt(model.getLeftT()) <= 0){
                buttonT.setVisible(false);
            }
            leftU.setText(model.getLeftU());
            if(Integer.parseInt(model.getLeftU()) <= 0){
                buttonU.setVisible(false);
            }
            leftV.setText(model.getLeftV());
            if(Integer.parseInt(model.getLeftV()) <= 0){
                buttonV.setVisible(false);
            }
            leftW.setText(model.getLeftW());
            if(Integer.parseInt(model.getLeftW()) <= 0){
                buttonW.setVisible(false);
            }
            leftX.setText(model.getLeftX());
            if(Integer.parseInt(model.getLeftX()) <= 0){
                buttonX.setVisible(false);
            }
            leftY.setText(model.getLeftY());
            if(Integer.parseInt(model.getLeftY()) <= 0){
                buttonY.setVisible(false);
            }
            leftZ.setText(model.getLeftZ());
            if(Integer.parseInt(model.getLeftZ()) <= 0){
                buttonZ.setVisible(false);
            }
            error.setText("");
        } catch (Exception e) {
            error.setText(e.getMessage());
        }
    }

}
