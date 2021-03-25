const express = require('express');
const cors = require('cors');
const ip = require('ip')

const app = express();
app.use(cors())

let counter = 0;

app.get('/hello', (req,res)=>{

    res.send('Hello!!! my IP address is ' + ip.address() + ' Requests Recieved ' + ++counter)
})

app.listen(3000,()=>{console.log("App started")});