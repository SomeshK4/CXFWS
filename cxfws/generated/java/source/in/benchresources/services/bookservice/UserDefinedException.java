
package in.benchresources.services.bookservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-12-16T16:45:07.578+05:30
 * Generated source version: 3.0.2
 */

@WebFault(name = "UserDefinedFault", targetNamespace = "http://benchresources.in/entities/Book")
public class UserDefinedException extends Exception {
    
    private in.benchresources.entities.book.UserDefinedFault userDefinedFault;

    public UserDefinedException() {
        super();
    }
    
    public UserDefinedException(String message) {
        super(message);
    }
    
    public UserDefinedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserDefinedException(String message, in.benchresources.entities.book.UserDefinedFault userDefinedFault) {
        super(message);
        this.userDefinedFault = userDefinedFault;
    }

    public UserDefinedException(String message, in.benchresources.entities.book.UserDefinedFault userDefinedFault, Throwable cause) {
        super(message, cause);
        this.userDefinedFault = userDefinedFault;
    }

    public in.benchresources.entities.book.UserDefinedFault getFaultInfo() {
        return this.userDefinedFault;
    }
}