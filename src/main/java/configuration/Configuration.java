package configuration;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:runConfiguration.properties",
        "classpath:environment.properties"})
public interface Configuration extends Config {
    @Key("browser.name")
    String browserName();

    @Key("browser.width")
    int browserWidth();

    @Key("browser.height")
    int browserHeight();

    @Key("selenium.version")
    String seleniumVersion();

    @Key("homepage.url")
    String homepageUrl();

    @Key("meta.filters")
    String metaFilters();
}
