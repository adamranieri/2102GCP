package dev.ranieri.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtil {

    // never let anuone know your secret
    private static final String secret ="super secret string noone else should ever have";
    private static final Algorithm algorithm = Algorithm.HMAC256(secret);

    // put in the paramets that you want to be in the body of your jwe,
    public static String generate(String role, String employeeName){

        // builder deseign pattern
        String token = JWT.create()
                .withClaim("role",role) // add data to the payload
                .withClaim("empName",employeeName)
                .sign(algorithm); // this will generate a signture based off of those claims

        return  token;
    }

    public static DecodedJWT isValidJWT(String token){
            DecodedJWT jwt = JWT.require(algorithm).build().verify(token);
            return  jwt;
    }

}
