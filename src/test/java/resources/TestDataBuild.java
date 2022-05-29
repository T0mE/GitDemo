package resources;

import pojo.AddPlace;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public AddPlace addPlacePayLoad(String name, String language, String address) {
        AddPlace addPlace = new AddPlace();
        addPlace.setAccuracy(50);
        addPlace.setAddress(address);
        addPlace.setPhone_number("+(91) 983 893 3937");
        addPlace.setName(name);
        addPlace.setWebsite("http://google.com");
        addPlace.setLanguage(language);
        List<String> list = new ArrayList<>();
        list.add("shoe park");
        list.add("shop");
        addPlace.setTypes(list);
        Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        addPlace.setLocation(location);
        return addPlace;
    }

    public String deletePlacePayload(String placeId) {
        return "{\r\n   \"place_id\":\"" + placeId + "\"\r\n}";
    }
}
