 //TASK 3-1 SMELL WITHIN A CLASS
package main.java.memoranda.ui.htmleditor;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JEditorPane;

public class CharAction extends AbstractAction {
    JEditorPane editor;
    CharAction(String name) {
        super(name);
        //putValue(Action.SHORT_DESCRIPTION, name);
    }

    public void actionPerformed(ActionEvent e) {
        String s = this.getValue(Action.NAME).toString();
        editor.replaceSelection(s);
        if (s.length() == 2)
            editor.setCaretPosition(editor.getCaretPosition()-1);
    }
}