package framework;

import org.aeonbits.owner.ConfigFactory;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class JBehaveStoriesRunner extends JUnitStories {
    configuration.Configuration cfg = ConfigFactory.create(configuration.Configuration.class);

    @Override
    protected List<String> storyPaths() {
        configuredEmbedder().useMetaFilters(asList(cfg.metaFilters().split(",")));

        return new StoryFinder().findPaths(
                codeLocationFromClass(this.getClass()).getFile(), "**/**/resources/stories/*.story",
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

    @Override
    @Test
    public void run(){
        System.out.println(cfg.metaFilters());
        System.out.println();
        super.run();
    }
}
