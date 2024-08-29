#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The entry point of the Spring Boot application.
 * 
 * This starts the project in production mode and needs a "priming build": mvn package. 
 * For development mode, use DevModeApplication from the src/test/ directory instead.
 */
@SpringBootApplication
public class Application {

    // This method is for "production mode server" and might need a priming
    // build (mvn package) to be run directly. Use DevModeApplication 
    // (in src/test/java) during development to enable Livereload & Copilot
    public static void main(String[] args) {
        enforceProdcutionMode();
        SpringApplication.run(Application.class, args);
    }

    /**
     * This method enforces that the application can be started in production mode
     * and if not, exits the application with a meaningful error message.
     * Hoping this to be part of Vaadin in the future releases...
     */
    private static void enforceProdcutionMode() {
        InputStream resourceAsStream = Application.class.getResourceAsStream("/META-INF/VAADIN/config/flow-build-info.json");
        try {
            String s = new String(resourceAsStream.readAllBytes());
            if(!s.contains("\"productionMode\": true")) {
                throw new RuntimeException("Production bundle not available!!!");
            }
        } catch (Exception ex) {
            System.out.println("Production bundle not available. Exiting...");
            System.out.println("Production mode needs Vaadin plugin, usually triggered with e.g.: mvn package");
            System.out.println("If you are trying to launch in development mode, try the application class in src/test instead..");
            System.exit(1);
        }
    }
}
