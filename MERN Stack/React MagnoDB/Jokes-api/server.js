const express = require("express");
const app = express();
const bodyParser = require('body-parser')
const router = require("./routes/jokesrout.js")
require("./configs/joeksConfigration") // Get all needed Configuration

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())
app.use("/",router);// Enable Routing

app.listen( 8000, () => console.log(`Listening on port: 9000`) );