package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import java.lang.*;


public class main extends Application {
    StringBuilder statement = new StringBuilder();
    TextField result = new TextField();
    
    public void start(Stage primaryStage)
    {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets ( 30 , 20 , 30 , 20));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setMinWidth(400);
        pane.setPrefWidth(400);
        pane.setMaxWidth(400);
        
//set a text filed hold the printed numbers, the results of math operations and pervious results 
        
        result.setEditable(false);
        result.setAlignment(Pos.CENTER);
        result.setMinSize(336, 40);
        pane.getChildren().add(result);
  
//add delete button
        Button Delet = new Button("Delete");
        Delet.setMinSize(60,60);
        pane.getChildren().add(Delet);
        deletHandler handlerdelet = new deletHandler();
        Delet.setOnAction(handlerdelet);
        
// set a start bracket       
        Button StBr = new Button("(");
        StBr.setMinSize(60,60);
        pane.getChildren().add(StBr);
        startHandler handlerStBr = new startHandler();
        StBr.setOnAction(handlerStBr);
        
 // set a end bracket       
        Button EnBr = new Button(")");
        EnBr.setMinSize(60,60);
        pane.getChildren().add(EnBr);
        endHandler handlerEnBr = new endHandler();
        EnBr.setOnAction(handlerEnBr);
        
//set the primary math operation + and numbers 7,8,9
        Button bt7 = new Button("7");
        bt7.setMinSize(60,60);
        pane.getChildren().add(bt7);
        bt7Handler handler7 = new bt7Handler();
        bt7.setOnAction(handler7);
        
        Button bt8 = new Button("8");
        bt8.setMinSize(60,60);
        pane.getChildren().add(bt8);
        bt8Handler handler8 = new bt8Handler();
        bt8.setOnAction(handler8);
        
        Button bt9 = new Button("9");
        bt9.setMinSize(60,60);
        pane.getChildren().add(bt9);
        bt9Handler handler9 = new bt9Handler();
        bt9.setOnAction(handler9);
        
        Button plus = new Button("+");
        plus.setMinSize(60,60);
        pane.getChildren().add(plus);
        plusHandler handlerp = new plusHandler();
        plus.setOnAction(handlerp);
   
//add tan button
        Button tan = new Button("tan(");
        tan.setMinSize(60,60);
        pane.getChildren().add(tan);
        tanHandler handlertan = new tanHandler();
        tan.setOnAction(handlertan);
        
//set the primary math operation - and numbers 4,5,6
        Button bt4 = new Button("4");
        bt4.setMinSize(60,60);
        pane.getChildren().add(bt4);
        bt4Handler handler4 = new bt4Handler();
        bt4.setOnAction(handler4);
        
        Button bt5 = new Button("5");
        bt5.setMinSize(60,60);
        pane.getChildren().add(bt5);
        bt5Handler handler5 = new bt5Handler();
        bt5.setOnAction(handler5);
        
        Button bt6 = new Button("6");
        bt6.setMinSize(60,60);
        pane.getChildren().add(bt6);
        bt6Handler handler6 = new bt6Handler();
        bt6.setOnAction(handler6);
        
        Button minus = new Button("-");
        minus.setMinSize(60,60);
        pane.getChildren().add(minus);
        minusHandler handlermu = new minusHandler();
        minus.setOnAction(handlermu);
        
//add sin button
        Button sin = new Button("sin(");
        sin.setMinSize(60,60);
        pane.getChildren().add(sin);
        sinHandler handlersin = new sinHandler();
        sin.setOnAction(handlersin);
        
//set the primary math operation * and numbers 1,2,3
        Button bt1 = new Button("1");
        bt1.setMinSize(60,60);
        pane.getChildren().add(bt1);
        bt1Handler handler1 = new bt1Handler();
        bt1.setOnAction(handler1);
        
        Button bt2 = new Button("2");
        bt2.setMinSize(60,60);
        pane.getChildren().add(bt2);
        bt2Handler handler2 = new bt2Handler();
        bt2.setOnAction(handler2);
        
        Button bt3 = new Button("3");
        bt3.setMinSize(60,60);
        pane.getChildren().add(bt3);
        bt3Handler handler3 = new bt3Handler();
        bt3.setOnAction(handler3);
        
