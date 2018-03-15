package org.wecancodeit.columbus.citiesfishes;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest {

	@Test
	public void stateShouldHaveAbbreviation() {
		State underTest = new State("OH");
		
		String abbr = underTest.getAbbreviation();
		
		assertThat(abbr, is("OH"));
	}
		
}
