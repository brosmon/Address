package org.addr.address;

public class Address
{
    private String lineOne, lineTwo, lineThree, city, state, zip, country = null;

    /**
     * Default no-args constructor. All fields will be null after the object is
     * initialized
     */
    public Address ( )
    {
        super ( );
    }

    /**
     * Constructor containing all fields
     *
     * @param lineOne
     * @param lineTwo
     * @param lineThree
     * @param city
     * @param state
     * @param zip
     */
    public Address ( String lineOne, String lineTwo, String lineThree, String city, String state, String zip,
            String country )
    {
        super ( );
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    /**
     * Gets the lineOne
     *
     * @return the lineOne
     */
    public String getLineOne ( )
    {
        return this.lineOne;
    }

    /**
     * Sets the lineOne
     *
     * @param lineOne
     *            the lineOne to set
     */
    public void setLineOne ( String lineOne )
    {
        this.lineOne = lineOne;
    }

    /**
     * Gets the lineTwo
     *
     * @return the lineTwo
     */
    public String getLineTwo ( )
    {
        return this.lineTwo;
    }

    /**
     * Sets the lineTwo
     *
     * @param lineTwo
     *            the lineTwo to set
     */
    public void setLineTwo ( String lineTwo )
    {
        this.lineTwo = lineTwo;
    }

    /**
     * Gets the lineThree
     *
     * @return the lineThree
     */
    public String getLineThree ( )
    {
        return this.lineThree;
    }

    /**
     * Sets the lineThree
     *
     * @param lineThree
     *            the lineThree to set
     */
    public void setLineThree ( String lineThree )
    {
        this.lineThree = lineThree;
    }

    /**
     * Gets the city
     *
     * @return the city
     */
    public String getCity ( )
    {
        return this.city;
    }

    /**
     * Sets the city
     *
     * @param city
     *            the city to set
     */
    public void setCity ( String city )
    {
        this.city = city;
    }

    /**
     * Gets the state
     *
     * @return the state
     */
    public String getState ( )
    {
        return this.state;
    }

    /**
     * Sets the state
     *
     * @param state
     *            the state to set
     */
    public void setState ( String state )
    {
        this.state = state;
    }

    /**
     * Gets the zip
     *
     * @return the zip
     */
    public String getZip ( )
    {
        return this.zip;
    }

    /**
     * Sets the zip
     *
     * @param zip
     *            the zip to set
     */
    public void setZip ( String zip )
    {
        this.zip = zip;
    }

    /**
     * Gets the country
     *
     * @return the country
     */
    public String getCountry ( )
    {
        return this.country;
    }

    /**
     * Sets the country
     *
     * @param country
     *            the country to set
     */
    public void setCountry ( String country )
    {
        this.country = country;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals ( Object obj )
    {
        boolean equal = false;
        if ( obj instanceof Address )
        {
            equal = this.equals ( ( Address ) obj );
        }

        return equal;
    }

    /**
     * Compares the values in the provided address to determine if it is equal to
     * this address
     *
     * @param address
     * @return
     */
    public boolean equals ( Address address )
    {
        boolean equals = true;

        // Because we do not know if the fields will be populated, we need to check
        // Each one individually so we do not blow up at run time.
        // Because this is the first comparison, equals will always be true
        // So do not include the equals check
        if ( this.lineOne != null )
        {
            equals &= this.lineOne.equalsIgnoreCase ( address.getLineOne ( ) );
        }
        else
        {
            equals &= address.getLineOne ( ) == null;
        }

        if ( equals && this.lineTwo != null )
        {
            equals &= this.lineTwo.equalsIgnoreCase ( address.getLineTwo ( ) );
        }
        else if ( equals )
        {
            equals &= address.getLineTwo ( ) == null;
        }

        if ( equals && this.lineThree != null )
        {
            equals &= this.lineThree.equalsIgnoreCase ( address.getLineThree ( ) );
        }
        else if ( equals )
        {
            equals &= address.getLineThree ( ) == null;
        }

        if ( equals && this.city != null )
        {
            equals &= this.city.equalsIgnoreCase ( address.getCity ( ) );
        }
        else if ( equals )
        {
            equals &= address.getCity ( ) == null;
        }

        if ( equals && this.state != null )
        {
            equals &= this.state.equalsIgnoreCase ( address.getState ( ) );
        }
        else if ( equals )
        {
            equals &= address.getState ( ) == null;
        }

        if ( equals && this.zip != null )
        {
            equals &= this.zip.equalsIgnoreCase ( address.getZip ( ) );
        }
        else if ( equals )
        {
            equals &= address.getZip ( ) == null;
        }

        if ( equals && this.country != null )
        {
            equals &= this.country.equalsIgnoreCase ( address.getCountry ( ) );
        }
        else if ( equals )
        {
            equals &= address.getCountry ( ) == null;
        }

        return equals;
    }
}
