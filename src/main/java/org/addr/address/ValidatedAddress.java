package org.addr.address;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.addr.validation.validator.Validator;

public class ValidatedAddress extends Address
{

    // Since all of the Address fields are Strings, just initialize as a String
    private Map < AddressField, Set < Validator < String > > > fieldValidators;

    /**
     *
     */
    public ValidatedAddress ( )
    {
        super ( );
        this.initValidators ( );
    }

    private void initValidators ( )
    {
        this.fieldValidators = new LinkedHashMap <> ( );

        // Iterate over all of the enumerated Address Fields and add them
        // To the validator set
        for ( AddressField field : AddressField.values ( ) )
        {
            this.fieldValidators.put ( field, new LinkedHashSet <> ( ) );
        }
    }

    /**
     * @param lineOne
     * @param lineTwo
     * @param lineThree
     * @param city
     * @param state
     * @param zip
     * @param country
     */
    public ValidatedAddress ( String lineOne, String lineTwo, String lineThree, String city, String state, String zip,
            String country )
    {
        super ( lineOne, lineTwo, lineThree, city, state, zip, country );
        this.initValidators ( );
    }

    // TODO: What to do if value is not valid? Probably throw an exception of some
    // sort...

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setLineOne(java.lang.String)
     */
    @Override
    public void setLineOne ( String lineOne )
    {
        if ( this.isValid ( AddressField.LINE_ONE, lineOne ) )
        {
            super.setLineOne ( lineOne );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setLineTwo(java.lang.String)
     */
    @Override
    public void setLineTwo ( String lineTwo )
    {
        if ( this.isValid ( AddressField.LINE_TWO, lineTwo ) )
        {
            super.setLineTwo ( lineTwo );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setLineThree(java.lang.String)
     */
    @Override
    public void setLineThree ( String lineThree )
    {
        if ( this.isValid ( AddressField.LINE_THREE, lineThree ) )
        {
            super.setLineThree ( lineThree );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setCity(java.lang.String)
     */
    @Override
    public void setCity ( String city )
    {
        if ( this.isValid ( AddressField.CITY, city ) )
        {
            super.setCity ( city );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setState(java.lang.String)
     */
    @Override
    public void setState ( String state )
    {
        if ( this.isValid ( AddressField.STATE, state ) )
        {
            super.setState ( state );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setZip(java.lang.String)
     */
    @Override
    public void setZip ( String zip )
    {
        if ( this.isValid ( AddressField.ZIP, zip ) )
        {
            super.setZip ( zip );
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.addr.address.Address#setCountry(java.lang.String)
     */
    @Override
    public void setCountry ( String country )
    {
        if ( this.isValid ( AddressField.COUNTRY, country ) )
        {
            super.setCountry ( country );
        }

    }

    private boolean isValid ( AddressField field, String value )
    {
        boolean valid = true;

        // Get all of the validators associated with this field
        Set < Validator < String > > validators = this.getValidators ( field );

        for ( Validator < String > validator : validators )
        {
            valid &= validator.validate ( value );
        }

        return valid;
    }

    private Set < Validator < String > > getValidators ( AddressField field )
    {
        return this.fieldValidators.get ( field );
    }

}
