package com.lld.problems.dtos;

import com.lld.problems.models.Token;

public class IssueTokenResponseDTO {
    private Token token;
    private ResponseStatus requestStatus;
    private String failureMessage;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public ResponseStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(ResponseStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
