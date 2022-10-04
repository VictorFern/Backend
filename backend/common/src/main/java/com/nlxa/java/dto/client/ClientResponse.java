package com.nlxa.java.dto.client;
import com.nlxa.java.domain.Client;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ClientResponse {
    private String id;
    private String name;
    private String lastname;

    public ClientResponse(Client client) {
        toClientResponse(client);

    }
    public void toClientResponse(Client client) {
        setId(client.getClientId());
        setName(client.getName());
        setLastname(client.getLastName());
    }
}
