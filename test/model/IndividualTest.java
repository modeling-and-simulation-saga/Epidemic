package model;

import java.util.List;
import myLib.utils.Utils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tadaki
 */
public class IndividualTest {

    double beta = 0.5;
    double gamma = 0.5;

    /**
     * Test of getNextState method, of class Individual.
     */
    @Test
    public void testEvalNextState1() {
        System.out.println("evalNextState S->S");
        List<Individual> neighbours = Utils.createList();
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.I));
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.S));
        double r = 0.;
        Individual instance = new Individual(Individual.State.S);
        Individual.State expResult = Individual.State.R;
        Individual.State result = instance.evalNextState(neighbours, beta, gamma, r);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvalNextState2() {
        System.out.println("evalNextState S->I");
        List<Individual> neighbours = Utils.createList();
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.I));
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.S));
        double r = 0.;
        Individual instance = new Individual(Individual.State.S);
        Individual.State expResult = Individual.State.R;
        Individual.State result = instance.evalNextState(neighbours, beta, gamma, r);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvalNextState3() {
        System.out.println("evalNextState I->I");
        List<Individual> neighbours = Utils.createList();
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.I));
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.S));
        double r = 0.;
        Individual instance = new Individual(Individual.State.I);
        Individual.State expResult = Individual.State.R;
        Individual.State result = instance.evalNextState(neighbours, beta, gamma, r);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvalNextState4() {
        System.out.println("evalNextState I->R");
        List<Individual> neighbours = Utils.createList();
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.I));
        neighbours.add(new Individual(Individual.State.S));
        neighbours.add(new Individual(Individual.State.S));
        double r = 0.;
        Individual instance = new Individual(Individual.State.I);
        Individual.State expResult = Individual.State.R;
        Individual.State result = instance.evalNextState(neighbours, beta, gamma, r);
        assertEquals(expResult, result);
    }
}
