/* *********************************************************************** *
 * project: org.matsim.*												   *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2008 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package org.matsim.run;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.matsim.api.core.v01.TransportMode;
import org.matsim.core.config.Config;
import org.matsim.core.controler.OutputDirectoryHierarchy.OverwriteFileSetting;
import org.matsim.testcases.MatsimTestUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author nagel
 *
 */
public class RunMatsim4MunichTest{
	
	@Rule public MatsimTestUtils utils = new MatsimTestUtils() ;

	@Test
	public final void test() {
		try {
			RunMatsim4Munich matsim = new RunMatsim4Munich( new String [] {"../../shared-svn/projects/matsim-munich/scenarios/v2/config_1pct_v2_WOModeChoice_reduced.xml"} ) ;
			Config config = matsim.prepareConfig() ;
			config.controler().setWriteEventsInterval(1); // so we get an output_events file
			config.controler().setLastIteration(1);
			config.controler().setOutputDirectory( utils.getOutputDirectory() );
			matsim.run() ;
		} catch ( Exception ee ) {
			Logger.getLogger(this.getClass()).fatal("there was an exception: \n" + ee ) ;
			ee.printStackTrace();
			// if one catches an exception, then one needs to explicitly fail the test:
			Assert.fail();
		}
	}
	@Test
	public final void test2() {
		try {
			RunMatsim4Munich matsim = new RunMatsim4Munich( new String [] {"../../shared-svn/projects/matsim-munich/scenarios/v2/config_1pct_v2_WModeChoice_reduced.xml"} ) ;
			Config config = matsim.prepareConfig() ;
			config.controler().setWriteEventsInterval(1); // so we get an output_events file
			config.controler().setLastIteration(1);
			config.controler().setOutputDirectory( utils.getOutputDirectory() );
			matsim.run() ;
		} catch ( Exception ee ) {
			Logger.getLogger(this.getClass()).fatal("there was an exception: \n" + ee ) ;
			ee.printStackTrace();
			// if one catches an exception, then one needs to explicitly fail the test:
			Assert.fail();
		}


	}

}
