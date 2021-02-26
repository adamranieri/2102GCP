package dev.ranieri.controllers;

import dev.ranieri.utils.JwtUtil;
import io.javalin.http.Handler;

public class LoginController {

    public Handler loginHandler = (ctx) -> {
            String jwt = JwtUtil.generate("Manager","Anna Brown");
            ctx.result(jwt);
    };
}
