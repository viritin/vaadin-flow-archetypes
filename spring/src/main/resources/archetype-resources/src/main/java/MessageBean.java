#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class MessageBean {

    public String getMessage() {
        return "Button was clicked at " + LocalTime.now();
    }
}
