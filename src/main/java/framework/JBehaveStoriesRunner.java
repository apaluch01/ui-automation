package framework;

import configuration.WebDriverFactory;
import org.aeonbits.owner.ConfigFactory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;
import steps.*;

import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class JBehaveStoriesRunner extends JUnitStories {
    configuration.Configuration cfgOwn = ConfigFactory.create(configuration.Configuration.class);
    Embedder embedder;

    WebDriverFactory driver = new WebDriverFactory();

    protected List<String> storyPaths() {
        embedder.useMetaFilters(asList(cfgOwn.metaFilters().split(",")));

        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), cfgOwn.storiesToRun(), "");
    }

    public Configuration configuration(){
        return new MostUsefulConfiguration().
                useStoryLoader(new LoadFromClasspath(this.getClass())).
                useStoryReporterBuilder(new StoryReporterBuilder().withCodeLocation(CodeLocations.codeLocationFromClass(JBehaveStoriesRunner.class))
                        .withDefaultFormats().withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName())
                        .withFailureTrace(true).withFailureTraceCompression(true));
    }

    public InjectableStepsFactory stepsFactory(){
        return new InstanceStepsFactory(configuration(), new DriverSteps());
    }

    @Test
    @Override
    public void run() {
        embedder = configuredEmbedder();
        embedder.configuration();
        embedder.useCandidateSteps(stepsFactory().createCandidateSteps());
        embedder.runStoriesAsPaths(storyPaths());
    }
}
