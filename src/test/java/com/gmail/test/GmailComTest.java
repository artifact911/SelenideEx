package com.gmail.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class GmailComTest {

    @Test
    public void gmailLoginTest() throws FileNotFoundException {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "";
        Configuration.headless = true;


        //Умное ожидание у Selenide. По-умолчанию 4 сек. Поменяли на 10сек
        Configuration.timeout = 10000;

        WebDriverManager.firefoxdriver().setup();

        open("https://www.google.com/intl/ru/gmail/about/");

        File pdf = $("someXPath").download();
        $x("xPath").uploadFile(pdf);
        $x("").parent();
        $x("").closest("tr");
        $x("").find("tr");

        //instead of sendKeys() can use setValue(). working JS

    }
}
