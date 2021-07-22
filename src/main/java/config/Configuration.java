package config;

import browser.BrowserType;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:application.properties")
public interface Configuration extends Config {

    String applicationMainUrl();
    BrowserType browserType();

}