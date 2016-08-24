package POS.GUI;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextFieldLimit extends PlainDocument 
{
    // variables
    private final int limit;

    /**
    * Constructor
    */
    JTextFieldLimit(int limit) 
    {
        super();
        this.limit = limit;
    }
    /**
    * This method checks the string input against the set length to make sure 
    * it is correct. Also, throws an exception if string length input is not 
    * valid (0 or -1) for example.
    */
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws 
        BadLocationException 
    {
        if (str == null)
            return;
        
        if ((getLength() + str.length()) <= limit) 
        {
            super.insertString(offset, str, attr);
        }
    }
}