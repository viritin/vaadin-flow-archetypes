#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.inject.Inject;

/**
 * The main view contains a simple label element and a template element.
 */
@Route
@HtmlImport("css/shared-styles.html")
public class MainView extends VerticalLayout {

    @Inject
    private MessageBean messageBean;

    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show(messageBean.getMessage()));
        add(button);
    }

}
