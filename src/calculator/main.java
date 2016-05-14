package calculator;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class main extends Application {
    
    StringBuilder statement = new StringBuilder();
    /**
     * we create TextField to print result in it
     */
    static TextField result = new TextField();
    
    /**
     *we create  FlowPane & sets its padding property with
       an Insets object ( 30 , 20 , 30 , 20) creates an Insets 
       with the border sizes for top (11), right (12),
       button (13), and left (14) in pixels 
     *use setHgap to specify the horizontal gap   
      between two  button 
       
     * use setVgapto specify the horizontal gap   between two button
      in the pane   
     *use setMinWidth & setPrefWidth & setMaxWidth to  specify the 
      Width for the FlowPane  
     * we create Buttons from 0 to 9 & +,-,*,/,= operators
     * adding sin & cos & delet & bracktes 
     * adding style to button 
//     * log  MR  & sqrt pi MC 
    
     */
    
    public void start(Stage primaryStage)
    {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets ( 25 , 15 , 25 , 15));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setMinWidth(850);
        pane.setPrefWidth(850);
        pane.setMaxWidth(850);
        pane.setStyle("-fx-background-color: #EFE6E9;");

        String style = "-fx-background-radius:15px;-fx-font: 22 Cambria; -fx-base: #FF5879; -fx-text-fill: white;";
        String style2 = " -fx-effect: dropshadow( one-pass-box , black , 5 , 0.0 , 2 , 0 );-fx-background-radius:40px;-fx-font: 22 Cambria; -fx-base: #EBE7E8; -fx-text-fill:  #FF5879; ";
        String style3 = "-fx-font-size: 30px;-fx-font-weight: bold;-fx-text-fill: #FF5879 ;";
      
        result.setEditable(false);
        result.setAlignment(Pos.CENTER);
        result.setMinSize(750, 80);
        pane.getChildren().add(result);
        result.setStyle(style3);
        
        Button StBr = new Button("(");
        StBr.setMinSize(85,65);
        StBr .setStyle(style2);
        pane.getChildren().add(StBr);
        startHandler handlerStBr = new startHandler();
        StBr.setOnAction(handlerStBr);
        
        Button EnBr = new Button(")");
        EnBr.setMinSize(85,65);
        EnBr .setStyle(style2);
        pane.getChildren().add(EnBr);
        endHandler handlerEnBr = new endHandler();
        EnBr.setOnAction(handlerEnBr);
      
        Button tan = new Button("tan");
        tan.setMinSize(85,65);
        tan .setStyle(style2);
        pane.getChildren().add(tan);
        tanHandler handlertan = new tanHandler();
        tan.setOnAction(handlertan);       
        
        Button sin = new Button("sin");
        sin.setMinSize(85,65);
        sin .setStyle(style2);
        pane.getChildren().add(sin);
        sinHandler handlersin = new sinHandler();
        sin.setOnAction(handlersin);
        
        Button cos = new Button("cos");
        cos.setMinSize(85,65);
        cos .setStyle(style2);
        pane.getChildren().add(cos);
        cosHandler handlercos = new cosHandler();
        cos.setOnAction(handlercos);
        
        Button bt9 = new Button("9");
        bt9.setMinSize(85,65);
        bt9 .setStyle(style);
        pane.getChildren().add(bt9);
        bt9Handler handler9 = new bt9Handler();
        bt9.setOnAction(handler9);
        
        Button bt8 = new Button("8");
        bt8.setMinSize(85,65);
        bt8 .setStyle(style);
        pane.getChildren().add(bt8);
        bt8Handler handler8 = new bt8Handler();
        bt8.setOnAction(handler8);

        Button bt7 = new Button("7");
        bt7.setMinSize(85,65);
        bt7 .setStyle(style);
        pane.getChildren().add(bt7);
        bt7Handler handler7 = new bt7Handler();
        bt7.setOnAction(handler7);
        
        Button bt6 = new Button("6");
        bt6.setMinSize(85,65);
         bt6 .setStyle(style);
        pane.getChildren().add(bt6);
        bt6Handler handler6 = new bt6Handler();
        bt6.setOnAction(handler6);
        
        Button doubl = new Button("^2");
        doubl.setMinSize(85,65);
         doubl .setStyle(style2);
        pane.getChildren().add(doubl);
        doublHandler handlerdoubl = new doublHandler();
        doubl.setOnAction(handlerdoubl);
        
        Button log = new Button("log");
        log.setMinSize(85,65);
         log.setStyle(style2);
        pane.getChildren().add(log);
        logHandler handlerlog = new logHandler();
        log.setOnAction(handlerlog);

        Button plus = new Button("+");
        plus.setMinSize(85,65);
        plus.setStyle(style2);
        pane.getChildren().add(plus);
        plusHandler handlerp = new plusHandler();
        plus.setOnAction(handlerp);
    
        Button minus = new Button("-");
        minus.setMinSize(85,65);
        minus.setStyle(style2);
        pane.getChildren().add(minus);
        minusHandler handlermu = new minusHandler();
        minus.setOnAction(handlermu);
    
        Button Delet = new Button("MR");
        Delet.setMinSize(85,65);
        Delet .setStyle(style2);
        pane.getChildren().add(Delet);
        deletHandler handlerdelet = new deletHandler();
        Delet.setOnAction(handlerdelet);
   
        Button bt5 = new Button("5");
        bt5.setMinSize(85,65);
        bt5 .setStyle(style);
        pane.getChildren().add(bt5);
        bt5Handler handler5 = new bt5Handler();
        bt5.setOnAction(handler5);
    
        Button bt4 = new Button("4");
        bt4.setMinSize(85,65);
        bt4 .setStyle(style);
        pane.getChildren().add(bt4);
        bt4Handler handler4 = new bt4Handler();
        bt4.setOnAction(handler4);
        
        Button bt3 = new Button("3");
        bt3.setMinSize(85,65);
        bt3 .setStyle(style);
        pane.getChildren().add(bt3);
        bt3Handler handler3 = new bt3Handler();
        bt3.setOnAction(handler3);
        
        Button bt2 = new Button("2");
        bt2.setMinSize(85,65);
         bt2 .setStyle(style);
        pane.getChildren().add(bt2);
        bt2Handler handler2 = new bt2Handler();
        bt2.setOnAction(handler2);
        
        Button sqrt = new Button("\u221A");
        sqrt.setMinSize(85,65);
        sqrt .setStyle(style2);
        pane.getChildren().add(sqrt);
        sqrtHandler sqrthandler = new sqrtHandler();
        sqrt.setOnAction(sqrthandler);

        Button pi = new Button("\u03c0");
        pi.setMinSize(85,65);
         pi.setStyle(style2);
        pane.getChildren().add(pi);
        piHandler handlerpi = new piHandler();
        pi.setOnAction(handlerpi);
   
        Button mul = new Button("*");
        mul.setMinSize(85,65);
         mul .setStyle(style2);
        pane.getChildren().add(mul);
        mulHandler handlerm = new mulHandler();
        mul.setOnAction(handlerm);
   
        Button divide = new Button("/");
        divide.setMinSize(85,65);
         divide .setStyle(style2);
        pane.getChildren().add(divide);
        divideHandler handlerd = new divideHandler();
        divide.setOnAction(handlerd);
        
        Button Clear = new Button("MC");
        Clear.setMinSize(85,65);
        Clear.setStyle(style2);
        pane.getChildren().add(Clear);
        ClearHandler handlerClear = new ClearHandler();
        Clear.setOnAction(handlerClear);
        
        Button bt1 = new Button("1");
        bt1.setMinSize(85,65);
         bt1 .setStyle(style);
        pane.getChildren().add(bt1);
        bt1Handler handler1 = new bt1Handler();
        bt1.setOnAction(handler1);
         
        Button bt0 = new Button("0");
        bt0.setMinSize(85,65);
         bt0 .setStyle(style);
        pane.getChildren().add(bt0);
        bt0Handler handler0 = new bt0Handler();
        bt0.setOnAction(handler0);
  
        Button btdot = new Button(".");
        btdot.setMinSize(85,65);
         btdot .setStyle(style);
        pane.getChildren().add(btdot);
        btdotHandler handlerdot = new btdotHandler();
        btdot.setOnAction(handlerdot);
   
        Button equal = new Button("=");
        equal.setMinSize(85,65);
        equal .setStyle(style2);
        pane.getChildren().add(equal);
        equalHandler handlereq = new equalHandler();
        equal.setOnAction(handlereq);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
         
    }

    public static void main(String[] args) {
         Application.launch(args);
         }
    
    /**
     * @author Rim Abdelraheem 
     */
   
    class bt1Handler implements EventHandler<ActionEvent>{
        /** 
         * First method to print number 1 on text field
         * @param "e"
         * call function "append" to printing 
         * call function "tostring()" to convert the all to integers 
         * call method "setText" to print "1" on the text field and put on result
         * @return not return value but print the result
         **/ 
        public void handle(ActionEvent e){
            statement.append("1");
            result.setText(statement.toString());
        }
        }
    
    /**
     * @author Rim Abdelraheem
     * Call method setText to print the result into it
     * we use  append to store the value & can use it
     */
        class bt2Handler implements EventHandler<ActionEvent>{
            /** Next method to print number 2 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "2" on the text field and put on result
             * @return not return value but print the result
             **/
        public void handle(ActionEvent e){
            statement.append("2");
            result.setText(statement.toString());
        }
        }
        
        /**
         * @author Rim Abdelraheem 
         */
        class bt3Handler implements EventHandler<ActionEvent>{
            /**
             * Next method to print number 3 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "3" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("3");
            result.setText(statement.toString());
        }
        }

        /**
         * @author Rim Abdelraheem
         */
        class bt4Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 4 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "4" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("4");
            result.setText(statement.toString());
        }
        }
        
        /**
         * @author Rim Abdelraheem
         */
        class bt5Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 5 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "5" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("5");
            result.setText(statement.toString());
        }
        }

