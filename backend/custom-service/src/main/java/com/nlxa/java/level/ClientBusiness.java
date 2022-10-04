package com.nlxa.java.level;

import com.nlxa.java.domain.Client;
import com.nlxa.java.dto.client.ClientListResponse;
import com.nlxa.java.dto.client.ClientResponse;
import com.nlxa.java.jpa.ClientJPAComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class ClientBusiness {
    private ClientJPAComponent clientJPAComponent;

    @Autowired
    public ClientBusiness(ClientJPAComponent clientJPAComponent){

        this.clientJPAComponent = clientJPAComponent;
    }

    public ClientListResponse getAllClient(){
        log.info("Call to: ClientBusiness.getAllClient()");
        ClientListResponse response = null;
        try{
            response = new ClientListResponse();
            List<Client> levels = this.clientJPAComponent.getAll();

            for(Client clientAux : levels){
                response.getClientResponseList().add(new ClientResponse(clientAux));
            }
        }catch (Exception e){
            log.error("Error in: ClientBusiness.getAllClient() -> Verify that the conection is correct");
        }
        return response;
    }

    //public ClientResponse getById(GetLevelByIdRequest request){
       // log.info("Call to: LevelBusiness.getAllLevels()");
        //ClientResponse response = null;
       // try{
          //  response = new ClientResponse(this.clientJPAComponent.getById(request.getId()));

       // }catch (Exception e){
         //   log.error("Error in: LevelBusiness.getAllLevels() -> Verify that the conection is correct");
        //}
        //return response;
   // }
}
