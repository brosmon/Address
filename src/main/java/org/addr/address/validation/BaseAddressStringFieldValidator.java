package org.addr.address.validation;

import org.addr.address.Address;
import org.addr.address.AddressField;

/**
 * Since all Address fields currently Strings, this is the only base Field
 * validator needed. If other types are added in the future a typed validator
 * should be created for that type.
 *
 */
public class BaseAddressStringFieldValidator extends AbstractFieldValidator < String >
{

    protected BaseAddressStringFieldValidator ( AddressField field, Address address )
    {
        super ( field, address );
    }

    @Override
    public boolean validate ( String newValue )
    {
        // Just return true because I really just wanted to add the String type.
        // We will begin the validation assuming it is valid.
        return true;
    }
}
