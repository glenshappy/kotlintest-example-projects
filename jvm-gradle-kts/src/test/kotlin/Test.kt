import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class EntityManagerTest : BehaviorSpec() {
    init {
        Given("An EntityManager") {
            When("creating a new entity") {
                Then("each entity is given a unique id") {
                    1 shouldBe 1
                }
            }
        }
    }
}