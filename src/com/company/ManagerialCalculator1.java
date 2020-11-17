package com.company;
/**
 * This class is a subclass for ManagerialCalculator and makes a managerial calculator type1.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */
public class ManagerialCalculator1 extends ManagerialCalculator{
    /**
     * Creates a new managerial calculator type1
     */
    public ManagerialCalculator1()
    {
        super();
    }

    /**
     * Sets makes a new button
     * @param str as button name
     */
    @Override
    public void setNewButton(String str)
    {
        super.setNewButton(str);
    }

    /**
     * Sets buttons of calculator
     */
    @Override
    public void setButton()
    {
        super.setButton();
        setNewButton("sin");
        setNewButton("tan");
        setNewButton("exp");
        setNewButton("PI");
    }

    /**
     * Gets template of calculator
     * @return calculatorGUI
     */
    @Override
    public CalculatorGUI getCalculatorGUI()
    {
        return super.getCalculatorGUI();
    }
}
