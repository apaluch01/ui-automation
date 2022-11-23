package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class TestSteps {
    @Given("1")
    public void one() {
        System.out.println(1);
    }

    @When("2")
    public void two() {
        System.out.println(2);
    }

    @Then("3")
    public void three() {
        int one = 3;
        int two = 3;
        System.out.println(3);
        Assert.assertEquals(one, two);
    }
}
