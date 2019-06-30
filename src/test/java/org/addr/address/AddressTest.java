package org.addr.address;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AddressTest
{

    private String newAddressLineOne   = "Address Line One";   // There is currently no validation on this field
    private String newAddressLineTwo   = "Address Line Two";   // There is currently no validation on this field
    private String newAddressLineThree = "Address Line Three"; // There is currently no validation on this field
    private String newAddressCity      = "City";               // There is currently no validation on this field
    private String newAddressState     = "State";              // There is currently no validation on this field
    private String newAddressZip       = "Zip";                // There is currently no validation on this field
    private String newAddressCountry   = "Country";            // There is currently no validation on this field

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

        address.setLineOne ( this.newAddressLineOne );
        address.setLineTwo ( this.newAddressLineTwo );
        address.setLineThree ( this.newAddressLineThree );
        address.setCity ( this.newAddressCity );
        address.setState ( this.newAddressState );
        address.setZip ( this.newAddressZip );
        address.setCountry ( this.newAddressCountry );

        this.assertEqualsFields ( address );
    }

    @Test
    public void testConstructor ( )
    {
        Address address = new Address ( this.newAddressLineOne, this.newAddressLineTwo, this.newAddressLineThree,
                this.newAddressCity, this.newAddressState, this.newAddressZip, this.newAddressCountry );

        this.assertEqualsFields ( address );
    }

    /**
     * Compares all fields to what is in the supplied address object.
     * 
     * @param address
     */
    private void assertEqualsFields ( Address address )
    {
        assertEquals ( this.newAddressLineOne, address.getLineOne ( ) );
        assertEquals ( this.newAddressLineTwo, address.getLineTwo ( ) );
        assertEquals ( this.newAddressLineThree, address.getLineThree ( ) );
        assertEquals ( this.newAddressCity, address.getCity ( ) );
        assertEquals ( this.newAddressState, address.getState ( ) );
        assertEquals ( this.newAddressZip, address.getZip ( ) );
        assertEquals ( this.newAddressCountry, address.getCountry ( ) );
    }
}
