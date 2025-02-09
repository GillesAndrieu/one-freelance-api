package com.freelance.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.freelance.model.auth.Profile;
import com.freelance.persistence.converter.ProfileConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerEntity implements Serializable {

    @Id
    private UUID id;

    @Convert(converter = ProfileConverter.class)
    @Column(columnDefinition = "jsonb")
    private Profile profile;
}