        Button mul = new Button("*");
        mul.setMinSize(60,60);
        pane.getChildren().add(mul);
        mulHandler handlerm = new mulHandler();
        mul.setOnAction(handlerm);
        
//add cos button
        Button cos = new Button("cos(");
        cos.setMinSize(60,60);
        pane.getChildren().add(cos);
        cosHandler handlercos = new cosHandler();
        cos.setOnAction(handlercos);

//add index button
        Button index = new Button("n^x");
        index.setMinSize(60,60);
        pane.getChildren().add(index);       
//set a zero button     
        Button bt0 = new Button("0");
        bt0.setMinSize(60,60);
        pane.getChildren().add(bt0);
        bt0Handler handler0 = new bt0Handler();
        bt0.setOnAction(handler0);
        
//set a dot operator
        Button btdot = new Button(".");
        btdot.setMinSize(60,60);
        pane.getChildren().add(btdot);
        btdotHandler handlerdot = new btdotHandler();
        btdot.setOnAction(handlerdot);
               
//set the equal sign
        Button equal = new Button("=");
        equal.setMinSize(60,60);
        pane.getChildren().add(equal);
        equalHandler handlereq = new equalHandler();
        equal.setOnAction(handlereq);
        
//set the primary math operation /
        Button divide = new Button("/");
        divide.setMinSize(60,60);
        pane.getChildren().add(divide);
        divideHandler handlerd = new divideHandler();
        divide.setOnAction(handlerd);
        
//show the design 
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
         primaryStage.show();
         
    }

    public static void main(String[] args) {
         Application.launch(args);
         }
    
//event handler functions
    //print number 1
    class bt1Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("1");
            result.setText(statement.toString());
        }
        }
  //print number 2
        class bt2Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("2");
            result.setText(statement.toString());
        }
        }
   //print number 3
        class bt3Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("3");
            result.setText(statement.toString());
        }
        }
      //print number 4
        class bt4Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("4");
            result.setText(statement.toString());
        }
        }
      //print number 5
        class bt5Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("5");
            result.setText(statement.toString());
        }
        }
      //print number 6
        class bt6Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("6");
            result.setText(statement.toString());
        }
        }
      //print number 7
        class bt7Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("7");
            result.setText(statement.toString());
        }
        }
      //print number 8
        class bt8Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("8");
            result.setText(statement.toString());
        }
        }
      //print number 9
        class bt9Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("9");
            result.setText(statement.toString());
        }
        }
      //print number 0
        class bt0Handler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("0");
            result.setText(statement.toString());
        }
        }
      //print operator plus '+'
        class plusHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("+");
            result.setText(statement.toString());
        }
        }
      //print operator minus '-'
        class minusHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("-");
            result.setText(statement.toString());
        }
        }
      //print operator multiplication '*'
        class mulHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("*");
            result.setText(statement.toString());
        }
        }
      //print operator divide '/'
        class divideHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append("/");
            result.setText(statement.toString());
        }
        }
      //print operator equal '='
        class equalHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            double finalresult = handleStatement(statement);
            statement.append(" = " + finalresult);
            result.setText(statement.toString());
            statement = new StringBuilder();
        }
        }
      //print dot operator '.'
        class btdotHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            statement.append(".");
            result.setText(statement.toString());
        }
        }
      //print delete numbers
        class deletHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.deleteCharAt(statement.length()-1);
                statement.append(" ");
                result.setText(statement.toString());
                statement.setLength(statement.length() - 1);
            }
            }
      //print open bracket '('
        class startHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.append("(");
                result.setText(statement.toString());
            }
            }
        //print end bracket ')'
        class endHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.append(")");
                result.setText(statement.toString());
                
            }
            }
        //print tan equation
        class tanHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.append("tan(");
                result.setText(statement.toString());
            }
            } 
        //print sin equation
        class sinHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.append("sin(");
                result.setText(statement.toString());
            }
            }
        //print cos equation
        class cosHandler implements EventHandler<ActionEvent>{
            public void handle(ActionEvent e){
                statement.append("cos(");
                result.setText(statement.toString());
            }
            }
        
    public static double handleStatement(StringBuilder statement)
    {
        double finalresult = 0;
        StringBuilder RHS = new StringBuilder();
        StringBuilder LHS = new StringBuilder();
        char operator = ' ';
        
        for (int i=0;i<statement.length();i++)
        {
            if( operator == ' ' && Character.isDigit( statement.charAt(i) ) )
            {
                RHS.append(statement.charAt(0));
            }
            else
            {
                if( ! Character.isDigit( statement.charAt(i) ))
                {
                    operator = statement.charAt(i);
                }
                if (operator != ' ' && Character.isDigit( statement.charAt(i) ) )
                {
                    LHS.append(statement.charAt(i));
                }
            } 
            
        }
        switch(operator)
        {
        case '+':
            finalresult = Double.parseDouble(RHS.toString()) + Double.parseDouble(LHS.toString());
            break;
        case '-':
            finalresult = Double.parseDouble(RHS.toString()) - Double.parseDouble(LHS.toString());
            break;
        case '*':
            finalresult = Double.parseDouble(RHS.toString()) * Double.parseDouble(LHS.toString());
            break;
        case '/':
            finalresult = Double.parseDouble(RHS.toString()) / Double.parseDouble(LHS.toString());
            break;
        }
        return finalresult;
    }
}