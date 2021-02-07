//Order.groovy
// package statement should be the very first executable statement in any script
// packaging helps us to organize the classes into a related folder
package com.javacodegeeks.example.groovy.scripting

/**
  * A POGO (Plain Old Groovy Object) used as a DTO (Data Transfer Object)
  * or a BO (Business Object) which will carry the essential particulars 
  * of an Order
  */
class Order         
{      
    /** Self explanining fields and the default values for the few */
    //unique value from Database to denote a particular order
    def id = 0 
    def customerName, country='India', price
    def currency='INR', paymentMode='Cash'
    def orderDate // will be the current time in DB during insert
         
    /**
     * A method to format the value with the specified pattern (format),
     * useful in having a fixed width while displaying in Console
     */
    def String format(format, value)
    {
        String.format(format, value)
    }

    /**
     * A method to parse a line of text and initialize an Order instance
     * with the parsed tokens
     */
    def initOrder(strAsCSV)
    {
        // tokenize() will split the line of text into tokens, and trimmed to 
        // remove the extra spaces if any
        // the tokens are assigned to the variables in order - as per 
        // the declaration on the left side

        def(nameParsed, countryParsed, priceParsed, currencyParsed, modeParsed) = strAsCSV.tokenize("|")*.trim()    
        
        this.customerName=nameParsed
        this.country=countryParsed
        this.price=priceParsed
        this.currency=currencyParsed
        this.paymentMode=modeParsed

        return this
    }

    /**
      * An overridden toString() method of this Order class to have a 
      * meaningful display wherever it is invoked (which otherwise
      * will be a typical hashcode and the classname)
      */
    def String toString()  
    {                 
        //preparing the output in a fixed width format via format() method defined above
        def output = String.format("%-15s", customerName) + " | "   + 
            String.format("%-10s", country) + " | " + String.format("%-8s", price) + " | " + 
            String.format("%-8s", currency) + " | " + String.format("%-12s", paymentMode) + " | " 

        // add the OrderDate in the output Data if is not null
        if(orderDate!=null && orderDate.trim().length()>0)
            output += String.format("%-20s", orderDate) + " | "

        // add the Id if it is valid (not zero - meaning it was inserted in the database)
        if(id!=0)
            output = String.format("%-5s", id) + " | " + output

        output
      }          
}