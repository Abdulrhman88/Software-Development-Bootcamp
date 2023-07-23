const Proudcutcontroller = require('../controllers/proudcut.controller');
module.exports = function(app){

 
    app.post('/new/prodect', Proudcutcontroller.createprodect);
    app.get('/new/prodect', Proudcutcontroller.getAllProdect);
    app.get('/prodect/:id', Proudcutcontroller.getProdect);
    app.put('/prodect/update/:id', Proudcutcontroller.updateProdect);
    app.delete('/prodect/delete/:id', Proudcutcontroller.deletProdect);


}