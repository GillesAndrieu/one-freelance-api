package com.freelance.persistence.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.freelance.model.auth.Profile;

public class ProfileConverter extends JsonConverter<Profile> {

    ProfileConverter(ObjectMapper objectMapper) {
        super(objectMapper, Profile.class);
    }
}
