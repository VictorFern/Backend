package com.nlxa.java.controller;

import com.nlxa.java.dto.client.ClientListResponse;
import com.nlxa.java.usecase.client.GetAllClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;
@Slf4j
@RestController
@RequestMapping(value = "/client")
public class ClientController {
    private GetAllClient getAllClient;


    @Autowired
    public ClientController(GetAllClient getAllClient) {

        this.getAllClient = getAllClient;

    }

    @GetMapping(value = "/all")
    public ResponseEntity<ClientListResponse> getAllClient(){
        log.info("Call to: ClientController.getAllClient()");
        ClientListResponse response = null;
        try {
            Future<ClientListResponse> result = this.getAllClient.execute();
            response = result.get();
        }catch (Exception e){
            log.error("Error in: ClientController.getAllClient()", e);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
