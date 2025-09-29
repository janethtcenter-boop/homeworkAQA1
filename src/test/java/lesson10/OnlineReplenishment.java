package lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class OnlineReplenishment {
    By phoneLocator = By.id("phone");
    By amountLocator = By.id("amount");
    By emailLocator = By.id("email");
    private WebDriver driver;

    public void ConfirmationDialog(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public OnlineReplenishment(WebDriver driver) {
        this.driver = driver;
    }
    public OnlineReplenishment typePhone(String phone) {
        driver.findElement(phoneLocator).sendKeys(phone);
        return this;
    }
    public OnlineReplenishment typeAmount(String amount) {
        driver.findElement(amountLocator).sendKeys(amount);
        return this;
    }
    public OnlineReplenishment typeEmail(String email) {
        driver.findElement(emailLocator).sendKeys(email);
        return this;
    }
    public void ServicesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getServicesFieldText() {
        Label servicesField = null;
        return servicesField.getText().trim();
    }

    public String getPhone() {
        Label phoneField = null;
        return phoneField.getText().trim();
    }

    public String getAmount() {
        Label amountField = null;
        return amountField.getText().trim();
    }

    public String getEmail() {
        Label emailField = null;
        return emailField.getText().trim();
    }

    public String getHomeWiFiText() {
        Label homeWiFiField = null;
        return homeWiFiField.getText().trim();
    }

    public String getInstallmentPlan() {
        Label installmentPlanField = null;
        return installmentPlanField.getText().trim();
    }

    public String getAccountNumberStartsWith44() {
        Label accountNumberStartsWith44Field = null;
        return accountNumberStartsWith44Field.getText().trim();
    }

    public String getLiability() {
        Label liabilityField = null;
        return liabilityField.getText().trim();
    }

    public String getAccountNumberStartsWith2073() {
        Label accountNumberStartsWith2073Field = null;
        return accountNumberStartsWith2073Field.getText().trim();
    }
    public String getUnfilledFieldsLabel() {
        Label unfilledFieldLabel = null;
        return unfilledFieldLabel.getText().trim();
    }
}
