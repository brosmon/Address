package org.addr.address.validation;

import org.addr.address.Address;
import org.addr.address.AddressField;
import org.addr.validation.validator.Validator;

/**
 *
 * Abstract Field Validator for when the field or full address is absolutely
 * needed Field during validation. For Example, there may be different logic for
 * validating a Zip Code depending on the country. This is not ideal, but the
 * current implementation does not allow for conditional validations. When that
 * functionality exists, this should be revisited to determine if it is still
 * needed.
 *
 */
public abstract class AbstractFieldValidator < T > implements Validator < T >
{
    private final AddressField field;
    private final Address      address;

    /**
     * Protected constructor for concrete implementations to use.
     * 
     * @param field
     * @param address
     */
    protected AbstractFieldValidator ( AddressField field, Address address )
    {
        this.field = field;
        this.address = address;
    }

    /**
     * Gets the field under validation
     *
     * @return
     */
    public AddressField getField ( )
    {
        return this.field;
    }

    /**
     * Gets the Address containing the field under validation
     *
     * @return
     */
    public Address getAddress ( )
    {
        return this.address;
    }
}
