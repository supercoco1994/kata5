package kata5;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CurrencyDialog extends JPanel{
    
    public CurrencyDialog(){
        add(createComboBox());         
    }
    
    private JComboBox createComboBox(){
        return new JComboBox(new String[] {"EUR","USD","GBP"});
    }

    
}
