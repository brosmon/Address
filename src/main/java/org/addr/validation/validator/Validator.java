package org.addr.validation.validator;

/**
 * A Validator interface. The single method validates the new value of an
 * object.
 *
 * @param T
 */
public interface Validator < T >
{
    /**
     * Validates the supplied value
     *
     * @param newValue
     * @return
     */
    boolean validate ( T newValue );
}
