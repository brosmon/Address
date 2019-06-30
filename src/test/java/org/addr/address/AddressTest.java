package org.addr.address;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AddressTest
{

    private static final String ADDRESS_LINE_ONE   = "Address Line One";
    private static final String ADDRESS_LINE_TWO   = "Address Line Two";
    private static final String ADDRESS_LINE_THREE = "Address Line Three";
    private static final String ADDRESS_CITY       = "City";
    private static final String ADDRESS_STATE      = "State";
    private static final String ADDRESS_ZIP        = "Zip";
    private static final String ADDRESS_COUNTRY    = "Country";

    @Test
    public void testNoArgsConstructor ( )
    {
        Address address = new Address ( );

        // All fields should be null once initialized
        assertNull ( address.getLineOne ( ) );
        assertNull ( address.getLineTwo ( ) );
        assertNull ( address.getLineThree ( ) );
        assertNull ( address.getCity ( ) );
        assertNull ( address.getState ( ) );
        assertNull ( address.getZip ( ) );
        assertNull ( address.getCountry ( ) );
    }

    @Test
    public void testAllSetters ( )
    {

        Address address = new Address ( );

        address.setLineOne ( ADDRESS_LINE_ONE );
        address.setLineTwo ( ADDRESS_LINE_TWO );
        address.setLineThree ( ADDRESS_LINE_THREE );
        address.setCity ( ADDRESS_CITY );
        address.setState ( ADDRESS_STATE );
        address.setZip ( ADDRESS_ZIP );
        address.setCountry ( ADDRESS_COUNTRY );

        this.assertEqualsFields ( address );
    }

    @Test
    public void testConstructor ( )
    {
        Address address = new Address ( ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, ADDRESS_LINE_THREE, ADDRESS_CITY,
                ADDRESS_STATE, ADDRESS_ZIP, ADDRESS_COUNTRY );

        this.assertEqualsFields ( address );
    }

    @Test
    public void testEquals ( )
    {
        // This is the address we will use for all comparisons
        Address primaryAddress = new Address ( ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, ADDRESS_LINE_THREE, ADDRESS_CITY,
                ADDRESS_STATE, ADDRESS_ZIP, ADDRESS_COUNTRY );

        Address testEqualAddress = new Address ( ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, ADDRESS_LINE_THREE, ADDRESS_CITY,
                ADDRESS_STATE, ADDRESS_ZIP, ADDRESS_COUNTRY );

        Address testEmptyAddress = new Address ( );

        // These values should equal
        assertEquals ( primaryAddress, testEqualAddress );

        // The equals method should be able to handle receiving a null object
        assertNotEquals ( primaryAddress, ( Address ) null );

        // The primary address should not equal the empty address
        assertNotEquals ( primaryAddress, testEmptyAddress );

        // And the Empty address should not equal the Primary address
        // And it should be handled gracefully (i.e. no null pointer exception)
        assertNotEquals ( testEmptyAddress, primaryAddress );

        // Two empty addresses should be equal
        assertEquals ( testEmptyAddress, testEmptyAddress );

        // Now we will use the test address, and iterate through, changing each
        // field to a new value, to ensure we do not equal.
        // We will then set the field back to it's original value and ensure the two
        // Addresses DO equal before moving on to the next field.

        // AddressLineOne
        testEqualAddress.setLineOne ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setLineOne ( ADDRESS_LINE_ONE );
        assertEquals ( primaryAddress, testEqualAddress );

        // AddressLineTwo
        testEqualAddress.setLineTwo ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setLineTwo ( ADDRESS_LINE_TWO );
        assertEquals ( primaryAddress, testEqualAddress );

        // AddressLineThree
        testEqualAddress.setLineThree ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setLineThree ( ADDRESS_LINE_THREE );
        assertEquals ( primaryAddress, testEqualAddress );

        // City
        testEqualAddress.setCity ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setCity ( ADDRESS_CITY );
        assertEquals ( primaryAddress, testEqualAddress );

        // State
        testEqualAddress.setState ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setState ( ADDRESS_STATE );
        assertEquals ( primaryAddress, testEqualAddress );

        // Zip
        testEqualAddress.setZip ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setZip ( ADDRESS_ZIP );
        assertEquals ( primaryAddress, testEqualAddress );

        // Country
        testEqualAddress.setCountry ( "New Value" );
        assertNotEquals ( primaryAddress, testEqualAddress );
        testEqualAddress.setCountry ( ADDRESS_COUNTRY );
        assertEquals ( primaryAddress, testEqualAddress );

        // Now we will do the same thing as above, but set each field to null
        // For this test, we need to compare the two addresses both ways
        // AddressLineOne
        testEqualAddress.setLineOne ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setLineOne ( ADDRESS_LINE_ONE );
        assertEquals ( primaryAddress, testEqualAddress );

        // AddressLineTwo
        testEqualAddress.setLineTwo ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setLineTwo ( ADDRESS_LINE_TWO );
        assertEquals ( primaryAddress, testEqualAddress );

        // AddressLineThree
        testEqualAddress.setLineThree ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setLineThree ( ADDRESS_LINE_THREE );
        assertEquals ( primaryAddress, testEqualAddress );

        // City
        testEqualAddress.setCity ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setCity ( ADDRESS_CITY );
        assertEquals ( primaryAddress, testEqualAddress );

        // State
        testEqualAddress.setState ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setState ( ADDRESS_STATE );
        assertEquals ( primaryAddress, testEqualAddress );

        // Zip
        testEqualAddress.setZip ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setZip ( ADDRESS_ZIP );
        assertEquals ( primaryAddress, testEqualAddress );

        // Country
        testEqualAddress.setCountry ( null );
        assertNotEquals ( primaryAddress, testEqualAddress );
        assertNotEquals ( testEqualAddress, primaryAddress );
        testEqualAddress.setCountry ( ADDRESS_COUNTRY );
        assertEquals ( primaryAddress, testEqualAddress );
    }

    /**
     * Compares all fields to what is in the supplied address object.
     *
     * @param address
     */
    private void assertEqualsFields ( Address address )
    {
        assertEquals ( ADDRESS_LINE_ONE, address.getLineOne ( ) );
        assertEquals ( ADDRESS_LINE_TWO, address.getLineTwo ( ) );
        assertEquals ( ADDRESS_LINE_THREE, address.getLineThree ( ) );
        assertEquals ( ADDRESS_CITY, address.getCity ( ) );
        assertEquals ( ADDRESS_STATE, address.getState ( ) );
        assertEquals ( ADDRESS_ZIP, address.getZip ( ) );
        assertEquals ( ADDRESS_COUNTRY, address.getCountry ( ) );
    }
}
