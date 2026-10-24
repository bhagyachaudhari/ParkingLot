package com.lld.problems.controllers;

import com.lld.problems.dtos.IssueTokenRequestDTO;
import com.lld.problems.dtos.IssueTokenResponseDTO;
import com.lld.problems.dtos.ResponseStatus;
import com.lld.problems.models.Token;
import com.lld.problems.services.TokenService;

public class TokenController {
    private TokenService tokenService;

    public TokenController(TokenService tokenService){
        this.tokenService = tokenService;
    }
    // DTO : Data transfer object
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO){
        // call the service
        IssueTokenResponseDTO response = new IssueTokenResponseDTO();
        try{
            Token token = tokenService.issueToken(
                    issueTokenRequestDTO.getGateId(),
                    issueTokenRequestDTO.getVehicleType(),
                    issueTokenRequestDTO.getVehicleNumber(),
                    issueTokenRequestDTO.getOwnerName()
            );
            response.setToken(token);
            response.setRequestStatus(ResponseStatus.SUCCESS);
        } catch(Exception ex){
            response.setRequestStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }

        return response;

    }
}

