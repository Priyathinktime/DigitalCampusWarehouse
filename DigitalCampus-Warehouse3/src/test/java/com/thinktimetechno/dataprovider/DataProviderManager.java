/*
 * Copyright (c) 2022. Anh Tester
 * Automation Framework Selenium
 */

package com.thinktimetechno.dataprovider;

import com.thinktimetechno.constants.FrameworkConstants;
import com.thinktimetechno.helpers.ExcelHelpers;
import com.thinktimetechno.helpers.Helpers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public final class DataProviderManager {

    private DataProviderManager() {
    }

    @Test(dataProvider = "getSignInDataHashTable")
    

    @DataProvider(name = "getSignInDataHashTable")
    public static Object[][] getSignInData() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "SignIn", 1, 2);
        System.out.println("getSignInData: " + data);
        return data;
    }

    @DataProvider(name = "getSignInDataHashTable2")
    public static Object[][] getSignInData2() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "SignIn", 2, 3);
        System.out.println("getSignInData: " + data);
        return data;
    }

    @DataProvider(name = "getClientDataHashTable", parallel = true)
    public static Object[][] getClientData() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Client", 1, 3);
        System.out.println("getClientData: " + data);
        return data;
    }

}
