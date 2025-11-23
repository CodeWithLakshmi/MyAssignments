package day7Assignments;

public class Execution extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Button ex= new Execution();
ex.submit();
ex.click();
ex.setText("text to webelement");

Button bt= new CheckBoxButton();
bt.submit();
bt.click();
bt.setText("fromcheckbox button");
CheckBoxButton ch= new CheckBoxButton();
ch.clickCheckButton();

Button rd= new RadioButton();
rd.submit();
rd.click();
rd.setText("fromcheckbox button");
RadioButton rdo= new RadioButton();
rdo.selectRadioButton();

TextField txt= new TextField();
txt.getText();
txt.click();
txt.setText("text from textfield");

WebElement wb= new WebElement();
wb.click();
wb.setText("fromweb element obj");


	}

}
