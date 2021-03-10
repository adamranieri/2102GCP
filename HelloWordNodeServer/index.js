const express = require("express")// in regular node.js you cannot import
// any JS code in the modules you want has to be loaded via the require function
const mathjs = require("mathjs")

const app = express();

app.get("/hello",(req,res)=>{
    res.send("Hello")
})

app.listen(3000,()=>{console.log("App up and running")});
