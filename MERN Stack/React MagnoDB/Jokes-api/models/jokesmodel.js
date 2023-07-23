const mongoose = require('mongoose');

const JokesSchema = mongoose.Schema({
    setup: {
        type:String,
        required:true,
    },
    punchline: {
        type:String,
        required: true,
    }
}, {timestamps: true}) //for createdAt and udateAt time 

const Jokes = mongoose.model("Jokes",JokesSchema); //"Jokes we will call in controllers with the funchtion "

module.exports = Jokes;