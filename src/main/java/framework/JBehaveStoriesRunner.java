package framework;

import org.aeonbits.owner.ConfigFactory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;
import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class JBehaveStoriesRunner extends JUnitStories {
    configuration.Configuration cfg = ConfigFactory.create(configuration.Configuration.class);

    @Override
    protected List<String> storyPaths() {
        configuredEmbedder().useMetaFilters(asList(cfg.metaFilters().split(",")));

        return new StoryFinder().findPaths(
                codeLocationFromClass(this.getClass()).getFile(), "src/main/resources/stories/*.story",
                "");
    }

    public Configuration configuration(){
        return new MostUsefulConfiguration().
                useStoryLoader(new LoadFromClasspath(this.getClass())).
                useStoryReporterBuilder(new StoryReporterBuilder());
    }

    public InjectableStepsFactory stepsFactory(){
        return new InstanceStepsFactory(configuration());
    }

    @Test
    public void run(){
        System.out.println(storyPaths());
        configuredEmbedder().runStoriesAsPaths(storyPaths());
    }
}
