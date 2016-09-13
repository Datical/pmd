/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.gherkin;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Language module for Gherkin.
 */
public class GherkinLanguageModule extends BaseLanguageModule {

    /** The name. */
    public static final String NAME = "Gherkin";
    /** The terse name. */
    public static final String TERSE_NAME = "gherkin";

    /**
     * Creates a new Gherkin Language Module instance.
     */
    public GherkinLanguageModule() {
        super(NAME, null, TERSE_NAME, null, "feature");
        addVersion("", null, true);
    }
}
