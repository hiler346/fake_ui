package TestsFake.TEST.HelpModels;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FakeXPath {

    public SelenideElement Login =  $(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/auth-modal-react[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));

    public SelenideElement Password = $(By.xpath( "//body/div[1]/div[1]/div[1]/div[1]/auth-modal-react[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]"));

    public SelenideElement ButtonEnter = $(By.xpath( "//button[contains(text(),'Войти с адресом email')]"));

    public SelenideElement ClickGame = $(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/button[1]"));

    public SelenideElement ClickMatch = $(By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));

    public SelenideElement ClickHub = $(By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/input[1]"));

    public SelenideElement ClickTeams = $(By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/input[1]"));



}
