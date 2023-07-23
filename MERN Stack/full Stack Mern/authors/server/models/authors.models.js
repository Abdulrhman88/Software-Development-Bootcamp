const mongoose = require('mongoose');
const AuthorsSchema = new mongoose.Schema({
    name: { 
        type: String,
        required: [true, "name is required"],
		minlength:[3,"name min length is 3"]
     },
  

}, { timestamps: true });

module.exports.Authors = mongoose.model('Authors', AuthorsSchema);