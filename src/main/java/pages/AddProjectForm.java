package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AddProjectForm extends Form {
    private final ITextBox projectNameTextField = getElementFactory().getTextBox(By.id("projectName"), "Project name text field");
    private final IButton saveProjectButton = getElementFactory().getButton(By.xpath("//button[text()='Cancel']/preceding-sibling::button"), "Save project button");
    private final ILabel successMessage = getElementFactory().getLabel(By.xpath("//div[contains(@class,'alert-success')]"), "Success message");

    public AddProjectForm() {
        super(By.id("addProject"), "Add project form");
    }

    public void inputProjectName(String projectName) {
        projectNameTextField.type(projectName);
    }

    public void clickSaveProjectButton() {
        saveProjectButton.state().isClickable();
        saveProjectButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.state().isDisplayed();
    }
}