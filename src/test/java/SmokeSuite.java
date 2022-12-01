import framework.JBehaveStoriesRunner;

import java.util.ArrayList;
import java.util.List;

public class SmokeSuite extends JBehaveStoriesRunner {
    @Override
    protected List<String> includeStories() {
        List<String> include = new ArrayList<>();
        include.add("**/stories/Login.story");
        return include;
    }

    @Override
    protected List<String> excludeStories() {
        List<String> exclude = new ArrayList<>();
        return exclude;
    }

    @Override
    public void run() {
        super.run();
    }

}
