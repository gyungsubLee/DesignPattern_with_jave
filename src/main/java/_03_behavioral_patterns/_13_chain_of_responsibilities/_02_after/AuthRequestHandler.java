package _03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import _03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("AuthRequestHandler.handle(): 인증 여부 확인");
        super.handle(request);
    }
}
