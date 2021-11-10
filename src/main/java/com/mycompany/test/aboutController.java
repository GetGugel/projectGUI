
package com.mycompany.test;

import java.io.IOException;
import javafx.fxml.FXML;

public class aboutController {
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}

