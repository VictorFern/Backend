package com.nlxa.java.dto.client;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ClientListResponse {
    private List<ClientResponse> clientResponseList;

    public ClientListResponse() {
        this.clientResponseList = new ArrayList<>();
    }

    public ClientListResponse(List<ClientResponse> clientResponseList) {
        this.clientResponseList = clientResponseList;
    }
}
