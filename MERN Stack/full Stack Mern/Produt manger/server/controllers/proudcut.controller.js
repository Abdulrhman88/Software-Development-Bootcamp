const { Proudcut } = require('../models/proudcut.model');



    // The method below is new
module.exports.createprodect = (request, response) => {
    const { Title, Price,Description } = request.body;
    Proudcut.create({
        Title,
        Price,
        Description
    })
        .then(Proudcut => response.json(Proudcut))
        .catch(err => response.json(err));
}
module.exports.getAllProdect = (request, response) => {
    Proudcut.find({})
        .then(persons => response.json(persons))
        .catch(err => response.json(err))
}

module.exports.getProdect = (request, response) => {
    Proudcut.findOne({_id:request.params.id})
        .then(person => response.json(person))
        .catch(err => response.json(err))
}

module.exports.updateProdect = (request, response) => {
    Proudcut.findOneAndUpdate({_id:request.params.id},request.body, {new:true})
        .then(updateProdect => response.json(updateProdect))
        .catch(err => response.json(err))
}
module.exports.deletProdect = (request, response) => {
    Proudcut.deleteOne({_id: request.params.id})
        .then(deleteConfirmation => response.json(deleteConfirmation))
        .catch(err => response.json(err))
}

