package org.addr.address;

public class Address
{
    private String lineOne, lineTwo, lineThree, city, state, zip, country = null;

    /**
     * Default no-args constructor
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
    public Address ( String lineOne, String lineTwo, String lineThree, String city, String state, String zip )
    {
        super ( );
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.city = city;
        this.state = state;
        this.zip = zip;
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

}
