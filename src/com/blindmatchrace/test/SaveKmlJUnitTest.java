package com.blindmatchrace.test;

import junit.framework.TestCase;
import com.blindmatchrace.classes.*;
import android.test.mock.MockContext;

public class SaveKmlJUnitTest extends TestCase {

	public SaveKmlJUnitTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSaveKmlTask1(){
		MockContext mContext = new MockContext();
		SaveKmlTask SKT = new SaveKmlTask(mContext, "testKML1", "Sailoruser2004_2004_2004", 1);
		try {
			SKT.execute(C.URL_HISTORY_TABLE, C.URL_CLIENTS_TABLE);
		} catch (Exception e) {
			fail("Throw Exception");
		}
	}

	public void testSaveKmlTask2() throws Exception{
		MockContext mContext = new MockContext();
		SaveKmlTask SKT2 = new SaveKmlTask(mContext, "testKML2", "Sailoruser2004_2004_2004", 2);
		try {
			SKT2.execute(C.URL_HISTORY_TABLE, C.URL_CLIENTS_TABLE);
		} catch (Exception e) {
			
			fail("Throw Exception");
		}
		

	}

}