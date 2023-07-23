const router = require("express").Router();
const JokesController = require("../controllers/jokescontrollers");


router.get("/api/jokes",JokesController.all)
router.get("/api/jokes/random",JokesController.random)
router.post("/api/jokes/new",JokesController.create)
router.get("/api/jokes/:_id",JokesController.find)
router.put("/api/jokes/update/:_id",JokesController.update)
router.delete("/api/jokes/delete/:_id",JokesController.delete)

module.exports = router;