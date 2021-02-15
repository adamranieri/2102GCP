package dev.ranieri.app;

import com.google.gson.Gson;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class App {

    public static void main(String[] args) {

        Javalin app = Javalin.create();

        // handler functions (lambda)
        // context object respresents all the information from that http request
        // some additional methods for create a response
        Handler helloLambda = (Context ctx) ->{
            ctx.result("Hello world");
        };
        // saying the paramter is optional in a lambda
        Handler holaLambda = (ctx) ->{
            ctx.result("Hola");
        };

        // regardless of if you label it Context it is always a context object
        Handler greetLambda = (ctx) ->{
            String person = ctx.pathParam("name");
            ctx.result("Greetings " + person);
        };

        Handler addLambda = (ctx) ->{
            double num1 = Double.parseDouble(ctx.pathParam("num1"));
            double num2 = Double.parseDouble(ctx.pathParam("num2"));
            double sum = num1 + num2;
            ctx.result("The sum is " + sum);
        };

        Handler personLambda = (ctx) ->{
            String body = ctx.body();// this will get the body of an http request
            // Can be any string but in reality is 99% in JSON formatted string
            Gson gson = new Gson();
            Person person = gson.fromJson(body,Person.class); // parse that JSON body and create a Java object
            // based off of the information

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getProfession());
            ctx.result("You sent me this information " + body);
        };

        // define a uri path, lambda to execute when you make an http request to that path
        app.get("/hello",helloLambda);
        app.get("/hola",holaLambda);

        // taking in dynamic information via the uri path
        app.get("/greet/:name",greetLambda);

        app.get("/add/:num1/:num2",addLambda);

        // http get requests CANNOT hold a body
        app.post("/person",personLambda);

        app.start();
    }
}
