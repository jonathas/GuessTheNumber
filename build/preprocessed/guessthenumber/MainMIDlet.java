/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Random;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author jonathas
 */
public class MainMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    private int randomNum;
    private int attempts;
    private String tip;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command okCommand;
    private Command exitCommand;
    private Command backCommand;
    private Command exitCommand1;
    private Form inputForm;
    private StringItem stringItem;
    private TextField inputNumber;
    private Form resultForm;
    private StringItem resultText;
    private StringItem attemptsText;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     * @link https://stackoverflow.com/questions/363681/generating-random-numbers-in-a-range-with-java
     */
    public MainMIDlet() {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        this.randomNum = rand.nextInt((max - min) + 1) + min;
        this.attempts = 0;
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getInputForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == inputForm) {//GEN-BEGIN:|7-commandAction|1|37-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|37-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|2|37-postAction
                // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|25-preAction
                // write pre-action user code here
                int numInput = Integer.parseInt(getInputNumber().getString());
                if (numInput > this.randomNum) {
                    this.tip = "oh, looks like the number you chose is bigger than the one I have";
                } else if (numInput < this.randomNum) {
                    this.tip = "oh, looks like the number you chose is smaller than the one I have";
                } else {
                    this.tip = "Congratulations, you've got the right number (" + Integer.toString(this.randomNum) + ")! :D";
                }

                this.attempts++;

                switchDisplayable(null, getResultForm());//GEN-LINE:|7-commandAction|4|25-postAction
                // write post-action user code here
                try {
                    resultText.setText(this.tip);
                    attemptsText.setText("Number of attempts: " + Integer.toString(this.attempts));
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }//GEN-BEGIN:|7-commandAction|5|40-preAction
} else if (displayable == resultForm) {
    if (command == backCommand) {//GEN-END:|7-commandAction|5|40-preAction
 // write pre-action user code here
switchDisplayable(null, getInputForm());//GEN-LINE:|7-commandAction|6|40-postAction
 // write post-action user code here
} else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|7|42-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|8|42-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|9|7-postCommandAction
        }//GEN-END:|7-commandAction|9|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|10|
//</editor-fold>//GEN-END:|7-commandAction|10|




//<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputForm ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of inputForm component.
     *
     * @return the initialized component instance
     */
    public Form getInputForm() {
        if (inputForm == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
inputForm = new Form("Guess the number!", new Item[]{getStringItem(), getInputNumber()});//GEN-BEGIN:|14-getter|1|14-postInit
            inputForm.addCommand(getOkCommand());
            inputForm.addCommand(getExitCommand());
            inputForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return inputForm;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {
//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
stringItem = new StringItem("Guess a number between 1 and 100", "");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
}//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|16-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputNumber ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initialized instance of inputNumber component.
     *
     * @return the initialized component instance
     */
    public TextField getInputNumber() {
        if (inputNumber == null) {
//GEN-END:|22-getter|0|22-preInit
 // write pre-init user code here
inputNumber = new TextField("Type the number", "", 3, TextField.NUMERIC | TextField.NON_PREDICTIVE);//GEN-LINE:|22-getter|1|22-postInit
 // write post-init user code here
}//GEN-BEGIN:|22-getter|2|
        return inputNumber;
    }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {
//GEN-END:|24-getter|0|24-preInit
 // write pre-init user code here
okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|24-getter|1|24-postInit
 // write post-init user code here
}//GEN-BEGIN:|24-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: resultForm ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of resultForm component.
     *
     * @return the initialized component instance
     */
    public Form getResultForm() {
        if (resultForm == null) {
//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
resultForm = new Form("Result", new Item[]{getResultText(), getAttemptsText()});//GEN-BEGIN:|26-getter|1|26-postInit
            resultForm.addCommand(getBackCommand());
            resultForm.addCommand(getExitCommand1());
            resultForm.setCommandListener(this);//GEN-END:|26-getter|1|26-postInit
// write post-init user code here
}//GEN-BEGIN:|26-getter|2|
        return resultForm;
    }
//</editor-fold>//GEN-END:|26-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: resultText ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initialized instance of resultText component.
     *
     * @return the initialized component instance
     */
    public StringItem getResultText() {
        if (resultText == null) {
//GEN-END:|32-getter|0|32-preInit
 // write pre-init user code here
resultText = new StringItem("", null);//GEN-LINE:|32-getter|1|32-postInit
 // write post-init user code here
}//GEN-BEGIN:|32-getter|2|
        return resultText;
    }
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: attemptsText ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of attemptsText component.
     *
     * @return the initialized component instance
     */
    public StringItem getAttemptsText() {
        if (attemptsText == null) {
//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
attemptsText = new StringItem("", null);//GEN-LINE:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
        return attemptsText;
    }
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|36-getter|0|36-preInit
 // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|36-getter|1|36-postInit
 // write post-init user code here
}//GEN-BEGIN:|36-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|39-getter|0|39-preInit
 // write pre-init user code here
backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|39-getter|1|39-postInit
 // write post-init user code here
}//GEN-BEGIN:|39-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|39-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|41-getter|0|41-preInit
 // write pre-init user code here
exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|41-getter|1|41-postInit
 // write post-init user code here
}//GEN-BEGIN:|41-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|41-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
