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
        pane.setPadding(new Insets ( 5 , 5 , 5 , 5));
        pane.setHgap(5);
        pane.setVgap(5);
        //pane.setMinWidth(100);
        pane.setPrefWidth(200);
        pane.setPrefHeight(500);
        pane.setStyle("-fx-background-color: #EFE6E9;");

        String style = "-fx-background-radius:15px;-fx-font: 22 Cambria; -fx-base: #FF5879; -fx-text-fill: white;";
        String style2 = " -fx-effect: dropshadow( one-pass-box , black , 5 , 0.0 , 2 , 0 );-fx-background-radius:40px;-fx-font: 22 Cambria; -fx-base: #EBE7E8; -fx-text-fill:  #FF5879; ";
        String style3 = "-fx-font-size: 30px;-fx-font-weight: bold;-fx-text-fill: #FF5879 ;";
        int x=20, y=20;
        result.setEditable(false);
        result.setAlignment(Pos.CENTER);
        result.setMinSize(450, 80);
        pane.getChildren().add(result);
        result.setStyle(style3);
        int z = 7;
        Button StBr = new Button("(");
        StBr.prefWidthProperty().bind(pane.widthProperty().divide(z));
        StBr.prefHeightProperty().bind(pane.heightProperty().divide(z));
        StBr.setMinSize(x,y);
        StBr .setStyle(style2);
        pane.getChildren().add(StBr);
        startHandler handlerStBr = new startHandler();
        StBr.setOnAction(handlerStBr);
        
        Button EnBr = new Button(")");
        EnBr.prefWidthProperty().bind(pane.widthProperty().divide(z));
        EnBr.prefHeightProperty().bind(pane.heightProperty().divide(z));
        EnBr.setMinSize(x,y);
        EnBr .setStyle(style2);
        pane.getChildren().add(EnBr);
        endHandler handlerEnBr = new endHandler();
        EnBr.setOnAction(handlerEnBr);
      
        Button tan = new Button("tan");
        tan.prefWidthProperty().bind(pane.widthProperty().divide(z));
        tan.prefHeightProperty().bind(pane.heightProperty().divide(z));
        tan.setMinSize(x,y);
        tan .setStyle(style2);
        pane.getChildren().add(tan);
        tanHandler handlertan = new tanHandler();
        tan.setOnAction(handlertan);       
        
        Button sin = new Button("sin");
        sin.prefWidthProperty().bind(pane.widthProperty().divide(z));
        sin.prefHeightProperty().bind(pane.heightProperty().divide(z));
        sin.setMinSize(x,y);
        sin .setStyle(style2);
        pane.getChildren().add(sin);
        sinHandler handlersin = new sinHandler();
        sin.setOnAction(handlersin);
        
        Button cos = new Button("cos");
        cos.prefWidthProperty().bind(pane.widthProperty().divide(z));
        cos.prefHeightProperty().bind(pane.heightProperty().divide(z));
        cos.setMinSize(x,y);
        cos .setStyle(style2);
        pane.getChildren().add(cos);
        cosHandler handlercos = new cosHandler();
        cos.setOnAction(handlercos);
        
        Button bt9 = new Button("9");
        bt9.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt9.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt9.setMinSize(x,y);
        bt9 .setStyle(style);
        pane.getChildren().add(bt9);
        bt9Handler handler9 = new bt9Handler();
        bt9.setOnAction(handler9);
        
        Button bt8 = new Button("8");
        bt8.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt8.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt8.setMinSize(x,y);
        bt8 .setStyle(style);
        pane.getChildren().add(bt8);
        bt8Handler handler8 = new bt8Handler();
        bt8.setOnAction(handler8);

        Button bt7 = new Button("7");
        bt7.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt7.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt7.setMinSize(x,y);
        bt7 .setStyle(style);
        pane.getChildren().add(bt7);
        bt7Handler handler7 = new bt7Handler();
        bt7.setOnAction(handler7);
        
        Button bt6 = new Button("6");
        bt6.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt6.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt6.setMinSize(x,y);
        bt6 .setStyle(style);
        pane.getChildren().add(bt6);
        bt6Handler handler6 = new bt6Handler();
        bt6.setOnAction(handler6);
        
        Button doubl = new Button("^2");
        doubl.prefWidthProperty().bind(pane.widthProperty().divide(z));
        doubl.prefHeightProperty().bind(pane.heightProperty().divide(z));
        doubl.setMinSize(x,y);
         doubl .setStyle(style2);
        pane.getChildren().add(doubl);
        doublHandler handlerdoubl = new doublHandler();
        doubl.setOnAction(handlerdoubl);
        
        Button log = new Button("log");
        log.prefWidthProperty().bind(pane.widthProperty().divide(z));
        log.prefHeightProperty().bind(pane.heightProperty().divide(z));
        log.setMinSize(x,y);
         log.setStyle(style2);
        pane.getChildren().add(log);
        logHandler handlerlog = new logHandler();
        log.setOnAction(handlerlog);

        Button plus = new Button("+");
        plus.prefWidthProperty().bind(pane.widthProperty().divide(z));
        plus.prefHeightProperty().bind(pane.heightProperty().divide(z));
        plus.setMinSize(x,y);
        plus.setStyle(style2);
        pane.getChildren().add(plus);
        plusHandler handlerp = new plusHandler();
        plus.setOnAction(handlerp);
    
        Button minus = new Button("-");
        minus.prefWidthProperty().bind(pane.widthProperty().divide(z));
        minus.prefHeightProperty().bind(pane.heightProperty().divide(z));
        minus.setMinSize(x,y);
        minus.setStyle(style2);
        pane.getChildren().add(minus);
        minusHandler handlermu = new minusHandler();
        minus.setOnAction(handlermu);
    
        Button Delet = new Button("MR");
        Delet.prefWidthProperty().bind(pane.widthProperty().divide(z));
        Delet.prefHeightProperty().bind(pane.heightProperty().divide(z));
        Delet.setMinSize(x,y);
        Delet .setStyle(style2);
        pane.getChildren().add(Delet);
        deletHandler handlerdelet = new deletHandler();
        Delet.setOnAction(handlerdelet);
   
        Button bt5 = new Button("5");
        bt5.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt5.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt5.setMinSize(x,y);
        bt5 .setStyle(style);
        pane.getChildren().add(bt5);
        bt5Handler handler5 = new bt5Handler();
        bt5.setOnAction(handler5);
    
        Button bt4 = new Button("4");
        bt4.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt4.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt4.setMinSize(x,y);
        bt4 .setStyle(style);
        pane.getChildren().add(bt4);
        bt4Handler handler4 = new bt4Handler();
        bt4.setOnAction(handler4);
        
        Button bt3 = new Button("3");
        bt3.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt3.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt3.setMinSize(x,y);
        bt3 .setStyle(style);
        pane.getChildren().add(bt3);
        bt3Handler handler3 = new bt3Handler();
        bt3.setOnAction(handler3);
        
        Button bt2 = new Button("2");
        bt2.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt2.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt2.setMinSize(x,y);
         bt2 .setStyle(style);
        pane.getChildren().add(bt2);
        bt2Handler handler2 = new bt2Handler();
        bt2.setOnAction(handler2);
        
        Button sqrt = new Button("\u221A");
        sqrt.prefWidthProperty().bind(pane.widthProperty().divide(z));
        sqrt.prefHeightProperty().bind(pane.heightProperty().divide(z));
        sqrt.setMinSize(x,y);
        sqrt .setStyle(style2);
        pane.getChildren().add(sqrt);
        sqrtHandler sqrthandler = new sqrtHandler();
        sqrt.setOnAction(sqrthandler);

        Button pi = new Button("\u03c0");
        pi.prefWidthProperty().bind(pane.widthProperty().divide(z));
        pi.prefHeightProperty().bind(pane.heightProperty().divide(z));
        pi.setMinSize(x,y);
         pi.setStyle(style2);
        pane.getChildren().add(pi);
        piHandler handlerpi = new piHandler();
        pi.setOnAction(handlerpi);
   
        Button mul = new Button("*");
        mul.prefWidthProperty().bind(pane.widthProperty().divide(z));
        mul.prefHeightProperty().bind(pane.heightProperty().divide(z));
        mul.setMinSize(x,y);
         mul .setStyle(style2);
        pane.getChildren().add(mul);
        mulHandler handlerm = new mulHandler();
        mul.setOnAction(handlerm);
   
        Button divide = new Button("/");
        divide.prefWidthProperty().bind(pane.widthProperty().divide(z));
        divide.prefHeightProperty().bind(pane.heightProperty().divide(z));
        divide.setMinSize(x,y);
         divide .setStyle(style2);
        pane.getChildren().add(divide);
        divideHandler handlerd = new divideHandler();
        divide.setOnAction(handlerd);
        
        Button Clear = new Button("MC");
        Clear.prefWidthProperty().bind(pane.widthProperty().divide(z));
        Clear.prefHeightProperty().bind(pane.heightProperty().divide(z));
        Clear.setMinSize(x,y);
        Clear.setStyle(style2);
        pane.getChildren().add(Clear);
        ClearHandler handlerClear = new ClearHandler();
        Clear.setOnAction(handlerClear);
        
        Button bt1 = new Button("1");
        bt1.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt1.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt1.setMinSize(x,y);
         bt1 .setStyle(style);
        pane.getChildren().add(bt1);
        bt1Handler handler1 = new bt1Handler();
        bt1.setOnAction(handler1);
         
        Button bt0 = new Button("0");
        bt0.prefWidthProperty().bind(pane.widthProperty().divide(z));
        bt0.prefHeightProperty().bind(pane.heightProperty().divide(z));
        bt0.setMinSize(x,y);
         bt0 .setStyle(style);
        pane.getChildren().add(bt0);
        bt0Handler handler0 = new bt0Handler();
        bt0.setOnAction(handler0);
  
        Button btdot = new Button(".");
        btdot.prefWidthProperty().bind(pane.widthProperty().divide(z));
        btdot.prefHeightProperty().bind(pane.heightProperty().divide(z));
        btdot.setMinSize(x,y);
         btdot .setStyle(style);
        pane.getChildren().add(btdot);
        btdotHandler handlerdot = new btdotHandler();
        btdot.setOnAction(handlerdot);
   
        Button equal = new Button("=");
        equal.prefWidthProperty().bind(pane.widthProperty().divide(z));
        equal.prefHeightProperty().bind(pane.heightProperty().divide(z));
        equal.setMinSize(x,y);
        equal .setStyle(style2);
        pane.getChildren().add(equal);
        equalHandler handlereq = new equalHandler();
        equal.setOnAction(handlereq);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
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
           double finalresult =  Double.parseDouble(handelcos(statement, 0).toString());
           statement.append(" = " + finalresult);
           result.setText(statement.toString());
                }
            
            else 
                if (chars.toString().compareTo("cos(") == 0)
                {
                    
                    double finalresult =  Double.parseDouble(handelcos(statement, 0).toString());
                    statement.append(") = " + finalresult);
                    result.setText(statement.toString());}
            
            else 
                if (chars.toString().compareTo("tan()") == 0)
                {
                    
                    double finalresult = Double.parseDouble(handeltan(statement, 0).toString());
                    statement.append(" = " + finalresult);
                    result.setText(statement.toString());}
                else 
                    if (chars.toString().compareTo("tan(") == 0)
                    {
                        
                        double finalresult = Double.parseDouble(handeltan(statement, 0).toString());
                        statement.append(") = " + finalresult);
                        result.setText(statement.toString());}
                        
                     
                else 
                    if (chars.toString().compareTo("sin()") == 0)
                    {
                        double finalresult = Double.parseDouble(handelsin(statement, 0).toString());
                        statement.append(" = " + finalresult);
                        result.setText(statement.toString());}
                
                    else 
                        if (chars.toString().compareTo("sin(") == 0)
                        {
                            double finalresult = Double.parseDouble(handelsin(statement, 0).toString());
                            statement.append(") = " + finalresult);
                            result.setText(statement.toString());}
                    
                    else 
                        if (chars.toString().compareTo("\u221A") == 0)
                        {
                            double finalresult = Double.parseDouble(handelsqrt(statement,0).toString());
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
                                result.setText(statement.toString());
                                }
                            else 
                                if (chars.toString().compareTo("log") == 0)
                                {
                                    double finalresult = Double.parseDouble(handlelog(statement, 0).toString());
                                    statement.append(" = " + finalresult);
                                    result.setText(statement.toString());}
                                else 
                                    if (chars.toString().compareTo("log-") == 0)
                                    {
                                        statement.append(" = " + "Error: Cannot find log of a negative value");
                                        result.setText(statement.toString());
                                        }
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
             * next method to print characters "log("
             * @param "e"
             * call function "append" to printing
             * call function "tostring" to convert to integers 
             * @return not return value 
                 */
        public void handle(ActionEvent e){
            statement.append("log(");
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
        public static StringBuilder handlelog (StringBuilder statment, int index)
        {
            double x=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            int index2=0;
            for (int i=index;i<statment.length() && statment.charAt(i) != ')';i++)
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
                index2=i;
           }
            x = Double.parseDouble(nums.toString());
            double y =Math.log(x);
            statment.replace(index, index2+2, Double.toString(y));
            return statment;
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

        public static StringBuilder handelcos (StringBuilder statment ,int index)
        {
            double x=0;
            int index2=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length()&& statment.charAt(i) != ')';i++)
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
                index2=i;
           }
            x = Double.parseDouble(nums.toString());
            double y =Math.cos(x);
            if (y<0)
                y=y*-1;
            statment.replace(index, index2+2, Double.toString(y));
            return statment;
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

        public static StringBuilder handelsin (StringBuilder statment ,int index)
            {
                double x=0;
                int index2=0;
                StringBuilder chars = new StringBuilder ();
                StringBuilder nums = new StringBuilder ();
                for (int i=0;i<statment.length()&& statment.charAt(i) != ')';i++)
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
                    index2=i;
               }
                x = Double.parseDouble(nums.toString());
                double y =Math.sin(x);
                if (y<0)
                    y=y*-1;
                statment.replace(index, index2+2, Double.toString(y));
                return statment;
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

        public static StringBuilder handeltan (StringBuilder statment ,int index)
        {
            double x=0;
            int index2=0;
            StringBuilder chars = new StringBuilder ();
            StringBuilder nums = new StringBuilder ();
            for (int i=0;i<statment.length()&& Character.isDigit(statment.charAt(i));i++)
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
                index2=i;
           }
            x = Double.parseDouble(nums.toString());
            double y =Math.tan(x);
            if (y<0)
                y=y*-1;
            statment.replace(index, index2+2, Double.toString(y));
            return statment;
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

        public static StringBuilder handelsqrt (StringBuilder statment, int index)
        {
            double x=0;
            int index2=0;
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
                index2=i;
            }
            x = Double.parseDouble(base.toString());
            
            x = Double.parseDouble(base.toString());
            double y =Math.sqrt(x);
            statment.replace(index, index2+2, Double.toString(y));
            return statment;
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
            StringBuilder statment = new StringBuilder(result.getText());
           return Double.parseDouble(parsestatment(statment));
    }

        /**
         * @author Rim Abdelraheem
         * @param equation
         * @return the result of  the equation
         * make a while loop .. the loop still working until the equation finished
         * in the while loop, there is a multiple loops to generate the numbers and the operators to handle them
         * the loops check for the brackets, +, -, *, / operator, then call the operation execute to handle it
         */
        
        public static String parsestatment(StringBuilder statment)
        {   
           
            while (!isFinished(statment))
            {
                       
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == 'l' )
                    {
                        statment = handlelog(statment,i);
                        break;
                    }
                }
                
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '√' )
                    {
                        statment = handelsqrt(statment,i);
                        break;
                    }
                }
                
                
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == 'c' )
                    {
                        statment = handelcos(statment,i);
                        break;
                    }
                }
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == 's' )
                    {
                        statment = handelsin(statment,i);
                        break;
                    }
                }
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == 't' )
                    {
                        statment = handeltan(statment,i);
                        break;
                    }
                }
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == 't' )
                    {
                        statment = handeltan(statment,i);
                        break;
                    }
                }
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '(' )
                    {
                        statment = Brackets(statment,i);break;
                    }
                }
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '/' )
                    {
                        statment = Division(statment,i);break;
                    }
                }
                
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '*' )
                    {
                        statment = Multiplication(statment,i);break;
                    }
                }
                
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '-' )
                    {
                        statment = Subtraction(statment,i);break;
                    }
                }
                
                for (int i=0; i<statment.length(); i++)
                {
                    if(statment.charAt(i) == '+' )
                    {
                        statment = Addition(statment,i);break;
                    }
                }
            }
            return statment.toString();
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
        
        public static StringBuilder Brackets(StringBuilder statment, int leftBracket)
        {
            int rightBracket = 0;
            StringBuilder innerEquation = new StringBuilder();
            for (int i=leftBracket; i<statment.length(); i++)
            {
                if(statment.charAt(i) == ')' )
                {
                    rightBracket = i;
                    break;
                }
            }
            innerEquation = new StringBuilder(statment.substring(leftBracket+1,rightBracket));
            innerEquation = new StringBuilder(parsestatment(innerEquation));
            statment.replace(leftBracket, rightBracket+1, innerEquation.toString());
            return statment;
        }
        
        public static StringBuilder Division(StringBuilder statment, int operator)
        {
            StringBuilder LHS = new StringBuilder();
            StringBuilder RHS = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operator-1; i>=0 && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i--)
            {
                LHS.append(statment.charAt(i));
                start = i;
            }
            LHS = LHS.reverse();
            for(int i=operator+1; i<statment.length() && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i++)
            {
                RHS.append(statment.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(LHS.toString()) / Double.parseDouble(RHS.toString()));
            statment.replace(start, end+1, temp);
            return statment;
        }
        
        public static StringBuilder Multiplication(StringBuilder statment, int operator)
        {
            StringBuilder LHS = new StringBuilder();
            StringBuilder RHS = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operator-1; i>=0 && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i--)
            {
                LHS.append(statment.charAt(i));
                start = i;
            }
            LHS = LHS.reverse();
            for(int i=operator+1; i<statment.length() && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i++)
            {
                RHS.append(statment.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(LHS.toString()) * Double.parseDouble(RHS.toString()));
            statment.replace(start, end+1, temp);
            return statment;
        }
        
        public static StringBuilder Subtraction(StringBuilder statment, int operator)
        {
            StringBuilder LHS = new StringBuilder();
            StringBuilder RHS = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operator-1; i>=0 && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i--)
            {
                LHS.append(statment.charAt(i));
                start = i;
            }
            LHS = LHS.reverse();
            for(int i=operator+1; i<statment.length() && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i++)
            {
                RHS.append(statment.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(LHS.toString()) - Double.parseDouble(RHS.toString()));
            result.setText(temp);
            statment.replace(start, end+1, temp);
            return statment;
        }
        
        public static StringBuilder Addition(StringBuilder statment, int operator)
        {
            StringBuilder LHS = new StringBuilder();
            StringBuilder RHS = new StringBuilder();
            String temp;
            int start = 0;
            int end = 0;
            for(int i=operator-1; i>=0 && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i--)
            {
                LHS.append(statment.charAt(i));
                start = i;
            }
            LHS = LHS.reverse();
            for(int i=operator+1; i<statment.length() && ( Character.isDigit(statment.charAt(i)) || statment.charAt(i) == '.') ; i++)
            {
                RHS.append(statment.charAt(i));
                end = i;
            }
            temp = Double.toString(Double.parseDouble(LHS.toString()) + Double.parseDouble(RHS.toString()));
            statment.replace(start, end+1, temp);
            return statment;
        }
}//end of class

