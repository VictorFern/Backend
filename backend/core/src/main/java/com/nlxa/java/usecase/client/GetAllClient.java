package com.nlxa.java.usecase.client;
import com.nlxa.java.config.AsyncResponse;
import com.nlxa.java.dto.client.ClientListResponse;
import com.nlxa.java.level.ClientBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Slf4j
@Service

public class GetAllClient {
    private ClientBusiness clientBusiness;
    @Autowired
    public GetAllClient(ClientBusiness clientBusiness) {

        this.clientBusiness = clientBusiness;
    }

    @Async
    public Future<ClientListResponse> execute(){
        log.info("Call to: GetAllClient.execute()");
        AsyncResponse<ClientListResponse> response = null;
        try{
            response = new AsyncResponse<>(this.clientBusiness.getAllClient());
        }catch (Exception e){
            log.error("Error in: GetAllClient.execute() " , e);
        }
        return response;
    }
}
