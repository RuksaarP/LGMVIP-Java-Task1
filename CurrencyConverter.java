import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CurrencyConverter extends Frame implements ActionListener {
    private Label fromLabel, toLabel, resultLabel;
    private TextField amountField;
    private Button convertButton;
    private Choice fromChoice, toChoice;
    private DecimalFormat decimalFormat;
    
    public CurrencyConverter() {
        super("Currency Converter");
        
        decimalFormat = new DecimalFormat("#.##");
        
        fromLabel = new Label("From:");
        toLabel = new Label("To:");
        resultLabel = new Label("Result:");
        
        amountField = new TextField();
        
        convertButton = new Button("Convert");
        convertButton.addActionListener(this);
        
        fromChoice = new Choice();
        fromChoice.add("USD");
        fromChoice.add("EUR");
        fromChoice.add("GBP");
        fromChoice.add("JPY");
        
        toChoice = new Choice();
        toChoice.add("USD");
        toChoice.add("EUR");
        toChoice.add("GBP");
        toChoice.add("JPY");
        
        setLayout(new GridLayout(4, 2, 5, 5));
        add(fromLabel);
        add(fromChoice);
        add(toLabel);
        add(toChoice);
        add(amountField);
        add(convertButton);
        add(resultLabel);
        
        setSize(300, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        double amount = Double.parseDouble(amountField.getText());
        double result = 0;
        
        if (fromChoice.getSelectedItem().equals("USD") && toChoice.getSelectedItem().equals("EUR")) {
            result = amount * 0.83;
        } else if (fromChoice.getSelectedItem().equals("USD") && toChoice.getSelectedItem().equals("GBP")) {
            result = amount * 0.72;
        } else if (fromChoice.getSelectedItem().equals("USD") && toChoice.getSelectedItem().equals("JPY")) {
            result = amount * 106.75;
        } else if (fromChoice.getSelectedItem().equals("EUR") && toChoice.getSelectedItem().equals("USD")) {
            result = amount * 1.21;
        } else if (fromChoice.getSelectedItem().equals("EUR") && toChoice.getSelectedItem().equals("GBP")) {
            result = amount * 0.87;
        } else if (fromChoice.getSelectedItem().equals("EUR") && toChoice.getSelectedItem().equals("JPY")) {
            result = amount * 130.54;
        } else if (fromChoice.getSelectedItem().equals("GBP") && toChoice.getSelectedItem().equals("USD")) {
            result = amount * 1.39;
        } else if (fromChoice.getSelectedItem().equals("GBP") && toChoice.getSelectedItem().equals("EUR")) {
            result = amount * 1.15;
        } else if (fromChoice.getSelectedItem().equals("GBP") && toChoice.getSelectedItem().equals("JPY")) {
            result = amount * 149.12;
        } else if (fromChoice.getSelectedItem().equals("JPY") && toChoice.getSelectedItem().equals("USD")) {
            result = amount * 0.0094;
        } else if (fromChoice.getSelectedItem().equals("JPY") && toChoice.getSelectedItem().equals("EUR")) {
            result = amount * 0.0077;
        } else if (fromChoice.getSelectedItem().equals("JPY") && toChoice.getSelectedItem().equals("GBP")) {
            result = amount * 0.0067;
        }
        
        resultLabel.setText("Result: " + decimalFormat.format(result));
    }
    
    public static void main(String[] args) {
        new CurrencyConverter();
    }
}


