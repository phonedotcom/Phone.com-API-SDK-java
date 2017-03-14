/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateSmsParams;
import io.swagger.client.model.ListSms;
import io.swagger.client.model.SmsFull;

/**
 * API tests for SmsApi
 */
public class SmsApiTest {

    private final SmsApi api = new SmsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Send a SMS to one or a group of recipients
     *
     * For more on the input fields, see Intro to SMS.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountSmsTest() throws ApiException {
        Integer accountId = 1315091;
        CreateSmsParams data = new CreateSmsParams();
        data.setFrom("+16309624775");
        data.setText("Another message for create");
        data.setTo("+12019570328");
        SmsFull response = api.createAccountSms(accountId, data);
        assertNotNull(response);
    }
    
    /**
     * Show details of an individual SMS
     *
     * This service shows the details of an individual sms. See Intro to SMS for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountSmsTest() throws ApiException {
        Integer accountId = null;
        Integer smsId = null;
        // SmsFull response = api.getAccountSms(accountId, smsId);

        // TODO: test validations
    }
    
    /**
     * Get a list of SMS messages for an account
     *
     * See Intro to SMS for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountSmsTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        String filtersDirection = null;
        String filtersFrom = null;
        String sortId = null;
        String sortCreatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListSms response = api.listAccountSms(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields);
        assertNotNull(response.getFilters());
        assertNotNull(response.getItems());
        assertNotNull(response.getLimit());
        assertNotNull(response.getOffset());
        assertNotNull(response.getSort());
        assertNotNull(response.getTotal());
        // TODO: test validations
    }
    
}
