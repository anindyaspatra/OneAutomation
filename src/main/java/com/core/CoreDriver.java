package com.core;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class CoreDriver {
//Static Final Keywords for reading data from config.properties file
    private static final String BROWSER = "browser";
    private static final String URL = "url";
    private static final String PAGE_LOAD_TIMEOUT = "pageloadtimeout";
    private static final String CHROME = "Chrome";
    private static final String FIREFOX = "Firefox";
    private static final String IEXPLORER = "InternetExplorer";
    private static final String SAFARI = "Safari";
    private static final String HEADLESS = "headless";

    public static WebDriver driver;
    public static HashMap<String, String> configProp;


}
