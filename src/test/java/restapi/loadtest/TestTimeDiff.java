package restapi.loadtest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import restapi.loadtest.util.TimeDifference;

public class TestTimeDiff {

	@Test
	public void timeDiff() {
		
		TimeDifference td = new TimeDifference();
	
		assertEquals(3600, td.diffSecInstance("2019-07-07T15:41:00Z", "2019-07-07T16:41:00Z"));
	}
}
