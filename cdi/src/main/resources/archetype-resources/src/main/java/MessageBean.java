#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.vaadin.cdi.annotation.VaadinSessionScoped;

/**
 * Data provider bean scoped for each user session.
 */
@VaadinSessionScoped
public class MessageBean {

    private int counter;
    /**
     * Gets message data.
     *
     * @return a message
     */
    public String getMessage() {
        return new StringBuilder("Message requested ").append(++counter).append(" times.").toString();
    }
}
