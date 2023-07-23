const mongoose = require('mongoose');
const ProudcutSchema = new mongoose.Schema({
    Title: { type: String },
    Price: { type: Number },
    Description:{type:String}

}, { timestamps: true });

module.exports.Proudcut = mongoose.model('Proudcut', ProudcutSchema);