package htmlelements;

import org.openqa.selenium.WebDriver;

public class MyPageFactoryProvider {

    private static MyPageFactory INSTANCE;

    private MyPageFactoryProvider() {}

    public static MyPageFactory getInstance(WebDriver driver) {
        if(INSTANCE == null) {
            INSTANCE = new MyPageFactory(driver);
        }
        return INSTANCE;
    }

    public static void deleteInstance(WebDriver driver){
        INSTANCE=new MyPageFactory(driver);
    }

}
