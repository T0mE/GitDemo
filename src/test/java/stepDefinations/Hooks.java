package stepDefinations;


import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {

        StepDefination stepDefination = new StepDefination();
        if (StepDefination.place_id == null) {
            stepDefination.add_place_payload_with("Shetty", "French", "Asia");
            stepDefination.user_calls_with_http_request("AddPlaceAPI", "POST");
            stepDefination.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
        }

    }
}
