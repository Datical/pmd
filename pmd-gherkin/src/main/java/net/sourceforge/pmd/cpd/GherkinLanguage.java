/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.cpd;

/**
 * Language implemention for Gherkin.
 * 
 * @author Zev Blut zb@ubit.com
 */
public class GherkinLanguage extends AbstractLanguage {

    /**
     * Creates a new Gherkin Language instance.
     */
    public GherkinLanguage() {
        super("Gherkin", "gherkin", new GherkinTokenizer(), ".feature");
    }
}
