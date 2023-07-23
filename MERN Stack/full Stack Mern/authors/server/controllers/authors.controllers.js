const { Authors } = require('../models/authors.models');



    // The method below is new
module.exports.createauthors= (request, response) => {
    const { name } = request.body;
    Authors.create({
        name
    })
        .then(Authors => response.json(Authors))
        .catch(err => response.status(400).json(err));
    }
module.exports.getAllauthors = (request, response) => {
    Authors.find({})
        .then(Authors=> response.json(Authors))
        .catch(err => response.json(err))
}
module.exports.deletauthors = (request, response) => {
    Authors.deleteOne({_id: request.params.id})
        .then(deleteConfirmation => response.json(deleteConfirmation))
        .catch(err => response.json(err))
}
module.exports.getauthors = (request, response) => {
    Authors.findOne({_id:request.params.id})
        .then(Authors => response.json(Authors))
        .catch(err => response.json(err))
}

module.exports.updateauthors = (request, response) => {
    Authors.updateOne({_id:request.params.id},request.body,{runValidators:true})
        .then(updateahtors => response.json(updateahtors))
        .catch(err => response.status(400).json(err));
    }