package org.addr.address.validator;

/**
 * A Field Validator functional interface. The single method validates the new
 * value of the field. Implementations should be field-agnostic, and all logic
 * should be based solely on the new value on the new value. This validator can
 * then be added to 0 ... n fields and the validate method will be called when
 * attempting to set the value of the field.
 *
 */
public interface FieldValidator
{
    /**
     * Validates the supplied value
     * 
     * @param newValue
     * @return
     */
    boolean validate ( String newValue );
}