/** 
 * 
 * @author Rim Adbelraheem
 *
 */
        class bt6Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 6 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "6" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("6");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class bt7Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 7 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "7" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("7");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class bt8Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 8 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "8" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("8");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class bt9Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 9 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "9" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("9");
            result.setText(statement.toString());
        }
        }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class piHandler implements EventHandler<ActionEvent>{
            /**
             *  @param "e"
             * call method "setText" to print "3.14" on the text field
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            result.setText("3.14");
        }
        }

      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class bt0Handler implements EventHandler<ActionEvent>{
            /** 
             *  Next method to print number 0 on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "0" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("0");
            result.setText(statement.toString());
        }
        }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class doublHandler implements EventHandler<ActionEvent>{
            /**
             * Next method to print power^2
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("^2");
            result.setText(statement.toString());  
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class plusHandler implements EventHandler<ActionEvent>{
            /**
             * Next method to print character "+" on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "+" on the text field and put on result
             * @return not return value but print the result
             */
            public void handle(ActionEvent e){
            statement.append("+");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class minusHandler implements EventHandler<ActionEvent>{
            /** 
             * Next method to print character "-" on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "-" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("-");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class mulHandler implements EventHandler<ActionEvent>{
            /** 
             * Next method to print character "*" on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "*" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("*");
            result.setText(statement.toString());
        }
        }
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class divideHandler implements EventHandler<ActionEvent>{
            /** 
             * Next method to print character "/" on text field
             * @param "e"
             * call function "append" to printing 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "/" on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append("/");
            result.setText(statement.toString());
        }
        }
        
        
      /**
       *  
       * @author Rim Abdelraheem
       *
       */
        class equalHandler implements EventHandler<ActionEvent>{
            /**method to handle the different mathematical operations and print the results 
             * @param "e"
             *create object "statement" from the method StringBuilder
             *call method "append" to print result
             *create object "chars" & "nums"  from the method StringBuilder
             *create forloop to round of each index in statement from i=0 to length of statement
             *in forloop create if statement to compare characters and numbers
             *call method "charAt" to get indexes
             *call method "append" to print length of statement
             *if character is digit put on "StringBuilder nums" otherwise put on "StringBuilder chars"
             *
             *
             *
             *
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            StringBuilder statement = new StringBuilder();
            statement.append(result.getText());
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
                        
            for (int i=0;i<statement.length();i++)
            {
                if( !Character.isDigit( statement.charAt(i) ) )
                {
                    chars.append(statement.charAt(i));
                }
                else 
                {
                    if(  Character.isDigit( statement.charAt(i) ))
                    {
                        nums.append ( statement.charAt(i));
                    }          
                }       
        }
            
            if (chars.toString().compareTo("cos()") == 0)
            {
           double finalresult = handelcos(statement);
           statement.append(" = " + finalresult);
           result.setText(statement.toString());
                }
            
            else 
                if (chars.toString().compareTo("cos(") == 0)
                {
                    
                    double finalresult = handelcos(statement);
                    statement.append(") = " + finalresult);
                    result.setText(statement.toString());}
            
            else 
                if (chars.toString().compareTo("tan()") == 0)
                {
                    
                    double finalresult = handeltan(statement);
                    statement.append(" = " + finalresult);
                    result.setText(statement.toString());}
                else 
                    if (chars.toString().compareTo("tan(") == 0)
                    {
                        
                        double finalresult = handeltan(statement);
                        statement.append(") = " + finalresult);
                        result.setText(statement.toString());}
                        
                     
                else 
                    if (chars.toString().compareTo("sin()") == 0)
                    {
                        double finalresult = handelsin(statement);
                        statement.append(" = " + finalresult);
                        result.setText(statement.toString());}
                
                    else 
                        if (chars.toString().compareTo("sin(") == 0)
                        {
                            double finalresult = handelsin(statement);
                            statement.append(") = " + finalresult);
                            result.setText(statement.toString());}
                    
                    else 
                        if (chars.toString().compareTo("\u221A") == 0)
                        {
                            double finalresult = handelsqrt(statement);
                            statement.append(" = " + finalresult);
                            result.setText(statement.toString());
                            }
                    
                        else 
                            if (chars.toString().compareTo("\u221A-") == 0)
                            {
                                statement.append(" = " + "Error: Cannot find root of a negative value");
                                result.setText(statement.toString());
                                }
                        
                        else 
                            if (chars.toString().compareTo("^") == 0)
                            {
                                double finalresult = handeldoublepow(statement);
                                statement.append(" = " + finalresult);
                                result.setText(statement.toString());}
                            else 
                                if (chars.toString().compareTo("log") == 0)
                                {
                                    double finalresult = handlelog(statement);
                                    statement.append(" = " + finalresult);
                                    result.setText(statement.toString());}
                                else 
                                    if (chars.toString().compareTo("log-") == 0)
                                    {
                                        statement.append(" = " + "Error: Cannot find log of a negative value");
                                        result.setText(statement.toString());}
                            
                            else
                            {
                                double finalresult = handleStatement(statement);
                                statement.append(" = " + finalresult);
                                result.setText(statement.toString());
                            }
        }}
        
      /**
       * 
       * @author Rim Abdelraheem
       *
       */
        class btdotHandler implements EventHandler<ActionEvent>{
            /**
             * Next method to print character "." on text field
             * @param "e"
             * call function "append" to print "." plus the final result 
             * call function "tostring()" to convert the all to integers 
             * call method "setText" to print "." on the text field and put on result
             * @return not return value but print the result
             */
        public void handle(ActionEvent e){
            statement.append(".");
            result.setText(statement.toString());
        }
        }
        
        /**
         * 
         * @author Rim Abdelraheem
         *
         */
        class sqrtHandler implements EventHandler<ActionEvent>{
            /** 
             *Next method to print root square sign
            * @param "e"
            * call function "append" to printing
            * call function "tostring" to convert to integers 
            * @return not return values
            */
            public void handle(ActionEvent e){
                statement.append("\u221A");
                result.setText(statement.toString());
            }
            }
        
      /**
       * 
       * @author Esraa Ali
       *
       */
        class deletHandler implements EventHandler<ActionEvent>{
            /**
             *Next method to button delete
             * call function "deleteCharAt" to delete the characters
             * and call function "length()-1" to delete last index
             * print space instead of the index have deleted
             * call function "tostring" to convert to integers
             * call method "setText" to print "." on the text field and put on result 
             * print the result 
             * call method set length to take the current length and put on statement
         */
            public void handle(ActionEvent e){
                statement.deleteCharAt(statement.length()-1);
                statement.append(" ");
                result.setText(statement.toString());
                statement.setLength(statement.length() - 1);
            }
            }
        
      /**
       * 
       * @author ola shaban
       *
       */
        class startHandler implements EventHandler<ActionEvent>{
            /** 
             *Next method to print character"("
            * @param "e"
            * call function "append" to printing
            * call function "tostring" to convert to integers 
            * @return not return value 
                */
             public void handle(ActionEvent e){
                statement.append("(");
                result.setText(statement.toString());
            }
            }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class endHandler implements EventHandler<ActionEvent>{
            /** 
             *Next method to print character")"
            * @param "e"
            * call function "append" to printing
            * call function "tostring" to convert to integers 
            * @return not return value 
                */
           
            public void handle(ActionEvent e){
                statement.append(")");
                result.setText(statement.toString());  
            }
            }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class tanHandler implements EventHandler<ActionEvent>{
            /**   
            
             * next method to print characters "tan("
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value 
                 */
            public void handle(ActionEvent e){
                statement.append("tan(");
                result.setText(statement.toString());
            }
            }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class sinHandler implements EventHandler<ActionEvent>{
            /**   
             * next method to print characters "sin("
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value 
                 */
            public void handle(ActionEvent e){
                statement.append("sin(");
                result.setText(statement.toString());
            }
            }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class cosHandler implements EventHandler<ActionEvent>{
            /**
             * next method to print characters "cos("
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value 
                 */
            public void handle(ActionEvent e){
                statement.append("cos(");
                result.setText(statement.toString());
            }
            }
        
        /**
         * 
         * @author ola shaban
         *
         */
        class logHandler implements EventHandler<ActionEvent>{
            /**
             * next method to print characters "log"
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value 
                 */
        public void handle(ActionEvent e){
            statement.append("log");
            result.setText(statement.toString());
        }
        }
        
        /**
         * 
         * @author Esraa Ali
         *
         */
        class ClearHandler implements EventHandler<ActionEvent>{
            /** 
             *Next method to clear all screen
             * @param "e"
             * call function "delete" to delete from first character to length of statement
             * call method "setText" to print space on the text field
             * @return not return value
             */
        public void handle(ActionEvent e){
            statement.delete(0, statement.length());
            result.setText("  ");
        }
        }
        
      /**
       * 
       * @author Alyaa gamal
         * @param statment
         * @return the result of  Math.log(x)
         * @author ebtsam
         * this method to handle the double power
         * create variable x with initial value 0
         * create a chars method from the string builder that takes the characters 
         * create a nums method from the string builder that takes the numbers
         * create for loop that took what is written in the statement 
         * create if condition to compare what is in the statement if it was not a digit but it into the characters  
         * AND IF ITS digit a character put it into the nums
         * then put in the x variable the nums value but convert it onto double instead of a string 
         * use the math library to compute the return of the log
         *  
         */
        public static double handlelog (StringBuilder statment)
        {
            double x=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length();i++)
            {
                if( !Character.isDigit( statment.charAt(i) ) )
                {
                    chars.append(statment.charAt(i));
                }
                
                else 
                {
                    if(  Character.isDigit( statment.charAt(i) ))
                    {
                        nums.append ( statment.charAt(i));
                    }
                   
                }         
           }
            x = Double.parseDouble(nums.toString());
            return Math.log(x);
        }//end of function of log function
        
        /**
         * @author Ebtsam Mohammed
         * @param statment
         * @return the result of  Math.cos(x)
         * create double variable calls x with a initial value 0
         * create object( chars) from stringBuilder to but the characters into it
         * create object (nums) from  stringBuilder to but the numbers into it
         * create for loop that takes what it has been written in (statement)
         * create if statement to compare if its not a number then put it into the characters
         * if its a digit put it into the nums we have been created   
         * set the variable x to what is in the nums which is string and convert it to double
         * return the x into a math function that calculate the cos
         */

        public static double handelcos (StringBuilder statment)
        {
            double x=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length();i++)
            {
                if( !Character.isDigit( statment.charAt(i) ) )
                {
                    chars.append(statment.charAt(i));
                }
                
                else 
                {
                    if(  Character.isDigit( statment.charAt(i) ))
                    {
                        nums.append ( statment.charAt(i));
                    }
                   
                }         
           }
            x = Double.parseDouble(nums.toString());
            return Math.cos(x);
        }//end of function of cos function
        
        /**
         * @author Ebtsam Mohammed
         * @param statment
         * @return the result of  Math.sin(x)
         * create double variable calls x with a initial value 0
         * create object( chars) from stringBuilder to but the characters into it
         * create object (nums) from  stringBuilder to but the numbers into it
         * create for loop that takes what it has been written in (statement)
         * create if statement to compare if its not a number then put it into the characters
         * if its a digit put it into the nums we have been created   
         * set the variable x to what is in the nums which is string and convert it to double
         * return the x into a math function that calculate the sin
         */

        public static double handelsin (StringBuilder statment)
        {
            double x=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length();i++)
            {
                if( !Character.isDigit( statment.charAt(i) ) )
                {
                    chars.append(statment.charAt(i));
                }
                
                else 
                {
                    if(  Character.isDigit( statment.charAt(i) ))
                    {
                        nums.append ( statment.charAt(i));
                    }
                   
                }         
           }
            x = Double.parseDouble(nums.toString());
            return Math.sin(x);
        }//end of sin function
      
        /**
         * @author Rim Abdelraheem
         * @param statment
         * @return the result of  Math.tan(x)
         * create double variable calls x with a initial value 0
         * create object( chars) from stringBuilder to but the characters into it
         * create object (nums) from  stringBuilder to but the numbers into it
         * create for loop that takes what it has been written in (statement)
         * create if statement to compare if its not a number then put it into the characters
         * if its a digit put it into the nums we have been created   
         * set the variable x to what is in the nums which is string and convert it to double
         * return the x into a math function that calculate the tan
         */

        public static double handeltan (StringBuilder statment)
        {
            double x=0;
            StringBuilder chars = new StringBuilder ();      
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length();i++)
            {
                if( !Character.isDigit( statment.charAt(i) ) )
                {
                    chars.append(statment.charAt(i));
                }
                
                else 
                {
                    if(  Character.isDigit( statment.charAt(i) ))
                    {
                        nums.append ( statment.charAt(i));
                    }
                   
                }         
           }
            x = Double.parseDouble(nums.toString());
            return Math.tan(x);
        }//end of tan function
        
        /**
         * @author Rim Abdelraheem
         * @param statment
         * @return the result of  Math.sqrt(x)
         * create double variable calls x with a initial value 0
         * create object( chars) from stringBuilder to but the characters into it
         * create object (nums) from  stringBuilder to but the numbers into it
         * create for loop that takes what it has been written in (statement)
         * create if statement to compare if its not a number then put it into the characters
         * if its a digit put it into the nums we have been created   
         * set the variable x to what is in the nums which is string and convert it to double
         * return the x into a math function that calculate the sqrt
         */

        public static double handelsqrt (StringBuilder statment)
        {
            double x=0;
            StringBuilder base = new StringBuilder ();
            StringBuilder Char = new StringBuilder ();
            for (int i=0;i<statment.length();i++)
            {
                if( Character.isDigit( statment.charAt(i) ) )
                {
                    base.append(statment.charAt(i));
                }
                else 
                    Char.append(statment.charAt(i));
           }
            x = Double.parseDouble(base.toString());
            
            return Math.sqrt(x);
        }//end of sqrt function
        
        /**
         * @author Alyaa Gamal
         * @param statment
         * @return the result of  Math.pow(x)
         * create double variable calls x with a initial value 0
         * create object( chars) from stringBuilder to but the characters into it
         * create object (nums) from  stringBuilder to but the numbers into it
         * create for loop that takes what it has been written in (statement)
         * create if statement to compare if its not a number then put it into the characters
         * if its a digit put it into the nums we have been created   
         * set the variable x to what is in the nums which is string and convert it to double
         * return the x into a math function that calculate the pow
         */

        public static double handeldoublepow (StringBuilder statment)
        {
            double x=0;
            StringBuilder base = new StringBuilder ();
            StringBuilder chars = new StringBuilder();
            for (int i=0;i<statment.length()-1;i++)
            {
                if( Character.isDigit( statment.charAt(i) ) )
                {
                    base.append(statment.charAt(i));
                }
                else       
                    
                      chars.append(  statment.charAt(i));
                    
           }
            x = Double.parseDouble(base.toString());
            
            return Math.pow(x,2);
        }//end if double power function
        
        /**
         * @author Rim Abdelraheem
         * @param statment
         * @return the result of  the equation
         * create a StringBuilder object and put in it the equation the user had written
         * send the equation to the pasrseEquation to handle the multiple operations
         */

        public static double handleStatement(StringBuilder statement)
        {
            StringBuilder equation = new StringBuilder(result.getText());
           return Double.parseDouble(parseEquation(equation));
    }

        /**
         * @author Rim Abdelraheem
         * @param equation
         * @return the result of  the equation
         * make a while loop .. the loop still working until the equation finished
         * in the while loop, there is a multiple loops to generate the numbers and the operators to handle them
         * the loops check for the brackets, +, -, *, / operator, then call the operation execute to handle it
         */
        
        public static String parseEquation(StringBuilder equation)
        {   
           
            while (!isFinished(equation))
            {
                                
                for (int i=0; i<equation.length(); i++)
                {
                    if(equation.charAt(i) == '(' )
                    {
                        equation = executeBrackets(equation,i);break;
                    }
                }
                for (int i=0; i<equation.length(); i++)
                {
                    if(equation.charAt(i) == '/' )
                    {
                        equation = executeDivision(equation,i);break;
                    }
                }
                
                for (int i=0; i<equation.length(); i++)
                {
                    if(equation.charAt(i) == '*' )
                    {
                        equation = executeMultiplication(equation,i);break;
                    }
                }
                
                for (int i=0; i<equation.length(); i++)
                {
                    if(equation.charAt(i) == '-' )
                    {
                        equation = executeSubtraction(equation,i);break;
                    }
                }
                
                for (int i=0; i<equation.length(); i++)
                {
                    if(equation.charAt(i) == '+' )
                    {
                        equation = executeAddition(equation,i);break;
                    }
                }
            }
            return equation.toString();
        }
        
        public static boolean isFinished(StringBuilder equation)
        {
            boolean finished = true;
            
            for (int i=0; i<equation.length(); i++)
            {
                if( !Character.isDigit(equation.charAt(i)) && equation.charAt(i) != '.')
                {
                    finished = false;
                }
            }
            
            return finished;
        }
        
        public static StringBuilder executeBrackets(StringBuilder equation, int leftBracketPos)
        {
            int rightBracketPos = 0;
            StringBuilder innerEquation = new StringBuilder();
            for (int i=leftBracketPos; i<equation.length(); i++)
            {
                if(equation.charAt(i) == ')' )
                {
                    rightBracketPos = i;
                    break;
                }
            }
            innerEquation = new StringBuilder(equation.substring(leftBracketPos+1,rightBracketPos));
            innerEquation = new StringBuilder(parseEquation(innerEquation));
            equation.replace(leftBracketPos, rightBracketPos+1, innerEquation.toString());
            return equation;
        }
        
        public static StringBuilder executeDivision(StringBuilder equation, int operatorPos)
        {
            StringBuilder leftHandSide = new StringBuilder();
            StringBuilder rightHandSide = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
            {
                leftHandSide.append(equation.charAt(i));
                start = i;
            }
            leftHandSide = leftHandSide.reverse();
            for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
            {
                rightHandSide.append(equation.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(leftHandSide.toString()) / Double.parseDouble(rightHandSide.toString()));
            equation.replace(start, end+1, temp);
            return equation;
        }
        
        public static StringBuilder executeMultiplication(StringBuilder equation, int operatorPos)
        {
            StringBuilder leftHandSide = new StringBuilder();
            StringBuilder rightHandSide = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
            {
                leftHandSide.append(equation.charAt(i));
                start = i;
            }
            leftHandSide = leftHandSide.reverse();
            for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
            {
                rightHandSide.append(equation.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(leftHandSide.toString()) * Double.parseDouble(rightHandSide.toString()));
            equation.replace(start, end+1, temp);
            return equation;
        }
        
        public static StringBuilder executeSubtraction(StringBuilder equation, int operatorPos)
        {
            StringBuilder leftHandSide = new StringBuilder();
            StringBuilder rightHandSide = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
            {
                leftHandSide.append(equation.charAt(i));
                start = i;
            }
            leftHandSide = leftHandSide.reverse();
            for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
            {
                rightHandSide.append(equation.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(leftHandSide.toString()) - Double.parseDouble(rightHandSide.toString()));
            result.setText(temp);
            equation.replace(start, end+1, temp);
            return equation;
        }
        
        public static StringBuilder executeAddition(StringBuilder equation, int operatorPos)
        {
            StringBuilder leftHandSide = new StringBuilder();
            StringBuilder rightHandSide = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
            {
                leftHandSide.append(equation.charAt(i));
                start = i;
            }
            leftHandSide = leftHandSide.reverse();
            for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
            {
                rightHandSide.append(equation.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(leftHandSide.toString()) + Double.parseDouble(rightHandSide.toString()));
            equation.replace(start, end+1, temp);
            return equation;
        }
}//end of class

