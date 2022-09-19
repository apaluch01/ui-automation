import org.aeonbits.owner.ConfigFactory;

public class Main {
    public static void main(String args[]) {
        Configuration cfg = ConfigFactory.create(Configuration.class);

        System.out.println(cfg.browserName());
        System.out.println(cfg.browserWidth());
        System.out.println(cfg.browserHeight());
        System.out.println(cfg.seleniumVersion());
        System.out.println(cfg.homepageUrl());
    }
}
