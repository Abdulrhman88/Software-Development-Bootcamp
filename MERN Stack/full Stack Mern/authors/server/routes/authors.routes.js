const authors = require('../controllers/authors.controllers');
module.exports = function(app){

 
    app.post('/create/authors', authors.createauthors);
    
    app.get('/authors', authors.getAllauthors);

    app.delete('/authors/delete/:id', authors.deletauthors);
    app.get(`/authors/:id`,authors.getauthors);
    app.put(`/authors/update/:id`,authors.updateauthors)

}