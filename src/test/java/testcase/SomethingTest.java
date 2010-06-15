/* Copyright (c) 2009 - 2010 - www.geo-solutions.it. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package testcase;

import org.geoserver.data.test.MockData;
import org.geoserver.test.GeoServerAbstractTestSupport;

public class SomethingTest extends GeoServerAbstractTestSupport {
	
    @Override
    public MockData buildTestData() throws Exception {
        // create the data directory
	MockData dataDirectory = new MockData();
	return dataDirectory;
     }
    
    public void testDummy(){
    }
    
}
