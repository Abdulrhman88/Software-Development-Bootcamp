const express = require('express');
const app = express();

require('./server/config/mongoose.config'); // This is new
// const cors=require('cors');
// app.use(cors());
app.use(express.json()); // This is new

const cors = require('cors');
const corsOptions ={
    origin:'http://localhost:3000', 
    credentials:true,            //access-control-allow-credentials:true
    optionSuccessStatus:200
}
app.use(cors(corsOptions));


// app.use((req,res,next)=>{
//     res.header('Access-Control-Allow-Headers, *, Access-Control-Allow-Origin', 'Origin, X-Requested-with, Content_Type,Accept,Authorization','http://localhost:4200');
//     if(req.method === 'OPTIONS') {
//         res.header('Access-Control-Allow-Methods','PUT,POST,PATCH,DELETE,GET');
//         return res.status(200).json({});
//     }
//     next();
// })
app.use(express.urlencoded({ extended: false })); // This is new
require('./server/routes/proudcut.routes')(app);
app.listen(8000, () => {
    console.log("Listening at Port 8000")
})